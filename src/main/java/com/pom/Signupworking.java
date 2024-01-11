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
	@FindBy(xpath = "//input[@name='f_name']")
	WebElement name;
	@FindBy(xpath = "//input[@name='l_name']")
	WebElement lname;
	@FindBy(xpath = "//input[@name='email']")
	WebElement mail;
	@FindBy(xpath = "//input[@name='phone']")
	WebElement phonenumber;
	@FindBy(id = "si-password")
	WebElement pass;
	@FindBy(name = "con_password")
	WebElement cpass;
	@FindBy(xpath = "//input[@id='inputCheckd']")
	WebElement tick;
	@FindBy(id = "sign-up")
	WebElement sig;
	public Signupworking() {
		PageFactory.initElements(driver, this);
	}

	public void Loginverification() {
		
		//Email.sendKeys(prop.getProperty("username1"));
		//pass.sendKeys(prop.getProperty("password1"));
		signup.click();
		signupwork.click();
		name.sendKeys(prop.getProperty("firstname"));
		lname.sendKeys(prop.getProperty("lastname"));
		mail.sendKeys(prop.getProperty("eamiaddres"));
		phonenumber.sendKeys(prop.getProperty("phonenumber"));
		pass.sendKeys(prop.getProperty("password2"));
		cpass.sendKeys(prop.getProperty("conformpassword"));
		tick.click();
		sig.click();

}

}
