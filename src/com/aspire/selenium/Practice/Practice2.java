package com.aspire.selenium.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 
{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Realme");
	    driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	    List<WebElement> mobilelist = driver.findElements(By.xpath("(//div[contains(@class,'s-m')])[2]//h2/a/span"));
		for(WebElement mobile:mobilelist)
		{	
			System.out.println(mobile.getText());
		}
	    
		String exp="realme 8 (Cyber Black, 8GB RAM, 128GB Storage) with No Cost EMI/Additional Exchange Offers";
		
		for(WebElement mobile:mobilelist)
		{
			String Act=mobile.getText();
		
			if(exp.equals(Act))
			{
				System.out.println("Expaected output");
				mobile.click();
				
				
			}
				
		}

		
		driver.quit();
		
		
		
		
	}
	
}
