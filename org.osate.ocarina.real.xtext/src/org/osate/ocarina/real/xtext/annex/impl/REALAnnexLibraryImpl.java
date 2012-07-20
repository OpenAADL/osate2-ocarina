package org.osate.ocarina.real.xtext.annex.impl;

import org.osate.ocarina.real.xtext.annex.REALAnnexLibrary;
import org.osate.ocarina.real.xtext.real.Model;

public class REALAnnexLibraryImpl extends org.osate.aadl2.impl.DefaultAnnexLibraryImpl implements REALAnnexLibrary
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
