package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class Loginfail extends TestBase {
	@FindBy(id = "si-email")
	WebElement Email;
	@FindBy(id = "si-password")
	WebElement pass;
	@FindBy(xpath="//a[@class='font-size-sm']")
	WebElement forpass;
	//@FindBy(xpath = "//button[normalize-space()='Sign in']")
	//WebElement Login;

	public Loginfail() {
		PageFactory.initElements(driver, this);
	}

	public void Loginverification() {
		
		Email.sendKeys(prop.getProperty("username1"));
		pass.sendKeys(prop.getProperty("password1"));
		forpass.click();

}

	
}