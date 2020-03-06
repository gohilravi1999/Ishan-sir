package com.LoggerExample.LoggerExample;

import java.io.*;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;


public class App 
{
	static 
	{
		init();
	}
	 private final static Logger logger = Logger.getLogger(App.class);
	 
	public static void copyFile()
	{
		try
		{
			File read =new File("C:\\Users\\ravi.gohil\\Desktop\\file1.txt");
    	    File write =new File("C:\\Users\\ravi.gohil\\Desktop\\file2.txt");
    	    
    	    FileInputStream input = new FileInputStream(read);
    	    FileOutputStream output = new FileOutputStream(write);
			
    	    int length;
    	    byte buffer[]=new byte[1024];
    	    
    	    while((length=input.read(buffer))>0)
    	    {
    	    	output.write(buffer);
    	    }
    	    logger.debug("Debug Successfully");
    	    input.close();
    	    output.close();
    	    System.out.println("File copied Successfully");
		}
		catch(IOException e)
		{
			
			logger.error("File is missing"+e);
		}
		
	}
	private static void init() {
		DOMConfigurator.configure("MyConfiguration.xml");
	}
	
    public static void main( String[] args )
    {
    	 App.copyFile();
      
    }
}
