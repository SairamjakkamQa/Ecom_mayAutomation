package com.testcases;

import static org.testng.Assert.assertTrue;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v118.page.model.ScreencastFrame;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.github.dockerjava.api.model.Image;
import com.pom.DeleteData;
import com.utils.Utils;


public class DeleteDataFun extends TestBase {

	
	DeleteData lf;

	public DeleteDataFun() {
		super();   //invokes the parent class constructor
	}

	@BeforeMethod
	public void setup() {

		initialization();

		lf = new DeleteData();

	}

	@Test

	public void loginvalidation() throws Throwable {
		lf.Loginverification();
		//String urltest = driver.getCurrentUrl();
		//Assert.assertEquals(urltest, "https://e-quarz.com/");
		
		WebElement delete=driver.findElement(By.xpath("//div[@class='carousel-item active']//img[@class='d-block w-100 __slide-img']"));
		Utils.captureAndSaveScreenshot(driver, "C:\\Users\\ARUN\\git\\Ecom_mayAutomation\\target.png");
		System.out.println(delete.getScreenshotAs(OutputType.FILE));
		Assert.assertTrue(true, "sufsreenshot");
	}

	@AfterMethod
	public void teardown() {
		  //extentreports.flush();
		//driver.close();

	}
}



