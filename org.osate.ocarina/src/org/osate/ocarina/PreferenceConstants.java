package org.osate.ocarina;

/**
 * Constant definitions for plug-in preferences
 * @author hugues
 */
public class PreferenceConstants {

	// Eclipse-specific definitions
    public static final String PLUGIN_ID 		= "Ocarina";
    public static final String OCARINA_MARKER   = "OcarinaMarker";
	
	// GLobal variables for the plug-in
	public static final String OCARINA_PATH 	= "org.osate.ocarina.OcarinaPath";
	public static final String USE_AADLV2 		= "org.osate.ocarina.UseAADLv2";
	public static final String GENERATOR 		= "org.osate.ocarina.Generator";
	public static final String COMPILE_CODE   	= "org.osate.ocarina.Compile";
    
    // Generators available from Ocarina
    public static final String GENERATOR_POLYORB_HI_C 		= "polyorb_hi_c";
    public static final String GENERATOR_POLYORB_HI_ADA 	= "polyorb_hi_ada";
    public static final String GENERATOR_CHEDDAR			= "cheddar";
    public static final String GENERATOR_MAST				= "mast";
    public static final String GENERATOR_PETRI_NETS			= "petri_nets";
    public static final String GENERATOR_REAL				= "real_theorem";
    
    // External tools
    public static final String GCC_PATH     = "org.osate.ocarina.GCC";
    public static final String CHEDDAR_PATH = "org.osate.ocarina.CHEDDAR";
}
