package org.osate.ocarina;

import java.io.File;
import java.net.URISyntaxException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.URIUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.osgi.service.datalocation.Location;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.MessageConsole;
import org.osgi.framework.BundleContext;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;

public class Utils {
	public static boolean useDebug = false;//true;
	
	public static void ocarinaDebug (String str)
	{
		if (useDebug)
		{
			System.out.println (str);
		}
	}
	/**
	 * Check that Ocarina is correctly installed
	 * @param window
	 * @return Return True is Ocarina is correctly installed
	 */
	public static boolean checkOcarina(IWorkbenchWindow window) {
		String ocarinaPath = getOcarinaExecutablePath();
		if (ocarinaPath == null) {
			MessageDialog.openInformation(window.getShell(),
					PreferenceConstants.PLUGIN_ID,
					"Path to Ocarina is not set up, update your preferences");
			return false;
		}
		return true;
	}
	
	/**
	 * 
	 * @return the path to the ocarina executable if it exists
	 */
	public static String getOcarinaExecutablePath() {
		return getExecutablePath(PreferencesValues.getOCARINA_PATH(), "ocarina"); 
	}
	
	public static String getMASTAnalysisExecutablePath() {
		return getExecutablePath(PreferencesValues.getMAST_PATH(), "mast_analysis");
	}
	
	// Returns the path to cheddar or null of it does not exist
	public static String getCheddarExecutablePath() {
		return getExecutablePath(PreferencesValues.getCHEDDAR_PATH(), "cheddar");
	}

	// Returns the path to cheddarlitev2 or cheddarlite or null of it does not exist
	public static String getCheddarliteExecutablePath() {
		String executablePath = getExecutablePath(PreferencesValues.getCHEDDAR_PATH(), "cheddarlitev2");
		return executablePath == null ? getExecutablePath(PreferencesValues.getCHEDDAR_PATH(), "cheddarlite") : executablePath; 
	}
	
	/**
	 * Helper function for retrieving a platform specific executable path.
	 * @param directoryPath the path to the directory that contains the executable. Must include the trailing slash. May be absolute or relative to the eclipse directory.
	 * @param executableName the name of the executable. Does not include an ".exe" extension on windows
	 * @return the path to the executable if it exists or null if it can not be found
	 */
	private static String getExecutablePath(final String directoryPath, final String executableName) {
		String executablePath = directoryPath;
		
		if (!isWindows()) {
			executablePath += executableName;
			
		} else {
			executablePath += executableName + ".exe";
		}
		
		// Try to evaluate a path as being relative to the eclipse installation directory
		File eclipseDirectory = getEclipseHome();
		if(eclipseDirectory != null) {
			File executableFile = new File(eclipseDirectory, executablePath);
			if(executableFile.isFile()) {
				return executableFile.toString();
			}
		}
			
		// Use the path as is
		return new File(executablePath).isFile() ? executablePath : null; 
	}
	
	/**
	 * Returns the file for the eclipse home directory.
	 * @return the file representing the directory or null if an error occurred
	 */
	private static File getEclipseHome() {
		BundleContext context = Activator.getDefault().getBundle().getBundleContext();
		try {
			for(ServiceReference<Location> ref : context.getServiceReferences(Location.class, Location.ECLIPSE_HOME_FILTER)) {
				Location location = context.getService(ref);
				if(location != null && location.isSet()) {
					return URIUtil.toFile(URIUtil.toURI(location.getURL())).getAbsoluteFile();
				}
			}
		} catch (InvalidSyntaxException e) {
		} catch (URISyntaxException e) {
		}
		
		return null;
	}
	
	public static int returnValue() {
		if (!isWindows())
			return 0;
		else
			return 2; // TODO
	}

	/**
	 * Return true if the execution platform is Windows
	 * @return True if the execution platform is Windows
	 */
	public static boolean isWindows() {
		String os = System.getProperty("os.name").toLowerCase();
		return (os.indexOf("win") >= 0);
	}

	/**
	 * Return a handle to a console for displaying status
	 * @param name name of the console
	 * @return a handle to a console
	 */
	public static MessageConsole findConsole(String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++)
			if (name.equals(existing[i].getName()))
				return (MessageConsole) existing[i];
		// No console found, so create a new one
		MessageConsole myConsole = new MessageConsole(name, null);
		conMan.addConsoles(new IConsole[]{myConsole});
		return myConsole;
	   }

	public static void showConsole(IConsole console) {
		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
		if (window != null) {
			IWorkbenchPage page = window.getActivePage();
			if (page != null) {
				try
				{
					IConsoleView view = (IConsoleView) page
							.showView(IConsoleConstants.ID_CONSOLE_VIEW);
					view.display(console);
				} catch (PartInitException e)
				{
					throw new RuntimeException(e);
				}
			}
		}
	}
	
	/**
	 * Find all files in the current workspace whose name matches a specified pattern
	 * @param namePattern is the pattern the name must match
	 * @return the list of files
	 */
	public static java.util.List<IFile> findFilesInWorkspaceByName(final java.util.regex.Pattern namePattern) {
		return findFilesByName(ResourcesPlugin.getWorkspace().getRoot(), namePattern, null);
	}
	
	/**
	 * Find all files in the current workspace whose name matches a specified pattern
	 * @param namePattern is the pattern the name must match
	 * @param files the list that matching files are added to. A list is created if null.
	 * @return the list of files
	 */
	public static java.util.List<IFile> findFilesInWorkspaceByName(final java.util.regex.Pattern namePattern, java.util.List<IFile> files) {
		return findFilesByName(ResourcesPlugin.getWorkspace().getRoot(), namePattern, files);
	}
	
	/**
	 * Find all children files of a specified container whose name matches a specified pattern
	 * @param parent
	 * @param namePattern is the pattern the name must match
	 * @param files the list that matching files are added to. A list is created if null.
	 * @return the list of files
	 */
	public static java.util.List<IFile> findFilesByName(final IContainer parent, final java.util.regex.Pattern namePattern, java.util.List<IFile> files) {
		// Create the list if it doesn't exist
		if(files == null)
		{
			files = new java.util.ArrayList<IFile>();
		}
			
		try
		{
			// Find files with names that match the specified pattern
			for(IResource member : parent.members())
			{
				if(member instanceof IContainer)
				{
					findFilesByName((IContainer)member, namePattern, files);
				}
				else if(member instanceof IFile)
				{
					String name = member.getName();
					if(namePattern.matcher(name).matches())
					{
						files.add((IFile)member);	
					}
				}
			}
		}
		catch(CoreException ex)
		{
			throw new RuntimeException(ex);
		}
		
		return files;
	}
	
	public static String getAbsoluteFilepath(IResource resource) {
		File file = resource.getLocation().toFile();
		
		return file.getAbsolutePath();
	}
}
