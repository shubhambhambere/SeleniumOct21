package com.aspire.selenium.Multielements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartModule
{
     public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	List<WebElement> Modules = driver.findElements(By.xpath("//div[@class='InyRMC _3Il5oO']//a/div[2]"));
	System.out.println("NO Of Modules on Flipkart Web Page ="+Modules.size());
	Thread.sleep(2000);
	for(WebElement module:Modules)
	{
		System.out.println(module.getText());
		
	}
	
	
	
	
     }
}
