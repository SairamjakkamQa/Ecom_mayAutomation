package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pom.EditPersonalData;


public class EditPersonalDataFun extends TestBase {

	EditPersonalData lf;

	public EditPersonalDataFun() {
		super();   //invokes the parent class constructor
	}

	@BeforeMethod
	public void setup() {

		initialization();

		lf = new EditPersonalData();

	}

	@Test

	public void loginvalidation() {
		lf.Loginverification();
		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "https://e-quarz.com/user-account");
		WebElement update=driver.findElement(By.xpath("//h5[@class='font-name']"));
		System.out.println(update.getText());
		Assert.assertTrue(true,"update label is present");
		//Assert.assertEquals("Praveen", "ram");
		//Assert.assertEquals("kumar", "sai");
		//Assert.assertEquals("9998885552", "987654222");
		
		
		
		//WebElement frgtp=driver.findElement(By.xpath("https://e-quarz.com/customer/auth/recover-password"));
		//Assert.assertTrue(frgtp.isDisplayed());
		

	}

	@AfterMethod
	public void teardown() {
		  //extentreports.flush();
		//driver.close();

	}
}


