package com.sdet.utilities;

import java.io.IOException;

import org.testng.TestListenerAdapter;
import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;



public class Reporting extends TestListenerAdapter {
	
	
	
	    private static ExtentReports extent;

	    public static ExtentReports createInstance(String fileName) throws IOException {
	        ExtentSparkReporter reporter = new ExtentSparkReporter(fileName);
	        reporter.loadXMLConfig("extent-config.xml");

	        extent = new ExtentReports();
	        extent.attachReporter(reporter);
	        extent.setSystemInfo("OS", System.getProperty("os.name"));
	        extent.setSystemInfo("Environment", "QA");
	        extent.setSystemInfo("Tester", "Aravinth");

	        return extent;
	    }
	}

	





