/*
 * Use of the OSATE2-Ocarina plugin is subject to the terms of the license set forth
 * at http://www.eclipse.org/legal/cpl-v10.html.
 *
 * Note: Contributions by user philip.alldredge@uah.edu were performed under contract W31P4Q-05-A-031 for the US Army. 
 * These contributions are covered by US Government Unlimited Rights per DFARS 252.227-7014. You are entitled to use this software under the conditions of the Common Public License.
 */
package org.osate.ocarina.handlers;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

/**
 * Generic handler for launching ocarina with a generator passed in as a parameter
 * @author philip
 *
 */
public class LaunchOcarinaHandler extends AbstractOcarinaHandler {

	public LaunchOcarinaHandler() {
		super("Running Ocarina", null, true);
	}

	@Override
	public Object execute(ExecutionEvent e) throws ExecutionException {
		String generator = e.getParameter("org.osate.ocarina.commands.launchocarina.generator");
		String generatorOptions = e.getParameter("org.osate.ocarina.commands.launchocarina.generator_options");

		if (generator == null) {
			throw new RuntimeException("Unable to retrive generator argument");
		}

		this.setGenerator(generator);

		if (generatorOptions != null) {
			String[] options = generatorOptions.split(",");
			for (String opt : options) {
				this.addGeneratorOption(opt);
			}
		}

		return super.execute(e);
	}
}
