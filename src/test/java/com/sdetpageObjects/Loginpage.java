package com.sdetpageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	WebDriver ldriver;
	
	public Loginpage (WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements( rdriver,this);
	}
	
	@FindBy(xpath ="//input[@id='emailAddressInput']")
	WebElement username;
	
	@FindBy(xpath ="//input[@id='passwordInput']")
	WebElement password;
	
	@FindBy(xpath ="//button[@id='btnSubmit']")
	WebElement Loginbutton;

	public void username(String uname) {
		username.sendKeys(uname);
	}
	
	public void  password (String pass) {
		password.sendKeys(pass);
	}
	
	public void clickbutton() {
		Loginbutton.click();
	}
	

}
