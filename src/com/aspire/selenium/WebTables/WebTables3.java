package com.aspire.selenium.WebTables;
// World population Country wise Table 
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables3
{
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.worldometers.info/world-population/population-by-country/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	// Header list
	List<WebElement> header = driver.findElements(By.xpath("//table[@id='example2']/thead//th"));
	System.out.println("No of Column="+header.size());
	System.out.println();
	for(WebElement head:header)
	{
		System.out.println(head.getText());
	}
	
//	//Rows INDIA
//	List<WebElement> INDIALIST = driver.findElements(By.xpath("//tr[@role='row'][2]/td"));
//	for(WebElement INDIA:INDIALIST)
//	{
//		System.out.println(INDIA.getText());
//	}
//	
//	//Column
//	List<WebElement> SrNO = driver.findElements(By.xpath("//table[@id='example2']//td[1]"));
//	
//	System.out.println("No Of Rows ="+SrNO.size());
//	for(WebElement sr:SrNO)
//	{
//		System.out.print(sr.getText()+",");
//	}
//	
	
	
	//body
	
        List<WebElement> body = driver.findElements(By.xpath("//table[@id='example2']//td"));
             
	for(WebElement ele:body)
	{
		System.out.println(ele.getText());
	}
	
	
	
	driver .quit();	
	}

}
