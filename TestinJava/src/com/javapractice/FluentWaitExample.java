package com.javapractice;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\TestingJava\\TestinJava\\Browser\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.uitestpractice.com/Students/Contact");
		driver.manage().window().maximize();

		//WebElement link = driver.findElement(By.xpath("//a[text()='This is a Ajax link']"));
		WebElement link = driver.findElement(By.linkText("This is a Ajax link"));
		link.click();

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(20, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("ContactUs")));
		String s=driver.findElement(By.className("ContactUs")).getText();
		System.out.println(s);
		
		System.out.println(s.contains("Linux"));
		

		//WebElement para = driver.findElement(By.xpath("//div[@class='ContactUs']/p"));
		//System.out.println(para.getText());
		
	}

}
