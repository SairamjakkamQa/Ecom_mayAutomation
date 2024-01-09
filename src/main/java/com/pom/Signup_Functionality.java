package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;

import com.base.TestBase;
import com.utils.utils;

public class Signup_Functionality extends TestBase {

	@FindBy(xpath = "//input[@name='f_name']")
	WebElement firstname;

	@FindBy(xpath = "//input[@name='l_name']")

	WebElement secondname;

	@FindBy(xpath = "//input[@name='email']")

	WebElement email;

	@FindBy(xpath = "//input[@name='phone']")

	WebElement phone;

	@FindBy(xpath = "//body/div[@class='container py-4 py-lg-5 my-4 __inline-7']/div[@class='row justify-content-center']/div[@class='col-md-8']/div[@class='card border-0 box-shadow']/div[@class='card-body']/form[@id='form-id']/div[@class='row']/div[5]/div[1]/div[1]/input[1]")

	WebElement Pwd;

	@FindBy(xpath = "//body/div[@class='container py-4 py-lg-5 my-4 __inline-7']/div[@class='row justify-content-center']/div[@class='col-md-8']/div[@class='card border-0 box-shadow']/div[@class='card-body']/form[@id='form-id']/div[@class='row']/div[6]/div[1]/div[1]/input[1]")

	WebElement cpwd;
	
	@FindBy(xpath = "//input[@id='inputCheckd']")
	WebElement inputCheckd;
	
	@FindBy(xpath="//button[@id='sign-up']")
	
	WebElement signupbtn;

	public Signup_Functionality() {
		PageFactory.initElements(driver, this);

	}

	public void Signup_Functionality() throws Throwable {

		Thread.sleep(2000);
		utils.clickElementWithJavascript(inputCheckd, driver);
		inputCheckd.click();
		Thread.sleep(2000);
		inputCheckd.click();
		Thread.sleep(2000);
		signupbtn.click();

	}
	// AssertMessages
//		public void AddInventory_AssertMessage() {
//
//			if (AssertJUnitEdit.isDisplayed()) {
//				System.out.println("AddInventory Element is displayed." + AssertJUnitEdit.getText());
//				AssertJUnit.assertTrue("AddInventory Element is displayed.", true);
//			
//			} else {
//				System.out.println("AddInventory Element is not displayed.");
//				AssertJUnit.fail("AddInventory Element is not displayed.");

	
	
	
	
	
	
	
	
	
	
}
