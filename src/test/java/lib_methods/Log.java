package lib_methods;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log {
	
	public Logger logger;
	
	public Log(){
		
		logger = Logger.getLogger(getClass());
		PropertyConfigurator.configure("E:\\Siddhartha\\Automation Project Backup\\com.Makemymeal_\\log\\log4j.properties");

	}
	
	public void tracelog(String message){
	logger.info(message);

	}

}
