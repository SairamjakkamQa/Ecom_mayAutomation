package com.testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pom.LoginFunctionality;
import com.utils.Datasource;
import com.utils.Utils;





public class LoginTestButton extends TestBase{
	LoginFunctionality LF;
	private final String sheetname = "Sheet1";
	
	
		
	public LoginTestButton() {
		super();   //invokes the parent class constructor
	}
	
	@DataProvider
	public String[][] dataload() throws Throwable{
		return Datasource.Data(sheetname);
		
	}

	@BeforeMethod
	public void setup() {

		initialization();

		LF = new LoginFunctionality();

	}

	@Test(dataProvider = "dataload",dataProviderClass = LoginTestButton.class)

	public void loginvalidation(String username,String password) throws Throwable {
		LF.Loginverification(username,password);
		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "https://e-quarz.com/customer/auth/login");
		WebElement forgtpass=driver.findElement(By.xpath("//a[@class='font-size-sm']"));
		Assert.assertTrue(forgtpass.isDisplayed());
		

	}

	@AfterMethod
	public void teardown() {
		 // extentreports.flush();
		//driver.close();

	}
	

}
