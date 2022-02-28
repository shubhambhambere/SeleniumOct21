package com.aspire.selenium.MultiBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Sample
{
	   static   WebDriver driver;
	   static String s="edge";
	
	public static void main(String[] args) {
	//ChromeDriver
		if(s.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	     driver	=new ChromeDriver();
		}
	     //internetexplorer
		else if(s.equals("internetexplorer"))
		{
	           
	    System.setProperty("webdriver.internetexplorer.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\IEDriverServer.exe");
	           driver= new  InternetExplorerDriver();
		}
	//Edge     
	           
		else if(s.equals("edge"))
		{
	    System.setProperty("webdriver.edge.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\msedgedriver.exe") ; 
	          driver= new EdgeDriver();
	    
		}
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();


	    
	    
	    
		
		
	}
	

}
