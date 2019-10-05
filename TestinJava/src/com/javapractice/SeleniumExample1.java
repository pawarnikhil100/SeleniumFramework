package com.javapractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\TestingJava\\TestinJava\\Browser\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		WebElement username = driver.findElement(By.className("txtUsername"));
		username.sendKeys("Admin");

		WebElement password = driver.findElement(By.className("txtPassword"));
		password.sendKeys("admin123");

		WebElement loginbtn = driver.findElement(By.className("btnLogin"));
		loginbtn.click();

	}

}
