package com.aspire.selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice13 
{     public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("webdriver.chrome.driver","D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com");
	
	Thread.sleep(2000);
	
	WebElement element = driver.findElement(By.xpath("//button [text()='✕']"));
	element.click();
	
	Thread.sleep(4000);
	
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,1200)");
	
	Thread.sleep(2000);
	
	js.executeScript("window.scrollBy(0,-500)");
	
	Thread.sleep(2000);
	
	WebElement aboutus = driver.findElement(By.xpath("//a [text()='About Us']"));
	js.executeScript("arguments[0].scrollIntoView(true)",aboutus);
    aboutus.click();
}
	
	
}
