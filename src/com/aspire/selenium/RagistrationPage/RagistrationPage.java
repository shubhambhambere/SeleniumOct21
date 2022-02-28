package com.aspire.selenium.RagistrationPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RagistrationPage {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");	
     	WebDriver	driver=new ChromeDriver();
	
     	driver.manage().window().maximize();
     	Thread.sleep(2000);
     	driver.get("file:///C:/Users/Lenovo/Desktop/.html");
     	Thread.sleep(2000);
   	//name
     	driver.findElement(By.name("demo")).sendKeys("Shubhbam");
     	Thread.sleep(2000);
   	//classname
     	driver.findElement(By.className("Sample")).sendKeys("Bhambere");
     	Thread.sleep(2000);
    //id
     	driver.findElement(By.id("123")).clear();
     	Thread.sleep(2000);
     	driver.findElement(By.id("123")).sendKeys("Soham");
     	Thread.sleep(2000);
    // Tagname
     //	driver.findElement(By.tagName("a")).click();
    // 	Thread.sleep(2000); 	 
   //Link Text
    //	driver.findElement(By.linkText("Facebook")).click();
     //	Thread.sleep(2000);
   //partial link text
     //	driver.findElement(By.partialLinkText("Goo")).click();
     //	Thread.sleep(2000);
   //css selector
     	driver.findElement(By.cssSelector("body > input.number")).sendKeys("8452081990");
     	Thread.sleep(2000);
     	
  // Xpath
     	driver.findElement(By.xpath("//input[@type='Password']")).sendKeys("shubh@99");
     	Thread.sleep(2000);
     	driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
     	Thread.sleep(2000);
     	driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
     	Thread.sleep(2000);
     	driver.quit();
     	
     	
     	
     	
     	
     	
	}
	
}
