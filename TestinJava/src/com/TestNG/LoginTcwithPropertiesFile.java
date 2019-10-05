package com.TestNG;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTcwithPropertiesFile {
	WebDriver driver;
	GenericClassForTG rd;
	
	@BeforeMethod
	public void SystemSetProperty() {
		System.setProperty("webdriver.chrome.driver", "E:\\TestingJava\\TestinJava\\Browser\\chromedriver.exe");
		driver =  new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void login() throws IOException {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		rd=new GenericClassForTG();
	   driver.get(rd.getData("url"));
		driver.findElement(By.id("txtUsername")).sendKeys(rd.getData("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(rd.getData("password"));
		driver.findElement(By.id("btnLogin")).click();
	}
}
