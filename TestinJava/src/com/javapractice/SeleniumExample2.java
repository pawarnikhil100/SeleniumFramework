package com.javapractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\TestingJava\\TestinJava\\Browser\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		 
        driver.manage().window().maximize();
		driver.get("https://www.airbnb.co.in/");

		//Locating location field for the search  form via class name 
        driver.findElement(By.className("_up0kwni")).sendKeys("Goa", Keys.ENTER);
 
        //Locating check-in field for the search  form via class name 
        driver.findElement(By.className("_14fdu48d")).click();
        
        //Locating the date 12th June for check-in field
        driver.findElement(By.className("_1wh4xpp1")).click();
                
        //closing the driver
        driver.quit();

	}

}
