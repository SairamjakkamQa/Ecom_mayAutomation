package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;

import com.pom.LoginData;

public class LoginTest extends TestBase {

	LoginData lf;

	public LoginTest() {
		super();   //invokes the parent class constructor
	}

	@BeforeMethod
	public void setup() {

		initialization();

		lf = new LoginData();

	}

	@Test

	public void loginvalidation() {
		lf.verifylogin();
		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "https://e-quarz.com/");
		

	}

	@AfterMethod
	public void teardown() {
		  //extentreports.flush();
		//driver.close();

	}
}

