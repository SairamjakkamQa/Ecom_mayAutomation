package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.tracing.Propagator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class search_functionality extends TestBase {

	@FindBy(xpath = "//input[@placeholder='Search here ...']")
	private WebElement Searchhere;

	@FindBy(xpath = "//div[@class='input-group-overlay d-none d-md-block mx-4']//span[@class='input-group-text __text-20px'] ")
	private WebElement Searchbtn;

	public search_functionality() {
		PageFactory.initElements(driver, this);

	}

	public void search_the_product_and_able_to_see_the_related_matches() {

		driver.get(prop.getProperty("url1"));

		Searchhere.sendKeys(prop.getProperty("brandname"));

	}

	public void without_providing_data_user_clicks_on_search_button() {

		Searchbtn.click();

	}

	public void invalid_data_in_search_field() {

		Searchhere.sendKeys(prop.getProperty("invalid_data"));

	}

}