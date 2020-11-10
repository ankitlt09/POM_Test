package com.Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_TestCase {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("Abhay");
		
		driver.findElement(By.name("lastname")).sendKeys("Kumar");
		
		driver.findElement(By.id("sex-0")).click();
		
		driver.findElement(By.id("exp-0")).click();
		
		driver.findElement(By.id("datepicker")).sendKeys("30/10/2020");
		
		driver.findElement(By.id("profession-1")).click();
		
		driver.findElement(By.id("tool-1")).click();
		
		driver.findElement(By.id("tool-2")).click();
		
		Select cont = new Select(driver.findElement(By.id("continents")));
		
		cont.selectByIndex(0);
		
		
		Select comm = new Select(driver.findElement(By.id("selenium_commands")));
		
		comm.selectByVisibleText("WebElement Commands");
		
		
		WebElement photo = driver.findElement(By.id("photo"));
		
		photo.click();
		
		photo.sendKeys("C:\\selenium\\sample.jpg");
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
