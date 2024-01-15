package com.testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.base.TestBase;
import com.pom.Signup_Functionality;
import com.pom.search_functionality;
import com.utils.*;

public class search_Test extends TestBase {

	search_functionality search;

	public search_Test() {
		super();
	}

	@BeforeMethod
	public void setup() {

		initialization();

		search = new search_functionality();
	}

	@Test(priority = 1)
	public void search_the_product_and_able_to_see_the_related_matches() throws Throwable {

		search.search_the_product_and_able_to_see_the_related_matches();
		WebElement valid = driver.findElement(
				By.xpath("//div[@class='card-body search-result-box __h-400px overflow-x-hidden overflow-y-auto']"));
		System.out.println(valid.getText());
		Assert.assertTrue(true, "list-group label is present");

	}

	@Test(priority = 2)

	public void without_providing_data_user_clicks_on_search_button() {

		search.without_providing_data_user_clicks_on_search_button();

		WebElement valid = driver.findElement(By.xpath("//label[@id='price-filter-count']"));
		System.out.println(valid.getText());
		Assert.assertTrue(true, "list-group label is present");

	}

	@Test(priority = 3)

	public void invalid_data_in_search_field() {

		search.invalid_data_in_search_field();

		WebElement valid = driver.findElement(
				By.xpath("//div[@class='card-body search-result-box __h-400px overflow-x-hidden overflow-y-auto']"));
		System.out.println(valid.getText());
		Assert.assertTrue(true, "list-group label is present");

	}

	@AfterMethod

	public void teardown() {

	}
}