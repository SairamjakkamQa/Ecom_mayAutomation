package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.tracing.Propagator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class Signup_Functionality extends TestBase {

	@FindBy(xpath = "//input[@name='f_name']")
	private WebElement firstname;

	@FindBy(xpath = "//input[@name='l_name']")
	private WebElement secondname;

	@FindBy(xpath = "//input[@name='email']")
	private WebElement email;

	@FindBy(xpath = "//input[@name='phone']")
	private WebElement phone;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;

	@FindBy(xpath = "//body/div[@class='container py-4 py-lg-5 my-4 __inline-7']/div[@class='row justify-content-center']/div[@class='col-md-8']/div[@class='card border-0 box-shadow']/div[@class='card-body']/form[@id='form-id']/div[@class='row']/div[6]/div[1]/div[1]/input[1]")
	private WebElement confirmPassword;

	@FindBy(xpath = "//input[@id='inputCheckd']")
	private WebElement inputCheckd;

	@FindBy(xpath = "//button[@id='sign-up']")
	private WebElement signupBtn;

	@FindBy(xpath = "//a[@class='btn btn-outline-primary']")
	private WebElement signInBtn;

	@FindBy(xpath = "//input[@id='si-email']")
	private WebElement emailSignIn;

	@FindBy(xpath = "//input[@id='si-password']")
	private WebElement passwordSignIn;

	@FindBy(xpath = "//button[normalize-space()='Sign in']")
	private WebElement signIn;

	public Signup_Functionality() {
		PageFactory.initElements(driver, this);
	}

	public void signupData(String firstName, String lastName, String userEmail, String userPhone, String userPassword,
			String confirmUserPassword) throws Throwable {

		firstname.sendKeys(firstName);
		Thread.sleep(1000);
		secondname.sendKeys(lastName);
		Thread.sleep(1000);
		email.sendKeys(userEmail);
		Thread.sleep(1000);
		phone.sendKeys(userPhone);
		Thread.sleep(1000);
		password.sendKeys(userPassword);
		Thread.sleep(1000);
		confirmPassword.sendKeys(confirmUserPassword);
		Thread.sleep(1000);
		inputCheckd.click();
		Thread.sleep(1000);
		signupBtn.click();
	
	}

	public void signup_Data_without_agree() throws Throwable {
		firstname.sendKeys(prop.getProperty("FirstName"));
		Thread.sleep(1000);
		secondname.sendKeys(prop.getProperty("LastName"));
		Thread.sleep(1000);
		email.sendKeys(prop.getProperty("EmailAddress"));
		Thread.sleep(1000);
		phone.sendKeys(prop.getProperty("PhoneNumber"));
		Thread.sleep(1000);
		password.sendKeys(prop.getProperty("Password"));
		Thread.sleep(1000);
		confirmPassword.sendKeys(prop.getProperty("ConfirmPassword"));
		Thread.sleep(1000);
		signupBtn.click();
		
	}

	public void signup_clicks_on_signup_without_providing_data() throws Throwable {

		inputCheckd.click();
		Thread.sleep(1000);
		signupBtn.click();
		
		

	}

	public void signup_navigate_to_sign_in_page_when_clicks_on_sign_in_button() throws Throwable {

		signInBtn.click();
		Thread.sleep(1000);
		emailSignIn.sendKeys(prop.getProperty("EmailAddress"));
		Thread.sleep(1000);
		passwordSignIn.sendKeys(prop.getProperty("Password"));
		Thread.sleep(1000);
		signIn.click();

	}

}
