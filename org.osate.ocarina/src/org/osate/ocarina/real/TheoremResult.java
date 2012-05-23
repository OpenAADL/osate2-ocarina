package org.osate.ocarina.real;

import java.util.Collections;
import java.util.List;

public class TheoremResult {
	public TheoremResult(String name, boolean result,
			List<FalseInstance> falseInstances, List<String> details) {
		this.name = name;
		this.result = result;
		this.falseInstances = falseInstances;
		this.details = Collections.unmodifiableList(details);
	}

	public final String name;
	public final boolean result;
	public final List<FalseInstance> falseInstances; // The details of the
														// instances that causes
														// the theorem to be
														// false
	public final List<String> details;

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
