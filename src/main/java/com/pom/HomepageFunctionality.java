package com.pom;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v113.page.model.NavigatedWithinDocument;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.internal.Utils;

import com.base.TestBase;

public class HomepageFunctionality extends TestBase {

	@FindBy(xpath = "/html/body/div[5]/footer/div[1]/div/div/div[2]/div[1]/div[1]/ul/li[1]/a")
	WebElement FeaturedProducts;

	@FindBy(xpath = "/html/body/div[5]/footer/div[1]/div/div/div[2]/div[1]/div[1]/ul/li[2]/a")
	WebElement LatestProducts;

	@FindBy(xpath = "/html/body/div[5]/footer/div[1]/div/div/div[2]/div[1]/div[1]/ul/li[3]/a")
	WebElement BestSellingProducts;

	@FindBy(xpath = "/html/body/div[5]/footer/div[1]/div/div/div[2]/div[1]/div[1]/ul/li[4]/a")
	WebElement TopRatedProducts;

	@FindBy(xpath = "/html/body/div[5]/footer/div[1]/div/div/div[2]/div[1]/div[2]/ul/li[1]/a")
	WebElement ProfileInfo;

	@FindBy(xpath = "/html/body/div[5]/footer/div[1]/div/div/div[2]/div[1]/div[2]/ul/li[2]/a")
	WebElement WishList;

	@FindBy(xpath = "/html/body/div[5]/footer/div[1]/div/div/div[2]/div[1]/div[2]/ul/li[3]/a")
	WebElement TracOrder;

	@FindBy(css = "body > div:nth-child(8) > footer:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > ul:nth-child(2) > li:nth-child(4) > a:nth-child(1)")
	// a[normalize-space()='Refund policy']
	WebElement Refundpolicy;

	@FindBy(xpath = "/html/body/div[5]/footer/div[1]/div/div/div[2]/div[1]/div[2]/ul/li[5]/a")
	WebElement Returnpolicy;

	@FindBy(xpath = "/html/body/div[5]/footer/div[1]/div/div/div[2]/div[1]/div[2]/ul/li[6]/a")
	WebElement Cancellationpolicy;

	@FindBy(xpath = "/html/body/div[5]/footer/div[1]/div/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/a")
	WebElement phone;

	@FindBy(xpath = "//span[normalize-space()='info@equarz.com']")
	WebElement email;

	@FindBy(xpath = "//span[normalize-space()='Support Ticket']")
	WebElement suppotTicket;

	@FindBy(xpath = "//a[@class='social-btn text-white sb-light sb-twitter mr-2 mb-2']")
	WebElement twitter;

	@FindBy(xpath = "//i[@class='fa fa-linkedin']")
	WebElement linkedin;

	@FindBy(xpath = "//a[@class='social-btn text-white sb-light sb-google-plus mr-2 mb-2']")
	WebElement google;

	@FindBy(xpath = "//i[@class='fa fa-pinterest']")
	WebElement pinterest;

	@FindBy(xpath = "//i[@class='fa fa-instagram']")
	WebElement instagram;

	@FindBy(xpath = "//a[@class='social-btn text-white sb-light sb-facebook mr-2 mb-2']")
	WebElement facebook;
	
	@FindBy (xpath = "//button[@class='buy_btn']")
	WebElement buynow;
	
	

	public HomepageFunctionality() {
		PageFactory.initElements(driver, this);
	}

	public void VerifyFeaturedProducts() throws Throwable {
		Thread.sleep(2000);
		FeaturedProducts.click();
		Thread.sleep(2000);

	}

	public void VerifyLatestProducts() throws Throwable {
		Thread.sleep(2000);
		LatestProducts.click();
		Thread.sleep(2000);
	}

	public void VerifyBestSellingProducts() throws Throwable {
		Thread.sleep(2000);
		BestSellingProducts.click();
		Thread.sleep(2000);
	}

	public void VerifyTopRatedProducts() throws Throwable {
		Thread.sleep(2000);
		TopRatedProducts.click();
		Thread.sleep(2000);
	}

	public void VerifyProfileInfo() throws Throwable {
		Thread.sleep(2000);
		ProfileInfo.click();
		Thread.sleep(2000);
	}

	public void VerifyWishList() throws Throwable {
		Thread.sleep(2000);
		WishList.click();
		Thread.sleep(2000);
	}

	public void VerifyTracOrder() throws Throwable {
		Thread.sleep(2000);
		TracOrder.click();
		Thread.sleep(2000);
	}

	public void VerifyRefundpolicy() throws Throwable {

		com.utils.utils.Javascriptexecutor(Refundpolicy, driver);

	}

	public void VerifyReturnpolicy() throws Throwable {
		Thread.sleep(2000);
		Returnpolicy.click();
		Thread.sleep(2000);
	}

	public void VerifyCancellationpolicy() throws Throwable {
		Thread.sleep(2000);
		Cancellationpolicy.click();
		Thread.sleep(2000);
	}


	public void Verifyemail() throws Throwable {

		WebElement email1=driver.findElement(By.xpath("//span[normalize-space()='info@equarz.com']"));
		Assert.assertTrue(email1.isDisplayed())	;
	}

	public void VerifysuppotTicket() throws Throwable {
		Thread.sleep(2000);
		suppotTicket.click();
		Thread.sleep(2000);
	}

	public void Verifytwitter() throws Throwable {
		
		com.utils.utils.windowhandles(twitter, driver);
		Thread.sleep(5000);			
	}

	public void Verifylinkedin() throws Throwable {
		
		com.utils.utils.windowhandles(linkedin, driver);
		Thread.sleep(5000);
	}

	public void Verifygoogle() throws Throwable {

		com.utils.utils.windowhandles(google, driver);
		Thread.sleep(5000);
	}

	public void Verifypinterest() throws Throwable {

		com.utils.utils.windowhandles(pinterest, driver);
		Thread.sleep(5000);
		
	}

	public void Verifyinstagram() throws Throwable {
		
		com.utils.utils.windowhandles(instagram, driver);
		Thread.sleep(5000);
	}

	public void Verifyfacebook() throws Throwable {

		com.utils.utils.windowhandles(facebook, driver);
		Thread.sleep(5000);
	}
	
	public void verifybuynow() throws Throwable {
		
		Thread.sleep(2000);
		buynow.click();
		Thread.sleep(2000);
	}
	
	public void verifysubsribebutton() throws Throwable {
		
		Thread.sleep(2000);
		WebElement subscribe = driver.findElement(By.xpath("//button[normalize-space()='Subscribe']"));
		Assert.assertTrue(subscribe.isDisplayed());
		
	}
	
	public void verifytermconditions() throws Throwable {
		
		Thread.sleep(2000);
		WebElement termconditions = driver.findElement(By.xpath("//a[normalize-space()='Terms & Conditions']"));
		Assert.assertTrue(termconditions.isDisplayed());
		
	}
	
	public void verifyprivacypolicy() throws InterruptedException {
		
		Thread.sleep(2000);
		WebElement privacypolicy = driver.findElement(By.xpath("//a[normalize-space()='Privacy Policy']"));
		Assert.assertTrue(privacypolicy.isDisplayed());
	}
	
	
	
}