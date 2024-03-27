package com.Utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class log {

	public static Logger logObject = Logger.getLogger("LogUtility");
	
	public static void info(String message)
	{
		PropertyConfigurator.configure("D:\\Jaava\\Eclipse Workspace\\Cucumber_FrameWork_OHRM\\Log4j.properties");
		logObject.info(message);
	}
	
	
}
