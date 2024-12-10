package com.sdet.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	public ReadConfig() {
		File src = new File("C:\\Users\\admin\\eclipse-workspace\\workspace\\sdetEndtoEnd\\configuration\\config.properties");
		try{
			FileInputStream fis = new FileInputStream(src);
			 pro = new Properties();
			pro.load(fis);
		}catch(Exception e) {
			System.out.println("Exception is" + e.getMessage());
		}
	}

	
	public String getapplicationurl() {
	             String	url=pro.getProperty("baseurl");
		return url;
		
	}
	public String getusername() {
		String uname = pro.getProperty("username");
		return uname;
	}
	
	public String getpassword() {
		String pass = pro.getProperty("password");
		return pass;
	}
	public String getchromepath() {
		String chrome = pro.getProperty("chromepath");
		return chrome;
	}
	
}