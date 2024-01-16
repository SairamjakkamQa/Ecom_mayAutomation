package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class LoginData extends TestBase{
	@FindBy(xpath = "//div[@class='navbar-tool-icon-box bg-secondary']//div[@class='navbar-tool-icon-box bg-secondary']//*[name()='svg']")
	WebElement show;
	@FindBy(xpath = "//a[normalize-space()='Sign in']")
	WebElement sign;
	@FindBy(id="si-email")
	WebElement email;
	@FindBy(id="si-password")
	WebElement passord;
	@FindBy(xpath = "//button[normalize-space()='Sign in']")
	WebElement login;
	public LoginData() {
		PageFactory.initElements(driver, this);
		
	}
	public void verifylogin() {
		show.click();
		sign.click();
		email.sendKeys(prop.getProperty("username"));
		passord.sendKeys(prop.getProperty("password"));
		login.click();
	}
	
	

}
