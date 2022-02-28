package com.aspire.selenium.select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllSelectClassMethod {

	public static void main(String[]args) throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
          WebDriver driver	=new ChromeDriver();
	
          driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
          
          WebElement product = driver.findElement(By.xpath("//select[@id='first']"));
          
        Select s = new Select(product);
        s.selectByIndex(1);
        Thread.sleep(2000);      
        s.selectByValue("Apple");
        Thread.sleep(2000);  
        s.selectByVisibleText("Yahoo");
        
        WebElement fooditem = driver.findElement(By.xpath("//select[@id='second']"));
        Thread.sleep(2000);
       Select s1 = new Select(fooditem);
       s1.selectByIndex(1);
       Thread.sleep(2000);
       s1.deselectByIndex(1);
       s1.selectByVisibleText("Burger");
       Thread.sleep(2000);
       s1.deselectByVisibleText("Burger");
       
       System.out.println(s1.isMultiple());
       System.out.println(s.isMultiple());
       
       List<WebElement> foodlist = s1.getOptions();
       for(WebElement food:foodlist)
       {
    	   System.out.println(food.getText());
       }
       
       s1.selectByIndex(1);
       s1.selectByIndex(3);
       
       List<WebElement> selectfood = s1.getAllSelectedOptions();
       for(WebElement foodlist1:selectfood)
       {
    	   System.out.println(foodlist1.getText());
       }
       
       
        
        
        
        
        
		
		
	}
	
	
}
