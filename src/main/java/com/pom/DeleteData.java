package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class DeleteData extends TestBase {
	@FindBy(xpath = "//div[@class='navbar-tool-icon-box bg-secondary']//div[@class='navbar-tool-icon-box bg-secondary']//*[name()='svg']")
	WebElement show;
	@FindBy(xpath = "//a[normalize-space()='Sign in']")
	WebElement sign;
	@FindBy(id = "si-email")
	WebElement Email;
	@FindBy(id = "si-password")
	WebElement pass;
	
    @FindBy(xpath = "//button[normalize-space()='Sign in']")
	WebElement Login;
    
	@FindBy(xpath = "//img[@class='img-profile rounded-circle __inline-14']")
	WebElement view;
	@FindBy(xpath = "//a[normalize-space()='My profile']")
	WebElement myprofile;
	
	@FindBy(xpath = "//a[@class='btn btn-danger']")
	WebElement delete;
	@FindBy(xpath = "//button[normalize-space()='Yes']")
	WebElement deleteyes;

	public DeleteData() {
		PageFactory.initElements(driver, this);
	}

	public void Loginverification() {
		show.click();
		sign.click();
		Email.sendKeys(prop.getProperty("username4"));
		pass.sendKeys(prop.getProperty("password4"));
		Login.click();
		view.click();
		myprofile.click();

		delete.click();
		deleteyes.click();

}

	
}
