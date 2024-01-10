package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class Signupworking extends TestBase{
	@FindBy(xpath = "//div[@class='navbar-tool-icon-box bg-secondary']//div[@class='navbar-tool-icon-box bg-secondary']")
	WebElement signup;
	@FindBy(xpath = "//a[@class='dropdown-item'][normalize-space()='Sign up']")
	WebElement signupwork;
	public Signupworking() {
		PageFactory.initElements(driver, this);
	}

	public void Loginverification() {
		
		//Email.sendKeys(prop.getProperty("username1"));
		//pass.sendKeys(prop.getProperty("password1"));
		signup.click();
		signupwork.click();

}

}
