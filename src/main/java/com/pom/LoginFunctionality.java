package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class LoginFunctionality extends TestBase{
	@FindBy(id="si-email" )
	WebElement Email ;
@FindBy(id="si-password")
 WebElement password ;
@FindBy(xpath = "//button[normalize-space()='Sign in']")
WebElement Login;

public LoginFunctionality() {
	PageFactory.initElements(driver,this);
	}
public void Loginverification() {
	Email.sendKeys(prop.getProperty("username"));
	password.sendKeys(prop.getProperty("password"));
	Login.click();

}

}
