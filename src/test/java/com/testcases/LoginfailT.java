package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pom.LoginData;
import com.pom.Loginfail;

public class LoginfailT extends TestBase {

	Loginfail lf;

	public LoginfailT() {
		super();   //invokes the parent class constructor
	}

	@BeforeMethod
	public void setup() {

		initialization();

		lf = new Loginfail();

	}

	@Test

	public void loginvalidation() {
		lf.Loginverification();
		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "https://e-quarz.com/customer/auth/recover-password");
		
		
		
		//WebElement frgtp=driver.findElement(By.xpath("https://e-quarz.com/customer/auth/recover-password"));
		//Assert.assertTrue(frgtp.isDisplayed());
		

	}

	@AfterMethod
	public void teardown() {
		  //extentreports.flush();
		//driver.close();

	}
}


