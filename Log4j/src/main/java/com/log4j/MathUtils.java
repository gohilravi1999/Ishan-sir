package com.log4j;
import org.apache.log4j.Logger;

public class MathUtils {

	private static final Logger logger = Logger.getLogger(MathUtils.class);
	
	public static int addition(int number1, int number2)
	{
		logger.debug("inputs are:"+number1+", "+number2);
		return number1+number2;
	}
}