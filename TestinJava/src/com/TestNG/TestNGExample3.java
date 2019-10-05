package com.TestNG;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.Enter;

public class TestNGExample3 {
	WebDriver driver;

	@BeforeMethod
	public void SystemSetProperty() {
		System.setProperty("webdriver.chrome.driver", "E:\\TestingJava\\TestinJava\\Browser\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

	}

	@Test
	public void login() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		

		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		

		driver.findElement(By.id("btnLogin")).click();
		// WebElement loginBtn = driver.findElement(By.id("btnLogin"));
		// loginBtn.click();

		String Ex = "Welcome Admin";
		String act = driver.findElement(By.xpath("//a[@id='welcome']")).getText();

		// Assert.assertEquals("SSP123", "SSP");//or
		// Assert.assertEquals(Act,Ex);
		// Assert.assertEquals(Act,Ex);
		Assert.assertEquals(act, Ex, "Hi");
}

	@AfterMethod
	public void Logout() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
	}
}
