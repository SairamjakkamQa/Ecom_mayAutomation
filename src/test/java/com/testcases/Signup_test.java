package com.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.base.TestBase;
import com.pom.Signup_Functionality;
import com.utils.*;

public class Signup_test extends TestBase {
	Signup_Functionality signup;

	//private final String sheetname1 ="Sheet1";

	public Signup_test() {
		super();
	}

//	@DataProvider
//
//	public String[][] dataload() throws Throwable {
//		return utils.Data(sheetname1);
//	}

	@BeforeMethod
	public void setup() {

		initialization();

		signup = new Signup_Functionality();

	}

	@Test()

	public void signupvalidation() throws Throwable {

		signup.Signup_Functionality();

		

	}

	@AfterMethod
	public void teardown() {

	}

}
