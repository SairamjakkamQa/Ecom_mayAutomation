package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.reports.ExtentReports;
import com.utils.EventListeners;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
 
	
	
	public static Properties prop;
	FileInputStream file;
	public static WebDriver driver;
	//protected ExtentReports extentreports;
	
	protected ExtentReports extentreports; /// er chart
	public static EventFiringWebDriver e_driver; // listeners(Sreenshot)
	public static EventListeners listenerss; // listeners(Sreenshot)
	
	
	
	
	public TestBase() {

		try {
			file = new FileInputStream("C:\\Users\\ARUN\\git\\Ecom_mayAutomation\\src\\main\\java\\configproperties\\Configprop");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		prop = new Properties();

		try {
			prop.load(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
//		extentreports = new ExtentReports();
//		ExtentSparkReporter spark= new ExtentSparkReporter(".\\target\\report.html");
//	    extentreports.attachReporter(spark);
//	    
	  

		
	}

	public void initialization() {
		//WebDriverManager.chromedriver().setup();
		String browsername = prop.getProperty("browser");
		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARUN\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
			
		} //else if (browsername.equals("Edge")) {
			//driver = new EdgeDriver();
	//	} 
	else if (browsername.equals("firefox")) {

			driver = new FirefoxDriver();
		}
		e_driver = new EventFiringWebDriver(driver);
		
		listenerss = new EventListeners();
		e_driver.register(listenerss); // method(register)
		driver = e_driver;
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.manage().deleteAllCookies();
		//extentreports.flush();

	}



	}


