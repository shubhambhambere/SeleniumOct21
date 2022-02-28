package com.aspire.selenium.Multielements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggetsion 
{
public static void main(String[] args) throws InterruptedException
{
	   System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
	
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Samsung");
        Thread.sleep(2000);
        List<WebElement> suggetions = driver.findElements(By.xpath("(//ul[@jsname='bw4e9b'])[1]/li/div/div/div[1]/span"));
        for(WebElement suggetion:suggetions)
        {
        	System.out.println(suggetion.getText());
        }
        
        String exp="samsung a52";
        for(WebElement temp:suggetions)
        {
        	String act=temp.getText();
        	if(exp.equals(act))
        	{
        		System.out.println("Expected Product Display");
        		temp.click();
        	//	break;
        		
        	}
        	
        	
        	
        }
        
        
        driver.quit();
        
        
}
}
