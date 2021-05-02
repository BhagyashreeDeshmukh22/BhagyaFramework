package com.learnautomation.utility;

import java.io.*;
import java.util.Properties;

public class configDataProvider {

	Properties pro;
	public configDataProvider()
	{
		File src=new File("./Cofiguration/config.properties");
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("File not loading"+e.getMessage());
		}
		
		
	}
	public String getBrowser()
	{
		return pro.getProperty("Browser1");
		
	}
	public String getStartUpURL()
	{
		return pro.getProperty("StartAppUrl");
	}
	public String getDataFrmConfig(String key)
	{
		return pro.getProperty(key);
	}
}
