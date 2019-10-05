package com.javapractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionExample1 {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			System.setProperty("webdriver.chrome.driver", "E:\\TestingJava\\TestinJava\\Browser\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.get("https://demoqa.com/menu/");

			WebElement electronic = driver.findElement(By.id("ui-id-4"));
			//electronic.click();
			Actions act=new Actions(driver);
			act.moveToElement(electronic).build().perform();
			
			WebElement music = driver.findElement(By.id("ui-id-9"));
			//electronic.click();
			Actions act1=new Actions(driver);
			act1.moveToElement(music).build().perform();

	}

}
