// Licensed under the Common Public License (CPL): http://www.eclipse.org/legal/cpl-v10.html
//
// Developed for the US Army under contract W31P4Q-05-AQ-0031
// This software is US Government Unlimited Rights per DFARS
// 252.227-7014.
//
package org.osate.ocarina.real.xtext.annex.impl;

import org.osate.ocarina.real.xtext.annex.REALAnnexSubclause;
import org.osate.ocarina.real.xtext.real.Model;

public class REALAnnexSubclauseImpl extends org.osate.aadl2.impl.DefaultAnnexSubclauseImpl implements REALAnnexSubclause
{
	private Model realModel;
	
	public Model getREALModel()
	{
		return realModel;
	}
	
	public void setREALModel(Model value)
	{
		realModel = value;
	}
}
