package com.aspire.selenium.Practice;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice1 
{
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Shubham");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Bhambere");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("8452081990");
	driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Shubha@2328");

	    WebElement dayselect = driver.findElement(By.xpath("//select[@id='day']"));
	
	
	Select S=new Select(dayselect);
	S.selectByIndex(22);
	S.selectByValue("28");
	S.selectByVisibleText("27");
	
       WebElement Firstselect = S.getFirstSelectedOption();
       System.out.println("Default Value:-"+Firstselect.getText());
	
	
    List<WebElement> allday = S.getOptions();
    System.out.println("get all Days");
    for(WebElement D:allday)
  
    {
    	System.out.print(D.getText()+",");
    }
    System.out.println();
    
    List<WebElement> selected = S.getAllSelectedOptions();
    for(WebElement D1:selected)
    {
    	System.out.print(D1.getText()+",");
    }
    
    
    System.out.println();
      TreeSet tr = new TreeSet();
    for(WebElement D3:allday)
    {
    	tr.add(D3.getText());
    }
    
    for(Object D5:tr)
    {
    	System.out.print(D5+",");
    }
	
	
	
}
	
	
}
