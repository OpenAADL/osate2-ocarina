package org.osate.ocarina.actions;

import java.util.LinkedList;
import java.util.List;

import org.osate.ocarina.real.REALResultsParser;
import org.osate.ocarina.real.TheoremResult;

public class CheckREALTheoremsAction extends OcarinaAction {
	private REALResultsParser parser = new REALResultsParser();

	public CheckREALTheoremsAction() {
		super("Checking REAL Theorems", "real_theorem");
	}

	@Override
	protected void handleOcarinaResults() {
		// Parse the results
		List<TheoremResult> results = new LinkedList<TheoremResult>();
		for (String line : output()) {
			TheoremResult result = parser.process(line);
			if (result != null) {
				results.add(result);
			}
		}

		// TODO: Create/Update View, Create markers, etc
		// and theorem.
		out().println("REAL Results Summary");
		for (TheoremResult theorem : results) {
			out().println("\t" + theorem.name + " - " + theorem.result);
			for (TheoremResult.FalseInstance instance : theorem.falseInstances) {
				out().println("\t\t" + instance.sourceFile + ":" + instance.lineNumber + ":" + instance.characterNumber + ":" + instance.elementName);
			}
		}
	}
}
