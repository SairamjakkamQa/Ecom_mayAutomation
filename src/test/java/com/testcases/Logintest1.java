package com.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pom.LoginFunctionality;
import com.utils.Datasource;
import com.utils.Utils;

public class Logintest1 extends TestBase{
	LoginFunctionality LF;
	private final String sheetname = "Sheet1";
	
	@DataProvider
	public String[][] dataload() throws Throwable{
		return Datasource.Customerdata(sheetname);
		
	}
		
	public Logintest1() {
		super();   //invokes the parent class constructor
	}

	@BeforeMethod
	public void setup() {

		initialization();

		LF = new LoginFunctionality();

	}

	@Test(dataProvider = "dataload",dataProviderClass = Logintest1.class)

	public void loginvalidation(String username,String password) {
		LF.Loginverification();
		//String urltest = driver.getCurrentUrl();
		//Assert.assertEquals(urltest,"https://e-quarz.com/customer/auth/login");
		

	}

	@AfterMethod
	public void teardown() {
		 // extentreports.flush();
		//driver.close();

	}
	

}
