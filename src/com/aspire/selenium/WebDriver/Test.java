package com.aspire.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\Java project\\\\OCT 21\\\\SeleniumOct21\\\\SoftFiles\\\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Lenovo/Desktop/.html");
		Thread.sleep(2000);
		

		//tag name
		driver.findElement(By.tagName("input")).sendKeys("Shubham");
		Thread.sleep(2000);
		
		//id
				driver.findElement(By.id("123")).sendKeys("Bhambere");
				Thread.sleep(2000);
		//name
				driver.findElement(By.name("demo")).clear();
				Thread.sleep(2000);
		
				driver.findElement(By.name("demo")).sendKeys("Soham");
				Thread.sleep(2000);
		//class
		      driver.findElement(By.className("number")).sendKeys("123456789");
		      Thread.sleep(2000);
		
	  
		
		 
	}
	
	
	
}
