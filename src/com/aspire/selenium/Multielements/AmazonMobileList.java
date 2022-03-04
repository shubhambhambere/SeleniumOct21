package com.aspire.selenium.Multielements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMobileList
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Samsung");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	List<WebElement> mobilelist = driver.findElements(By.xpath("//div[@class='s-main-slot s-result-list s-search-results sg-row']//h2/a/span"));
	Thread.sleep(2000);
//	for(WebElement mobile:mobilelist)
//	{
//		System.out.println(mobile.getText());
//	}
	
	String exp="Samsung Galaxy A12 (Black, 6GB RAM, 128GB Storage) with No Cost EMI/Additional Exchange Offers";
	for(WebElement mobile1:mobilelist)
	{
	      String act = mobile1.getText(); 
		  
		if(exp.equals(act))
		{
			mobile1.click();
			System.out.println("Expected output Display");
		}
		
		
	}
	
}
}
