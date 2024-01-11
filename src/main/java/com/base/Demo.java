package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	@Test
	public void display() {
		System.out.println("hello");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARUN\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	}
	

}
