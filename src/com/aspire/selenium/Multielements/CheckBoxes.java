package com.aspire.selenium.Multielements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes
{
public static void main(String[] args) throws InterruptedException {

  System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");	
  WebDriver driver=new ChromeDriver();
  driver.get("https://demo.guru99.com/test/radio.html");
  Thread.sleep(2000);

  List<WebElement> Allelements = driver.findElements(By.xpath("//div[@style='margin-left:20px;']/input"));
  System.out.println(Allelements.size());
  
//  for(WebElement allelement:Allelements)
//  {
//	  Thread.sleep(2000);
//	  allelement.click();
	  
//  }
  
  for(int i=0;i<Allelements.size();i++)
  {
	  Thread.sleep(2000);
	  Allelements.get(i).click();
	 
  }
  
  
  
  
   driver.quit();
  
  
  
	
}
}
