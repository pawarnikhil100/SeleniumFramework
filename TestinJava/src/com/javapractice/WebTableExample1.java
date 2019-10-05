package com.javapractice;

import java.util.Iterator;
import java.util.List;//*always use this package for list

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import okhttp3.internal.http2.Header;

public class WebTableExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\TestingJava\\TestinJava\\Browser\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HOME/Desktop/ABC.html");

		// List header =
		// driver.findElements(By.xpath("//table[@name='EmpRecord']/tbody/tr[1]/th"));
		// System.out.println(header.size());

		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='EmpRecord']/tbody/tr"));
		System.out.println(rows.size());

		for (WebElement r : rows) {
			System.out.println(r.getText());

		}
	}

}
