package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pom.WishlistFunctionality;

public class WishlistTest extends TestBase {
	
	WishlistFunctionality wf;
	
	public WishlistTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		
		wf = new WishlistFunctionality();
	}
	
	@Test(priority = 1)
	public void wishlistandbuyvalidation() throws Throwable {
		wf.verifylogin();
		wf.verifywishlistandbuy();
		
		WebElement shopcart = driver.findElement(By.xpath("//h5[@class='font-black __text-20px']"));
		Assert.assertTrue(shopcart.isDisplayed());
		
		
	}
	
	@Test(priority = 2)
	public void removeproductvalidation() throws Throwable {
		wf.verifylogin();
		wf.verifyremoveproduct();
		
		WebElement nodata = driver.findElement(By.xpath("//h6[@class='text-muted']"));
		Assert.assertTrue(nodata.isDisplayed());
		
	}
	
	@Test(priority = 3)
	public void multipleproductsvalidation() throws Throwable {
		wf.verifylogin();
		wf.verifymultiplproducttowishlist();
		
		WebElement wishvalidation = driver.findElement(By.xpath("//h3[@class='headerTitle my-3 text-center']"));
		Assert.assertTrue(wishvalidation.isDisplayed());
		
		
	}
	
	@AfterMethod
	public void teardown() {
		
		driver.quit();
	}

}
