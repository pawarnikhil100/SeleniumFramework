package com.javapractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\TestingJava\\TestinJava\\Browser\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		Actions act = new Actions(driver);

		// WebElement from = driver.findElement(By.id("draggable"));
		// WebElement to = driver.findElement(By.id("droppable"));

		WebElement email = driver.findElement(By.id("email"));

		// act.dragAndDrop(from, to).perform();//// Perform drag and drop
		// act.keyDown(email, Keys.SHIFT);
		// act.sendKeys("roshanidahake@gamil.com");
		// act.keyUp(email, Keys.SHIFT).perform();

		act.keyDown(email, Keys.SHIFT).sendKeys("roshani").keyUp(email, Keys.SHIFT).build().perform();
	}

}
