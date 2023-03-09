package log4jpackage;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class ProperyFileConfiguratorExample {

	static	Logger logger=Logger.getLogger(ProperyFileConfiguratorExample.class);

	public static void main(String[] args) {



		PropertyConfigurator.configure("log4j.properties");
		logger.debug("This is debug message");
		logger.info("This is information message");
		logger.warn("This is warning message");
		logger.error("This is error message");
		logger.fatal("This is fatal message");
	}

}
