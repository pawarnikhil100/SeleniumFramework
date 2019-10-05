package com.javapractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\TestingJava\\TestinJava\\Browser\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get(
				"https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		// driver.manage().timeouts().implicitlyWait(3000,
		// TimeUnit.MILLISECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20);

		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys("roshanidahakeeng@gmail.com");

		WebElement nxtBtn1 = driver.findElement(By.className("RveJvd"));
		nxtBtn1.click();

		// driver.manage().timeouts().implicitlyWait(3000,
		// TimeUnit.MILLISECONDS);

		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.click();
		password.sendKeys("1roshani1993");
		WebElement nxtBtn2 = driver.findElement(By.className("RveJvd"));
		nxtBtn2.click();

		WebElement compose = driver.findElement(
				By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div[1]/div/div"));

		wait.until(ExpectedConditions.visibilityOf(compose));
		compose.click();

	}

}
