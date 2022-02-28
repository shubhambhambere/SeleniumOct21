package com.aspire.selenium.MultiBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Sample2
{    static WebDriver  driver;

	 
	
public static void main(String[] args) {
	//chrome
	 String s="firefox";
	if(s.equals("chrome"))
	{
	
	System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	       driver=new ChromeDriver();
	}
	//IE
	else if(s.equals("IE"))
	{
       	System.setProperty("webdriver.InternetExplorerDriver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\IEDriverServer.exe");	
	       driver = new InternetExplorerDriver();
	
	}    
	  //Edge 
	else if(s.equals("edge"))
	{
	  System.setProperty("webdriver.edge.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\msedgedriver.exe");
	    driver = new EdgeDriver();

	} 
	else if(s.equals("firefox"))
	{
		System.setProperty("webdriver.geckodriver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\geckodriver.exe");
	    driver = new FirefoxDriver();
		
	}
	  
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.close();
	
	
}
}
