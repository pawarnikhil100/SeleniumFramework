package com.TestNG;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.read.biff.BiffException;

public class DataProviderExample2 {
	WebDriver driver;
	@BeforeTest
	public void before()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\TestingJava\\TestinJava\\Browser\\chromedriver.exe");
		driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test(dataProvider="login")
	public void login(String userName,String password)
	{
		driver.findElement(By.).sendKeys(userName);
		driver.findElement(By.id(password)).sendKeys(password);
	}

	@DataProvider(name="login")
	public String[][] senddata() throws BiffException, IOException
	{
		return ReadDataFromExelGeneric.getexel();
	}

}
