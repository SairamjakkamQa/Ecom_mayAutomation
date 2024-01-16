package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;
import com.utils.utils;

public class WishlistFunctionality extends TestBase {

	@FindBy(xpath = "//div[@class='navbar-tool-icon-box bg-secondary']//div[@class='navbar-tool-icon-box bg-secondary']//*[name()='svg']")
	WebElement profile;

	@FindBy(xpath = "//a[normalize-space()='Sign in']")
	WebElement signin;

	@FindBy(xpath = "//input[@id='si-email']")
	WebElement mail;

	@FindBy(xpath = "//input[@id='si-password']")
	WebElement password;

	@FindBy(xpath = "//button[normalize-space()='Sign in']")
	WebElement signinbutton;

	@FindBy(xpath = "//span[@class='w-0 flex-grow-1 pl-3'][normalize-space()='TVs & Appliances']")
	WebElement tvandappliance;

	@FindBy(xpath = "//div[contains(@class,'row')]//div[1]//div[1]//div[1]//div[1]//div[2]//a[1]//img[1]")
	WebElement product;

	@FindBy(xpath = "//i[contains(@class,'fa fa-heart-o')]")
	WebElement wishlist;

	@FindBy(xpath = "//i[@class='navbar-tool-icon czi-heart']")
	WebElement wishlist1;

	@FindBy(xpath = "//img[@alt='wishlist']")
	WebElement wishproduct;

	@FindBy(xpath = "//span[normalize-space()='Buy now']")
	WebElement buynow;

	@FindBy(xpath = "//select[@class='form-control']")
	WebElement shippingmethod;

	@FindBy(xpath = "//textarea[@id='order_note']")
	WebElement ordernote;

	@FindBy(xpath = "//button[@data-target='#collapseThree']")
	WebElement anotheraddress;

	@FindBy(xpath = "//a[@class='btn btn--primary pull-right']")
	WebElement checkout;

	@FindBy(xpath = "//input[@name='contact_person_name']")
	WebElement name;

	@FindBy(xpath = "//input[@name='phone']")
	WebElement phone;

	@FindBy(xpath = "//select[@name='address_type']")
	WebElement addreaatype;

	@FindBy(xpath = "//input[@name='city']")
	WebElement city;

	@FindBy(xpath = "//input[@name='zip']")
	WebElement zipcode;

	@FindBy(xpath = "//div[contains(text(),'India')]")
	WebElement country;

	@FindBy(xpath = "//div[@class='dropdown-menu show']//input[@aria-label='Search']")
	WebElement countrydropdown;

	@FindBy(xpath = "//span[normalize-space()='India']")
	WebElement india;

	@FindBy(xpath = "//textarea[@id='address']")
	WebElement address;

	@FindBy(xpath = "//input[@id='exampleCheck1']")
	WebElement checkbox;

	@FindBy(xpath = "//input[@id='same_as_shipping_address']")
	// input[@id='same_as_shipping_address']
	WebElement sameaddress;

	@FindBy(xpath = "//span[normalize-space()='Proceed payment']")
	WebElement payment;

	@FindBy(xpath = "//form[@class='needs-validation']//img[@class='__mt-n-10']")
	WebElement paymentoption;

	@FindBy(xpath = "//i[@class='czi-close-circle']")
	WebElement delete;

	@FindBy(xpath = "//button[normalize-space()='OK']")
	WebElement ok;

	@FindBy(xpath = "//div[@id='ajax-products']//div[2]//div[1]//div[1]//div[1]//div[2]//a[1]//img[1]")
	WebElement ac;

	@FindBy(xpath = "//i[contains(@class,'fa fa-heart-o')]")
	WebElement acwishlist;

	@FindBy(xpath = "//span[@class='w-0 flex-grow-1 pl-3'][normalize-space()='Books']")
	WebElement bookcategory;

	@FindBy(xpath = "//div[contains(@class,'row')]//div[1]//div[1]//div[1]//div[1]//div[2]//a[1]//img[1]")
	WebElement book;

