/**
 * 
 */
package com.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author ramya
 *
 */
public class ApplicationProperties {

	private static final Properties prop = new Properties();
	private static final String strResource = "Application.properties";
	private static final Logger logger = Logger.getLogger(Logger.class.getName());
	private static final ApplicationProperties INSTANCE = new ApplicationProperties();
	
	/**
	 * 
	 */
	private ApplicationProperties() {
		// TODO Auto-generated constructor stub
	}
	
	public static ApplicationProperties getInstance() {
		logger.info("prop::::"+prop+" prop size:::"+prop.size());
		if(null!=prop && prop.size()==0) {
			setProperties();
		}
		return INSTANCE;
	}
	
	private static void setProperties() {
		try {
		logger.info(":::"+ApplicationProperties.class.getClassLoader().getResourceAsStream(strResource));
		InputStream is = ApplicationProperties.class.getClassLoader().getResourceAsStream(strResource);
		prop.load(is);
		}
		catch(IOException ioex) {
			logger.log(Level.SEVERE,"IOException occured:::::::::::");
		}
	}
	
	public Properties getProperties() {
		for(String str: prop.stringPropertyNames()) { //keys enums,keyset set of keys&values,elements enums,entryset setof entries,propertynames enums, stringpropertynames set of string)
			logger.log(Level.SEVERE,"Properties:::name:::"+str+" value:::"+prop.getProperty(str));
		}
		return prop;
	}
	
	public String getProperty(String propName) {
		if(null!=propName && null!=prop) {
			logger.info("propName::"+propName+" propValue:::"+prop.getProperty(propName));
			return prop.getProperty(propName);
		}
		return null;
	}
	
	public static void main(String[] args) {
		getInstance().getProperties();
		getInstance().getProperty("dbName");
		
	}
	
	
}
