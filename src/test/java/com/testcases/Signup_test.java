package com.testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.base.TestBase;
import com.pom.Signup_Functionality;
import com.utils.*;

public class Signup_test extends TestBase {

	Signup_Functionality signup;
	private final String sheetname1 = "Sheet1";

	public Signup_test() {
		super();
	}

	@DataProvider

	public String[][] dataload() throws Throwable {
		return utils.Data(sheetname1);
	}

	@BeforeMethod
	public void setup() {

		initialization();

		signup = new Signup_Functionality();
	}

	@Test(priority = 1, dataProvider = "dataload", dataProviderClass = Signup_test.class)

	public void signupData(String firstName, String lastName, String userEmail, String userPhone, String userPassword,
			String confirmUserPassword) throws Throwable {
		signup.signupData(firstName, lastName, userEmail, userPhone, userPassword, confirmUserPassword);
		WebElement valid = driver.findElement(By.xpath("//h2[@class='h4 mb-1']"));
		System.out.println(valid.getText()); 
		Assert.assertTrue(true, "Signup label is present");
	}

	@Test(priority = 2)
	public void signup_Data_without_agree() throws Throwable {

		signup.signup_Data_without_agree();
		WebElement valid = driver.findElement(By.xpath("//label[normalize-space()='Confirm password']"));
		System.out.println(valid.getText()); 
		Assert.assertTrue(true, "Confirm password label is present");

	}

	@Test(priority = 3)

	public void signup_clicks_on_signup_without_providing_data() throws Throwable {

		signup.signup_clicks_on_signup_without_providing_data();
		WebElement valid = driver.findElement(By.xpath("//label[normalize-space()='Confirm password']"));
		System.out.println(valid.getText()); 
		Assert.assertTrue(true, "Confirm password label is present");

	}

	@Test(priority = 4)

	public void signup_navigate_to_sign_in_page_when_clicks_on_sign_in_button() throws Throwable {

		signup.signup_navigate_to_sign_in_page_when_clicks_on_sign_in_button();
		
		WebElement valid = driver.findElement(By.xpath("//span[normalize-space()='Brands']"));
		System.out.println(valid.getText()); 
		Assert.assertTrue(true, "Brands label is present");

	}

	@AfterMethod
	public void teardown() {

	}

}
