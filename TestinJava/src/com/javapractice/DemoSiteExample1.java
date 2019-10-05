package com.javapractice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSiteExample1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\TestingJava\\TestinJava\\Browser\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");

		WebElement browse = driver.findElement(By.id("imagesrc"));
		browse.click();
		Thread.sleep(4000);

		//Runtime.getRuntime().exec("C:\\Users\\HOME\\Desktop\\Script1.exe");
		browse.sendKeys("C:\\Users\\HOME\\Desktop\\Rose.jpg");

	}

}
