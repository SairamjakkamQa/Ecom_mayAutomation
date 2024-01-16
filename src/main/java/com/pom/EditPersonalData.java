package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class EditPersonalData extends TestBase {
	@FindBy(xpath = "//div[@class='navbar-tool-icon-box bg-secondary']//div[@class='navbar-tool-icon-box bg-secondary']//*[name()='svg']")
	WebElement show;
	@FindBy(xpath = "//a[normalize-space()='Sign up']")
	WebElement sigup;
	@FindBy(xpath = "//input[@name='f_name']")
	WebElement fname;
	@FindBy(xpath = "//input[@name='f_name']")
	WebElement lname;
	@FindBy(xpath = "//input[@name='email']")
	WebElement emailsid;
	@FindBy(xpath = "//input[@name='phone']")
	WebElement pnumbersig;
	@FindBy(xpath = "//body/div[@class='container py-4 py-lg-5 my-4 __inline-7']/div[@class='row justify-content-center']/div[@class='col-md-8']/div[@class='card border-0 box-shadow']/div[@class='card-body']/form[@id='form-id']/div[@class='row']/div[5]/div[1]/div[1]/input[1]")
	WebElement passwordsigup;
	@FindBy(xpath = "//body/div[@class='container py-4 py-lg-5 my-4 __inline-7']/div[@class='row justify-content-center']/div[@class='col-md-8']/div[@class='card border-0 box-shadow']/div[@class='card-body']/form[@id='form-id']/div[@class='row']/div[6]/div[1]/div[1]/input[1]")
	WebElement cmpasswordsigup;
	@FindBy(id = "inputCheckd")
	WebElement tick;
	@FindBy(id = "sign-up")
	WebElement sup;  //signup for this
	
	
	@FindBy(id = "si-email")
	WebElement Email;
	@FindBy(id = "si-password")
	WebElement pass;
	
    @FindBy(xpath = "//button[normalize-space()='Sign in']")
	WebElement Login;  //login for this
    
	@FindBy(xpath = "//img[@class='img-profile rounded-circle __inline-14']")
	WebElement view;
	@FindBy(xpath = "//a[normalize-space()='My profile']")
	WebElement myprofile;
	
	@FindBy(xpath = "//input[@name='f_name']")
	WebElement fname1;
	@FindBy(xpath = "//input[@name='f_name']")
	WebElement lname1;
	
	@FindBy(id = "f_name")
	WebElement firstname;
	@FindBy(id = "l_name")
	WebElement lastname;
	@FindBy(id = "phone")
	WebElement PNumber;
	@FindBy(id = "password")
	WebElement changepassword;
	@FindBy(id = "confirm_password")
	WebElement conformpass;
	@FindBy(xpath = "//button[normalize-space()='Update']")
	WebElement update;  //edit details for this

	public EditPersonalData() {
		PageFactory.initElements(driver, this);
	}

	public void Loginverification() {
		
		show.click();
		sigup.click();
		fname.sendKeys(prop.getProperty("firstnameSig"));
		lname.sendKeys(prop.getProperty("lastnameSig"));
		emailsid.sendKeys(prop.getProperty("emailid"));
		pnumbersig.sendKeys(prop.getProperty("pnumberforsigup"));
		passwordsigup.sendKeys(prop.getProperty("pword"));
		cmpasswordsigup.sendKeys(prop.getProperty("cpword"));
		tick.click();
		sup.click();
		Email.sendKeys(prop.getProperty("username3"));
		pass.sendKeys(prop.getProperty("password3"));
		Login.click();
		view.click();
		myprofile.click();
		
		fname1.clear();
		lname.clear();
		firstname.sendKeys(prop.getProperty("firstname1"));
		lastname.sendKeys(prop.getProperty("lastname1"));
		PNumber.sendKeys(prop.getProperty("number"));
		changepassword.sendKeys(prop.getProperty("posswordChange"));
		conformpass.sendKeys(prop.getProperty("conposswordChange"));
		update.click();

}

	
}
