package com.utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.TestBase;

public class Utils extends TestBase{
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

	
}
