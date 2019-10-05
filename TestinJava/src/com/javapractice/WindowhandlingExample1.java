package com.javapractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowhandlingExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String childwindowHandle;
		System.setProperty("webdriver.chrome.driver", "E:\\TestingJava\\TestinJava\\Browser\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.onlinesbi.com/");
		
		WebElement link = driver.findElement(By.linkText("How Do I"));
		link.click();
		String parentWindowHandle=driver.getWindowHandle();
		System.out.println(parentWindowHandle);//return parent window
		Set<String>wH=driver.getWindowHandles();
		System.out.println(wH);
		for(String wh1 :driver.getWindowHandles())
		{
			if(!wh1.equalsIgnoreCase(parentWindowHandle))
			{
				childwindowHandle=wh1;
				driver.switchTo().window(childwindowHandle);
				System.out.println(driver.getTitle());//return titile of chiled window
				//driver.switchTo().window(childwindowHandle).close();//for closing child window
				driver.switchTo().window(parentWindowHandle);
				System.out.println(driver.getTitle());//for parent window title
			}
		}
		
		
		

		
	}

}
