package org.osate.ocarina.handlers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.LinkedList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.osate.ocarina.PreferenceConstants;
import org.osate.ocarina.Utils;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.w3c.dom.bootstrap.DOMImplementationRegistry;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSOutput;
import org.w3c.dom.ls.LSSerializer;

public class LaunchCheddarHandler extends AbstractOcarinaHandler {
	public LaunchCheddarHandler() {
		super("Running Cheddar", "cheddar", false);
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		if(Utils.getCheddarPath() == null)
		{
			IWorkbench wb = PlatformUI.getWorkbench();
			IWorkbenchWindow window = wb.getActiveWorkbenchWindow();
			MessageDialog.openError(window.getShell(),
					PreferenceConstants.PLUGIN_ID,
					"Unable to find cheddar executable. Check the cheddar path in preferences.");
		}
		else
		{
			super.execute(event);
		}
		
		return null;
	}
	
	protected void handleOcarinaResults() {
		if(this.retVal() == 0) {
			// Process the XML file
			String cheddarProjectFilepath = this.getCheddarProjectFilepath();
	
			// TODO: Determine why this is needed. Not cleaning the XML causes problems with cheddar parsing the XML file
			processXmlFile(cheddarProjectFilepath);
	
			// Launch Cheddar
			try {
				launchCheddar(cheddarProjectFilepath, ocarinaWorkingDirectory());
			} catch (InterruptedException e) {
				throw new RuntimeException("Interrupted");
			}
		}
	}

	private void launchCheddar(String cheddarProjectFilepath,
			File workingDirectory) throws InterruptedException {
		// Build the command
		List<String> cmd = new LinkedList<String>();
		cmd.add(Utils.getCheddarPath());
		cmd.add(cheddarProjectFilepath);

		launchCommand(cmd, workingDirectory);
	}

	void processXmlFile(String filepath) {
		try {
			// Open document
			DocumentBuilderFactory docFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(filepath);

			// Process document
			processNode(doc);

			writeDocument(doc, filepath);
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	void processNode(Node node) {
		// Remove whitespace from beginning and end of text nodes
		if (node instanceof Text) {
			Text text = (Text) node;
			text.setData(text.getData().trim());
		} else {
			NodeList children = node.getChildNodes();
			for (int i = 0; i < children.getLength(); i++) {
				processNode(children.item(i));
			}
		}
	}

	// Based on Stack Overflow answer: http://stackoverflow.com/a/5154211
	private void writeDocument(Document doc, String filename)
			throws IOException {
		Writer writer = null;
		try {
			/*
			 * Could extract "ls" to an instance attribute, so it can be reused.
			 */
			DOMImplementationLS ls = (DOMImplementationLS) DOMImplementationRegistry
					.newInstance().getDOMImplementation("LS");
			writer = new OutputStreamWriter(new FileOutputStream(filename));
			LSOutput lsout = ls.createLSOutput();
			lsout.setCharacterStream(writer);
			/*
			 * If "doc" has been constructed by parsing an XML document, we
			 * should keep its encoding when serializing it; if it has been
			 * constructed in memory, its encoding has to be decided by the
			 * client code.
			 */
			lsout.setEncoding(doc.getXmlEncoding());
			LSSerializer serializer = ls.createLSSerializer();
			serializer.write(doc, lsout);
		} catch (Exception e) {
			throw new IOException(e);
		} finally {
			if (writer != null)
				writer.close();
		}
	}
}
