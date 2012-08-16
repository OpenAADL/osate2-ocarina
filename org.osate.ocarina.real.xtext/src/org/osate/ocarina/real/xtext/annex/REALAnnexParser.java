// Licensed under the Common Public License (CPL): http://www.eclipse.org/legal/cpl-v10.html
//
// Developed for the US Army under contract W31P4Q-05-AQ-0031
// This software is US Government Unlimited Rights per DFARS
// 252.227-7014.
//
package org.osate.ocarina.real.xtext.annex;

import java.io.StringReader;

import org.eclipse.emf.ecore.EObject;
//import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;
import org.osate.aadl2.AnnexLibrary;
import org.osate.aadl2.AnnexSubclause;
import org.osate.aadl2.modelsupport.errorreporting.ParseErrorReporter;
import org.osate.annexsupport.AnnexParser;
import antlr.RecognitionException;
import com.google.inject.Injector;
import org.osate.ocarina.real.xtext.REALStandaloneSetupGenerated;
import org.osate.ocarina.real.xtext.annex.impl.REALAnnexLibraryImpl;
import org.osate.ocarina.real.xtext.annex.impl.REALAnnexSubclauseImpl;
import org.osate.ocarina.real.xtext.real.Model;

public class REALAnnexParser implements AnnexParser
{
	@Override
	public AnnexLibrary parseAnnexLibrary(String annexName, String source, String filename, int line, int column, ParseErrorReporter errReporter) throws RecognitionException
	{	
		REALAnnexLibraryImpl library = new REALAnnexLibraryImpl();
		library.setSourceText(source);
		library.setREALModel(parse(source));

		return library;
	}

	@Override
	public AnnexSubclause parseAnnexSubclause(String annexName, String source, String filename, int line, int column, ParseErrorReporter errReporter) throws RecognitionException
	{
		REALAnnexSubclauseImpl subclause = new REALAnnexSubclauseImpl();
		subclause.setSourceText(source);
		subclause.setREALModel(parse(source));
		
		return subclause;
	}

	// TODO: Error reporting
	private Model parse(String source)
	{
		Injector injector = new REALStandaloneSetupGenerated().createInjector();
		IParser parser = injector.getInstance(IParser.class);
		IParseResult result = parser.parse(new StringReader(source));
		//Iterable<INode> errors = result.getSyntaxErrors();
		EObject eRoot = result.getRootASTElement();
		if(eRoot == null)
		{
			return null;
		}
		return (Model)eRoot;
	}
}
