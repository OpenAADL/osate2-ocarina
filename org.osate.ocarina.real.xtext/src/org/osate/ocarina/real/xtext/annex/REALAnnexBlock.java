// Licensed under the Common Public License (CPL): http://www.eclipse.org/legal/cpl-v10.html
//
// Developed for the US Army under contract W31P4Q-05-AQ-0031
// This software is US Government Unlimited Rights per DFARS
// 252.227-7014.
//
package org.osate.ocarina.real.xtext.annex;

import org.osate.ocarina.real.xtext.real.Model;

// TODO: Setters should be part of interface?

public interface REALAnnexBlock
{	
	String getSourceText();
	
	Model getREALModel();
}
