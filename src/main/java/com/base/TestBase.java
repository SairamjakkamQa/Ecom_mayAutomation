package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.utils.EventListeners;

public class TestBase {

	public static Properties prop;
	FileInputStream file;
	public static WebDriver driver;
	protected ExtentReports extentreports;
	public static EventFiringWebDriver e_driver;
	public static EventListeners listenerss;

	public TestBase() {

		try {
			file = new FileInputStream("C:\\Users\\King\\git\\Ecom_mayAutomation\\src\\main\\java\\com\\configproperties\\Configprop");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		prop = new Properties();

		try {
			prop.load(file);
		} catch (IOException e) {
			e.printStackTrace();
		}

		extentreports = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter(".\\target\\report.html");
		extentreports.attachReporter(spark);

	}

	public void initialization() {

		String browsername = prop.getProperty("browser");
		if (browsername.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browsername.equals("Edge")) {
			driver = new EdgeDriver();
		} else if (browsername.equals("firefox")) {
			driver = new FirefoxDriver();

		}

		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with
		// EventFiringWebDriver
		listenerss = new EventListeners();
		e_driver.register(listenerss);
		driver = e_driver;

		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		//driver.manage().deleteAllCookies();

		extentreports.flush();

	}

}