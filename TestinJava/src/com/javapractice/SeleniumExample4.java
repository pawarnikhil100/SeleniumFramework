package com.javapractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\TestingJava\\TestinJava\\Browser\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement dropDown1 = driver.findElement(By.id("day"));
		dropDown1.click();
		Select sel1 = new Select(dropDown1);
		sel1.selectByIndex(5);

		WebElement dropDown2 = driver.findElement(By.id("month"));
		dropDown2.click();
		Select sel2 = new Select(dropDown2);
		sel2.selectByVisibleText("Feb");

		WebElement dropDown3 = driver.findElement(By.id("year"));
		dropDown3.click();
		Select sel3 = new Select(dropDown3);
		sel3.selectByValue("2017");
		
		WebElement radio1 = driver.findElement(By.id("u_0_5"));
		radio1.click();
		//Select sel4 = new Select(radio1);
		//sel4.selectByValue("2017");
		
		
	}

}
