package com.aspire.selenium.Multielements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMultiElements 
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	List<WebElement> modules = driver.findElements(By.xpath("//div[@id='nav-xshop-container']//a"));
	System.out.println("No Of Modules present On amazon WebSite="+modules.size());
	for(WebElement module:modules)
	{
	  System.out.println(module.getText());
	  
	}
// Select Fashion Module From all Modules	
	String exp="Fashion";
	for(WebElement temp:modules)
	{
		String act=temp.getText();
		Thread.sleep(2000);
		if(act.equals(exp))
		{
			System.out.println("Expected Output printed");
			temp.click();
	    	break;
			
		}
		
		
		
	}

	Thread.sleep(2000);
		
	driver.quit();
	
	
}
}
