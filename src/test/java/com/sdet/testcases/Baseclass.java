package com.sdet.testcases;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.sdet.utilities.ReadConfig;

public class Baseclass  {
	
	ReadConfig re = new ReadConfig();
	public String baseurl =re.getapplicationurl();
	public String username =re.getusername();
	public String password =re.getpassword();
	public static WebDriver driver;
	
public static Logger log;

	@BeforeClass
	
	public void setup () {
		System.setProperty("webdriver.chrome.driver", re.getchromepath());
		 driver = new ChromeDriver();
		 
		 log = Logger.getLogger("sdetEndtoEnd");
		 PropertyConfigurator.configure("lo4j.properties");
		 
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
	}

}
