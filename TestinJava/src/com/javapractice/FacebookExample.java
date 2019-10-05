package com.javapractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\TestingJava\\TestinJava\\Browser\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.societyhive.com/");
		// WebElement username = driver.findElement(By.id("email"));
		// username.sendKeys("roshanidahake@gmail.com");

		// WebElement password = driver.findElement(By.id("pass"));
		// password.sendKeys("admin123");

		// Thread.sleep(3000);

		WebElement loginbtn = driver.findElement(By.className("sh-header-button sh-disply-inline-block"));
		loginbtn.click();

		driver.findElement(By.className("sh-register-small-font sh-forgotpassword")).click();
		// System.out.println("title of page is: " + driver.getTitle());
		// driver.quit();

	}

}
