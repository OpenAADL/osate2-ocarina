// Licensed under the Common Public License (CPL): http://www.eclipse.org/legal/cpl-v10.html
//
// Developed for the US Army under contract W31P4Q-05-AQ-0031
// This software is US Government Unlimited Rights per DFARS
// 252.227-7014.
//
package org.osate.ocarina.real;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TheoremResult {
	String name;
	boolean result;
	List<FalseInstance> falseInstances = new LinkedList<TheoremResult.FalseInstance>(); // The details of the instances that causes the theorem to be false
	List<String> details = new LinkedList<String>();
	List<TheoremResult> requirements = new LinkedList<TheoremResult>();
	TheoremResult theoremRequiredBy;
	
	public String getName() { return this.name; }
	public boolean getResult() { return this.result; }
	public List<FalseInstance> getFalseInstances() { return Collections.unmodifiableList(falseInstances); }
	public List<String> getDetails() { return Collections.unmodifiableList(details); }
	public List<TheoremResult> getRequirements() { return Collections.unmodifiableList(requirements); }
	public TheoremResult getTheoremRequiredBy() { return this.theoremRequiredBy; }

	public static class FalseInstance {
		public FalseInstance(String sourceFile, int lineNumber,
				int characterNumber, String elementName) {
			this.sourceFile = sourceFile;
			this.lineNumber = lineNumber;
			this.characterNumber = characterNumber;
			this.elementName = elementName;
		}

		public final String sourceFile;
		public final int lineNumber;
		public final int characterNumber;
		public final String elementName;
	}
}
