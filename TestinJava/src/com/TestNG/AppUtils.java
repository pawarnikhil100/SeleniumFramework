package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppUtils {
	public static WebElement waitForElement(WebDriver driver, int seconds, By by) {
		WebElement element = null;
		try {
			WebDriverWait wait = new WebDriverWait(driver, seconds);
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return element;
	}

	public static WebElement waitForElementToBeClickable(WebDriver driver, int seconds, By by) {
		WebElement element = null;
		try {
			WebDriverWait wdWait = new WebDriverWait(driver, seconds);
			element = wdWait.until(ExpectedConditions.elementToBeClickable(by));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return element;
	}

	public static void selectOption(WebDriver driver, By by, String text) {
		WebElement element = AppUtils.waitForElementToBeClickable(driver, 20, by);
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}

}
