package org.osate.ocarina.real;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REALResultsParser {
	private enum State {
		SCANNING_FOR_NAME, READING_RESULTS
	};

	private final Pattern propertyIsFalsePattern = Pattern
			.compile("([^:]+):([0-9]+):([0-9]+) Backends: error : Property is false for instance [0-9]+ \\((.+)\\)");
	private State state = State.SCANNING_FOR_NAME;
	private String theoremName;
	private List<TheoremResult.FalseInstance> falseInstances;
	private List<String> details;

	// Scan for instances where property is false.
	// Example ocarina output:
	// Backends: error : Property is false for instance 6 (cheddar.impl)

	// Returns a TheoremResult object when it finishes parsing a theorem block
	public TheoremResult process(String line) {
		TheoremResult retVal = null;
		String[] s;
		switch (state) {
		case SCANNING_FOR_NAME:
			s = line.split("Evaluating theorem ", 2);
			if (s.length == 2) {
				theoremName = s[1];
				details = new LinkedList<String>();
				falseInstances = new LinkedList<TheoremResult.FalseInstance>();
				state = State.READING_RESULTS;
			}
			break;

		case READING_RESULTS:
			// Check if the line contains an instance where the theorem is false
			Matcher m = propertyIsFalsePattern.matcher(line);
			while (m.find()) {
				falseInstances.add(new TheoremResult.FalseInstance(m.group(1),
						Integer.parseInt(m.group(2)), Integer.parseInt(m
								.group(3)), m.group(4)));
			}

			// Check for the end of the theorem result
			s = line.split("theorem " + theoremName + " is: ");
			if (s.length == 2) {
				boolean result = Boolean.parseBoolean(s[1]);
				retVal = new TheoremResult(theoremName, result, falseInstances,
						details);
				state = State.SCANNING_FOR_NAME;
			} else // Add the line to the theorem result details
			{
				details.add(line);
			}
			break;
		}

		return retVal;
	}
}
