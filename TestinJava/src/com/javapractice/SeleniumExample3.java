package com.javapractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\TestingJava\\TestinJava\\Browser\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.testandquiz.com/selenium/testing.html");

		WebElement dropDown = driver.findElement(By.id("testingDropdown"));
			dropDown.click();
			
			Select sel = new  Select(dropDown);
			//sel.selectByIndex(2);
			//sel.selectByVisibleText("Performance Testing");
			sel.selectByValue("Manual");
			

	}

}
