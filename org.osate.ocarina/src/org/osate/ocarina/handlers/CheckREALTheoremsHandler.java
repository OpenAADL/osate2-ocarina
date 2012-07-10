package org.osate.ocarina.handlers;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.osate.ocarina.Utils;
import org.osate.ocarina.real.REALResultsParser;
import org.osate.ocarina.real.TheoremResult;

public class CheckREALTheoremsHandler extends AbstractOcarinaHandler {
	private REALResultsParser parser = new REALResultsParser();

	public CheckREALTheoremsHandler() {
		super("Checking REAL Theorems", "real_theorem", false);
	}

	@Override
	protected void handleOcarinaResults() {
		try {
			// Parse the results
			List<TheoremResult> results = new LinkedList<TheoremResult>();
			{
				for (String line : output()) {
					TheoremResult result = parser.process(line);
					if (result != null) {
						results.add(result);
					}
				}
				TheoremResult result = parser.processEOF();
				if(result != null) results.add(result);
			}
		
	
			// TODO: Create/Update View, Create markers, etc and theorem.
			Utils.ocarinaDebug("REAL Results Summary");
			for (TheoremResult theorem : results) {
				printTheoremResult(theorem, "");
			}
		} catch(RuntimeException e) {
			// Do not catch this exception when parsing/visualization of REAL output is complete
			Utils.ocarinaDebug("Error parsing results: " + e.getMessage());
		}
		
	}
	
	// Test function
	private void printTheoremResult(TheoremResult theorem, String indention) {
		Utils.ocarinaDebug(indention + theorem.getName() + " - " + theorem.getResult());
		for (TheoremResult.FalseInstance instance : theorem.getFalseInstances()) {
			Utils.ocarinaDebug(indention + "\t" + instance.sourceFile + ":" + instance.lineNumber + ":" + instance.characterNumber + ":" + instance.elementName);
		}
		
		for(TheoremResult requirement : theorem.getRequirements()) {
			printTheoremResult(requirement, indention + "\t");
		}
	}
	
	@Override
	protected List<String> getOcarinaArguments() {
		List<String> args = super.getOcarinaArguments();
		
		args.add(0, "-real_continue_eval");
		for(IFile file : Utils.findFilesInWorkspaceByName(Pattern.compile(".+\\.real", Pattern.CASE_INSENSITIVE))) {
			args.add(1, "-real_lib");
			args.add(2, Utils.getAbsoluteFilepath(file));
		}
		
		return args;
	}
}
