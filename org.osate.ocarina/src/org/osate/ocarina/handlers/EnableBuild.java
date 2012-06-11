package org.osate.ocarina.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.handlers.HandlerUtil;
import org.osate.ocarina.Utils;

public class EnableBuild extends AbstractHandler {

	public static boolean buildEnabled = false;
	
	public Object execute(ExecutionEvent event) throws ExecutionException {
	     Command command = event.getCommand(); 
	     boolean oldValue = HandlerUtil.toggleCommandState(command); 
	    
	     // use the old value and perform the operation 
	     buildEnabled = ! oldValue;
	     if (buildEnabled)
	     {
	    	 Utils.ocarinaDebug ("Build enabled");
	     }
	     else
	     {
	    	 Utils.ocarinaDebug ("Build disabled");
	     }
	    return null;
	}


}
