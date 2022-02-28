package com.aspire.selenium.select;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Select1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		
		
		Thread.sleep(2000);

				driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Shbham");
				driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Bhambere");
				driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("8452081990");
				driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Shubham650");
				Thread.sleep(2000);
				
			driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();
// Day List			
			WebElement dayselect = driver.findElement(By.xpath("//select[@id='day']"));
			
	        Select s = new Select(dayselect);
	        
	        WebElement dayselected = s.getFirstSelectedOption();
	        System.out.println("default seletced Day Value from day list:-"+dayselected.getText());
	        
	        
			s.selectByIndex(22);          //Select by index Pass int value
			Thread.sleep(2000);
            s.selectByValue("28");            //Select by value Pass String Value
			Thread.sleep(2000);
            s.selectByVisibleText("27");       //Select By visible pass String value is Shown on html code
            Thread.sleep(2000);

            
            
  // Monthh list
            
            WebElement monthlist = driver.findElement(By.xpath("//select[@id='month']"));
   // Feb-Oct-Dec         
            Select s1=new Select(monthlist);
                     
           WebElement mon = s1.getFirstSelectedOption();
           System.out.println("Default Month Selected:-"+mon.getText());
           
           s1.selectByIndex(1);
           Thread.sleep(2000);
           s1.selectByValue("10");
           Thread.sleep(2000);
           s1.selectByVisibleText("Dec");
           
           
 //is multiple
           
           List<WebElement> day1 = s.getOptions();
           
           for(WebElement D:day1)
           {
        	   System.out.print(D.getText()+",");
           }
           
           List<WebElement> day2 = s.getAllSelectedOptions();
           
            for(WebElement D1:day2)
            {
            	System.out.print(D1.getText()+",");
            }
            
            System.out.println();
            
     // is multiple For Month
            List<WebElement> month = s1.getOptions();
            for(WebElement M:month)
            {
            	System.out.print(M.getText()+",");
            }
            
            List<WebElement> selectedmonth = s1.getAllSelectedOptions();
            
            for(WebElement M1:selectedmonth)
            {
            	System.out.print(M1.getText()+",");
            }
            System.out.println();
            
          TreeSet tr = new TreeSet();
            
          for(WebElement treemonth:month)
          {
        	  tr.add(treemonth.getText());
          }
            
          for(Object trm:tr)
          {
        	  System.out.println(trm);
          }
            
            
            
	}
	
	
}
