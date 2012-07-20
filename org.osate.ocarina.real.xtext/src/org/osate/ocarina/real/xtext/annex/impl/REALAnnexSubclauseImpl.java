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
