package com.pom;



import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class Forgotp extends TestBase{
	@FindBy(xpath = "//div[@class='navbar-tool-icon-box bg-secondary']//div[@class='navbar-tool-icon-box bg-secondary']")
	WebElement view;
	@FindBy(xpath = "//a[normalize-space()='Sign in']")
	WebElement sigin;
	@FindBy(id="si-email")
	WebElement email;
	@FindBy(id="si-password")
	WebElement passord;
	@FindBy(xpath = "//a[@class='font-size-sm']")
	WebElement passwordlink;
	public Forgotp() {
		PageFactory.initElements(driver, this);
	}
	public void verifylogin() {
		email.sendKeys(prop.getProperty("username1"));
		passord.sendKeys(prop.getProperty("password1"));
		passwordlink.isDisplayed();
	}
		
	public void Setup() {
		assertTrue(passwordlink.isDisplayed());
	}
	public void Loginverification() {
		// TODO Auto-generated method stub
		
	}
	

}