	@FindBy(xpath = "//i[contains(@class,'fa fa-heart-o')]")
	WebElement bookwishlist;

	@FindBy(xpath = "//span[@class='w-0 flex-grow-1 pl-3'][normalize-space()='Furniture']")
	WebElement furniturecategory;

	@FindBy(xpath = "//div[@id='ajax-products']//div[2]//div[1]//div[1]//div[1]//div[2]//a[1]//img[1]")
	WebElement chair;

	@FindBy(xpath = "//i[contains(@class,'fa fa-heart-o')]")
	WebElement chairishlist;

	@FindBy(xpath = "//img[@class='__inline-11']")
	WebElement home;

	public WishlistFunctionality() {
		PageFactory.initElements(driver, this);
	}

	public void verifylogin() throws Throwable {

		Thread.sleep(2000);
		utils.actions(driver, profile);

		Thread.sleep(2000);
		signin.click();

		Thread.sleep(2000);
		mail.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("pass"));
		signinbutton.click();
	}

	public void verifywishlistandbuy() throws Throwable {

		Thread.sleep(2000);
		tvandappliance.click();

		Thread.sleep(2000);
		product.click();

		Thread.sleep(2000);
		wishlist.click();

		Thread.sleep(5000);
		wishlist1.click();

		Thread.sleep(2000);
		wishproduct.click();

		Thread.sleep(2000);
		buynow.click();

		Thread.sleep(2000);
		utils.dropdowns(shippingmethod, 2);

		Thread.sleep(2000);
		ordernote.sendKeys("note");

		Thread.sleep(2000);
		checkout.click();

//		Thread.sleep(2000);
//		anotheraddress.click();
//		Thread.sleep(2000);
//		anotheraddress.click();
//		
//		Thread.sleep(2000);
//		name.sendKeys(prop.getProperty("personname"));
//		
//		Thread.sleep(2000);
//		phone.sendKeys(prop.getProperty("phonenumber"));
//		
//		Thread.sleep(2000);
//		utils.dropdowns(addreaatype, 0);
//		
//		Thread.sleep(2000);
//		city.sendKeys(prop.getProperty("cityname"));
//		
//		Thread.sleep(2000);
//		zipcode.sendKeys(prop.getProperty("zip"));
//		
//		Thread.sleep(2000);
//		country.click();
//		
//		Thread.sleep(2000);
//		countrydropdown.sendKeys(prop.getProperty("cntrydrp"));
//		
//		Thread.sleep(2000);
//		india.click();
//		
//		Thread.sleep(2000);
//		address.sendKeys(prop.getProperty("cityname"));
//		
//		Thread.sleep(2000);
//		checkbox.click();

		Thread.sleep(2000);
		sameaddress.click();

		Thread.sleep(2000);
		payment.click();

		Thread.sleep(2000);
		paymentoption.click();

	}

	public void verifyremoveproduct() throws Throwable {

		Thread.sleep(2000);
		wishlist1.click();

		Thread.sleep(2000);
		delete.click();

		Thread.sleep(2000);
		ok.click();

		Thread.sleep(2000);
		driver.navigate().refresh();

	}

	public void verifymultiplproducttowishlist() throws Throwable {

		Thread.sleep(2000);
		tvandappliance.click();

		Thread.sleep(2000);
		ac.click();

		Thread.sleep(2000);
		acwishlist.click();

		Thread.sleep(2000);
		home.click();

		Thread.sleep(2000);
		bookcategory.click();

		Thread.sleep(2000);
		book.click();

		Thread.sleep(2000);
		bookwishlist.click();

		Thread.sleep(2000);
		home.click();

		Thread.sleep(2000);
		furniturecategory.click();

		Thread.sleep(2000);
		chair.click();

		Thread.sleep(2000);
		chairishlist.click();

		Thread.sleep(2000);
		wishlist1.click();

	}

}
