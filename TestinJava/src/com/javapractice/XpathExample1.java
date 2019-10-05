package com.javapractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "E:\\TestingJava\\TestinJava\\Browser\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		 
        driver.manage().window().maximize();
        driver.get("http://demosite.center/wordpress/wp-login.php");
        
        driver.findElement(By.xpath("//html/body/div/form/p[1]/label/input")).sendKeys("admin", Keys.ENTER);
        

	}

}
