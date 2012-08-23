/*
* Use of the OSATE2-Ocarina plugin is subject to the terms of the license set forth
* at http://www.eclipse.org/legal/cpl-v10.html.
*
* Note: Contributions by user philip.alldredge@uah.edu were performed under contract W31P4Q-05-A-031 for the US Army. 
* These contributions are covered by US Government Unlimited Rights per DFARS 252.227-7014. You are entitled to use this software under the conditions of the Common Public License.
*/
package org.osate.ocarina.handlers;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import org.eclipse.core.resources.IFile;
import org.osate.ocarina.Utils;
import org.osate.ocarina.real.REALResultsParser;
import org.osate.ocarina.real.TheoremResult;
import org.osate.ocarina.views.REALResultsView;

public class CheckREALTheoremsHandler extends AbstractOcarinaHandler {
	public CheckREALTheoremsHandler() {
		super("Checking REAL Theorems", "real_theorem", false);
		this.setAutomaticallyShowConsole(false);
	}

	@Override
	protected void handleOcarinaResults() {
		REALResultsParser parser = new REALResultsParser();
		
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
	/*
			Utils.ocarinaDebug("REAL Results Summary");
			for (TheoremResult theorem : results) {
				printTheoremResult(theorem, "");
			}
		*/	
			// Open the console
			showConsole();
			
			// Open the REAL Results View if there are results, otherwise just show the console
			if(results.size() > 0) {
				REALResultsView.show(results);
			}
			
		} catch(RuntimeException e) {			
			REALResultsView.show(new LinkedList<TheoremResult>());
			
			throw e;
		}
		
	}
	
	// Test function
	/*
	private void printTheoremResult(TheoremResult theorem, String indention) {
		Utils.ocarinaDebug(indention + theorem.getName() + " - " + theorem.getResult());
		for (TheoremResult.FalseInstance instance : theorem.getFalseInstances()) {
			Utils.ocarinaDebug(indention + "\t" + instance.sourceFile + ":" + instance.lineNumber + ":" + instance.characterNumber + ":" + instance.elementName);
		}
		
		for(TheoremResult requirement : theorem.getRequirements()) {
			printTheoremResult(requirement, indention + "\t");
		}
	}
	*/
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
