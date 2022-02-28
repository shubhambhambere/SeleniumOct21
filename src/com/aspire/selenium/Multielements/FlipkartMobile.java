package com.aspire.selenium.Multielements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartMobile 
{
  public static void main(String[] args) throws InterruptedException
  {        System.setProperty("webdriver.chrome.driver","D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
            WebDriver driver=new	ChromeDriver();
	  
            driver.get("https://www.flipkart.com/");
            driver.manage().window().maximize();
            driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
            driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Samsung");
            driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
            Thread.sleep(2000);
            List<WebElement> mobilelist = driver.findElements(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']//a/div[2]/div[1]/div[1]"));
            System.out.println("Total Mobile Count="+mobilelist.size());
            for(WebElement mobile:mobilelist)
            {
               
              System.out.println(mobile.getText());
            	
            }
            
            driver.quit();
          
            
            
  }
}
