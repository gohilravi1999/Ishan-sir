package com.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Log4jExample {

	static
	{
		initialization();
	}
	
	private final static Logger logger = Logger.getLogger(Log4jExample.class);
	
	public static void main(String[] args) {

		logger.debug("My Debug Log");
		logger.info("My Info Log");
		logger.warn("My Warn Log");
		logger.error("My error log");
		logger.fatal("My fatal log");
		
		MathUtils.addition(4,5);
		MathUtils.addition(40,50);
		MathUtils.addition(1,5);
		
	}

	private static void initialization() {
		DOMConfigurator.configure("log4j.xml");
	}

}