package com.aspire.selenium.popup;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartMultiWindow 
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
     	WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Samsung");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		List<WebElement> items = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		for(WebElement item:items)
		{
			item.click();
			Thread.sleep(500);
			
		}
		
		Set<String> ids = driver.getWindowHandles();
		for(String id:ids)
		{
			System.out.println(id);
		}
		Thread.sleep(2000);
		ArrayList<String> al = new ArrayList<String>(ids);
		driver.switchTo().window(al.get(3));
	//  0 index=Default Window,1 index=last window,2 index=SecondLast Window--------
		List<WebElement> ratings = driver.findElements(By.xpath("//span[@class='_2_R_DZ']/span/span[1]"));
		for(WebElement rating:ratings)
		{
			System.out.println(rating.getText());
		}
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
