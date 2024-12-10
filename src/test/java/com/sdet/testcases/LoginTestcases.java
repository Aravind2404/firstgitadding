package com.sdet.testcases;



import org.testng.Assert;
import org.testng.annotations.Test;


import com.sdetpageObjects.Loginpage;

public class LoginTestcases extends Baseclass {

	
	@Test
	
	public void Validlogintest() {
		driver.get(baseurl);
		
		driver.manage().window().maximize();
		
		log.info("url is launched");
		
		Loginpage lp= new Loginpage(driver);
		lp.username(username);
		log.info("Entered username");
		lp.password(password);
		
		log.info("entered password");
		lp.clickbutton();
		
     	System.out.println(driver.getTitle());
		
		if(driver.getTitle().equals("Jobseeker Dashboard")) {
			Assert.assertTrue(true);
			
			log.info("Login success");
		}
		else {
			Assert.assertTrue(false);
		}
	}
	
	
	
}
