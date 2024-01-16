package com.utils;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.TestBase;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class utils extends TestBase {
	private static WebDriver driver;

	public static void Javascriptexecutor(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	public static void windowhandles(WebElement element, WebDriver driver) {
		String parentwindow = driver.getWindowHandle();
		element.click();
//		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> ids = driver.getWindowHandles();

		for (String windowids : ids) {
			System.out.println(windowids);

			if (!parentwindow.equals(windowids)) {
				driver.switchTo().window(windowids);
				driver.manage().window().maximize();

			}
		}
	}

	public static void takescreenshot(String filename) {

		try {
			File destination = new File(filename);

			FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE), destination);

//			FileUtils.copyFile(screenshotFile, new File("./target/getMethodName().png"));

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static void captureAndSaveScreenshot(WebDriver driver, String destFilePath) {
		try {
			TakesScreenshot screenshot = (TakesScreenshot) driver;
			File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
			File destFile = new File(destFilePath);
			FileUtils.copyFile(srcFile, destFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void explicitwait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void actions(WebDriver driver, WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).click().perform();
		
	}
	
public static void dropdowns(WebElement value, int index) {
		
		Select sel = new Select(value);
		sel.selectByIndex(index);
	}

}
