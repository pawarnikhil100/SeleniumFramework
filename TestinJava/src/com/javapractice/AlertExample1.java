 // Alert Message handling
package com.javapractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\TestingJava\\TestinJava\\Browser\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		

		/*WebElement Label1 = driver.findElement(By.xpath("//a[text()='Alert with OK ']"));
		Label1.click();
		WebElement btn1 = driver.findElement(By.id("OKTab"));
		btn1.click();

		Alert alt=driver.switchTo().alert();
		alt.accept(); */
		
		/*WebElement Label2 = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		Label2.click();
		WebElement btn2 = driver.findElement(By.id("CancelTab"));
		btn2.click();
		Alert alt=driver.switchTo().alert();
		alt.dismiss();*/

		WebElement label3 = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		label3.click();
		WebElement btn3 = driver.findElement(By.id("Textbox"));
		btn3.click();
		Alert alt = driver.switchTo().alert();
		alt.sendKeys("Roshani");
		//driver.switchTo().alert().accept();

		
	}

}
