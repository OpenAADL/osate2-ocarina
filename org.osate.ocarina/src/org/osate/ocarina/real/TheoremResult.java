/*
* Use of the OSATE2-Ocarina plugin is subject to the terms of the license set forth
* at http://www.eclipse.org/legal/cpl-v10.html.
*
* Note: Contributions by user philip.alldredge@uah.edu were performed under contract W31P4Q-05-A-031 for the US Army. 
* These contributions are covered by US Government Unlimited Rights per DFARS 252.227-7014. You are entitled to use this software under the conditions of the Common Public License.
*/
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
