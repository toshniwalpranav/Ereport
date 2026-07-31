package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	private Properties prop;
	//Creates a variable named prop of type Properties.
	
	//this method is used to load the properties from config.properties file
	public Properties init_prop()
	{
		prop = new Properties();
		
		try {
		FileInputStream ip = new FileInputStream("./src/test/resources/config/config.properties");
		prop.load(ip);
		//This line reads the data from the properties file and stores it inside the Properties object (prop).
	
		}catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return prop;
	}

}
