package com.testcases;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.base.TestBase;
import com.pom.HomepageFunctionality;
import com.utils.*;

public class HomepageTest extends TestBase {

	HomepageFunctionality hf;

	public HomepageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();

		hf = new HomepageFunctionality();

	}

	@Test(priority = 1)
	public void buynowvalidation() throws Throwable {
		hf.verifybuynow();

		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest,
				"https://e-quarz.com/product/at-home-by-nilkamal-matt-1-seater-fabric-manual-recliner-with-cup-holder-cocoa-1-year-warranty-self-assembly-DKY3FJ");
		;
		driver.navigate().back();

	}

	@Test(priority = 2)
	public void FeaturedProductsvalidation() throws Throwable {
		hf.VerifyFeaturedProducts();

		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "https://e-quarz.com/products?data_from=featured&page=1");
		driver.navigate().back();
	}

	@Test(priority = 3)
	public void LatestProductsvalidation() throws Throwable {
		hf.VerifyLatestProducts();

		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "https://e-quarz.com/products?data_from=latest&page=1");
		driver.navigate().back();
	}

	@Test(priority = 4)
	public void BestSellingProductsvalidation() throws Throwable {
		hf.VerifyBestSellingProducts();

		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "https://e-quarz.com/products?data_from=best-selling&page=1");
		driver.navigate().back();
	}

	@Test(priority = 5)
	public void TopRatedProductsvalidation() throws Throwable {
		hf.VerifyTopRatedProducts();

		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "https://e-quarz.com/products?data_from=top-rated&page=1");
		driver.navigate().back();
	}

	@Test(priority = 6)
	public void ProfileInfovalidation() throws Throwable {
		hf.VerifyProfileInfo();

		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "https://e-quarz.com/customer/auth/login");
		driver.navigate().back();
	}

	@Test(priority = 7)
	public void WishListWishListvalidation() throws Throwable {
		hf.VerifyWishList();

		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "https://e-quarz.com/customer/auth/login");
		driver.navigate().back();
	}

	@Test(priority = 8)
	public void TracOrdervalidation() throws Throwable {
		hf.VerifyTracOrder();

		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "https://e-quarz.com/track-order");
		driver.navigate().back();
	}

	@Test(priority = 9)
	public void Refundpolicyvalidation() throws Throwable {
		hf.VerifyRefundpolicy();

		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "https://e-quarz.com/refund-policy");
		driver.navigate().back();
	}

	@Test(priority = 10)
	public void Returnpolicyvalidation() throws Throwable {
		hf.VerifyReturnpolicy();

		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "https://e-quarz.com/return-policy");
		driver.navigate().back();
	}

	@Test(priority = 11)
	public void Cancellationpolicyvalidation() throws Throwable {
		hf.VerifyCancellationpolicy();

		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "https://e-quarz.com/cancellation-policy");
		driver.navigate().back();
	}

	@Test(priority = 12)
	public void emailvalidation() throws Throwable {
		hf.Verifyemail();

//		WebElement email1=driver.findElement(By.xpath("//span[normalize-space()='info@equarz.com']"));
//		Assert.assertTrue(email1.isDisplayed())	;

	}

	@Test(priority = 13)
	public void supportticketvalidation() throws Throwable {
		hf.VerifysuppotTicket();

		String titletest = driver.getTitle();
		Assert.assertEquals(titletest, "Login");
		driver.navigate().back();
	}

	@Test(priority = 14)
	public void twittervalidation() throws Throwable {
		hf.Verifytwitter();

		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "https://twitter.com/i/flow/login?redirect_after_login=%2F%3Flang%3Den-in");
		driver.close();

	}

	@Test(priority = 15)
	public void linkedinvalidation() throws Throwable {
		hf.Verifylinkedin();

		WebElement linkin = driver.findElement(By.xpath("//li-icon[@aria-label='LinkedIn']//*[name()='svg']"));
		Assert.assertTrue(linkin.isDisplayed());
		driver.close();

	}

	@Test(priority = 16)
	public void googlevalidation() throws Throwable {
		hf.Verifygoogle();

		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "https://www.marolix.com/");
		driver.close();
		Thread.sleep(5000);

	}

	@Test(priority = 17)
	public void pinterestvalidation() throws Throwable {
		hf.Verifypinterest();

		WebElement linkin = driver.findElement(By.xpath("//img[@alt='User Avatar']"));
		Assert.assertTrue(linkin.isDisplayed());
		driver.close();
		Thread.sleep(5000);

	}

	@Test(priority = 18)
	public void instagramvalidation() throws Throwable {
		hf.Verifyinstagram();

		WebElement linkin = driver.findElement(By.xpath("//i[@aria-label='Instagram']"));
		Assert.assertTrue(linkin.isDisplayed());
		driver.close();
		Thread.sleep(5000);

	}

	@Test(priority = 19)
	public void facebookvalidation() throws Throwable {
		hf.Verifyfacebook();

		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "https://www.facebook.com/");
		driver.close();

	}
	
	@Test (priority = 20)
	public void subscribebuttonvalidation() throws Throwable {
		hf.verifysubsribebutton();
	}
	
	@Test (priority = 21)
	public void termconditionvalidations() throws Throwable {
		hf.verifytermconditions();
	}
	
	@Test (priority = 22)
	public void privacypolicyvalidation() throws Throwable {
		hf.verifyprivacypolicy();
	}
	
	@AfterMethod
	public void close() {
		
		driver.quit();
	}

	

}