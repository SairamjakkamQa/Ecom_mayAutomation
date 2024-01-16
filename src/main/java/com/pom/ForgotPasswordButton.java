package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class ForgotPasswordButton extends TestBase {
	@FindBy(xpath = "//div[@class='navbar-tool-icon-box bg-secondary']//div[@class='navbar-tool-icon-box bg-secondary']")
	WebElement view;
	@FindBy(xpath = "//a[normalize-space()='Sign in']")
	WebElement sigin;
	@FindBy(id="si-email")
	WebElement email;
	@FindBy(id = "si-email")
	WebElement Email;
	@FindBy(id = "si-password")
	WebElement pass;
	@FindBy(xpath="//a[@class='font-size-sm']")
	WebElement forpass;
	//@FindBy(xpath = "//button[normalize-space()='Sign in']")
	//WebElement Login;

	public ForgotPasswordButton() {
		PageFactory.initElements(driver, this);
	}

	public void Loginverification() {
		
		view.click();
		sigin.click();
		Email.sendKeys(prop.getProperty("username1"));
		pass.sendKeys(prop.getProperty("password1"));
		forpass.click();

}

	
}