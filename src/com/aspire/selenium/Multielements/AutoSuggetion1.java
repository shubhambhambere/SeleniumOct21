package com.aspire.selenium.Multielements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AutoSuggetion1 
{
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.edge.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	
	driver.get("https://www.google.co.in/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Realme");
	List<WebElement> Suggetions = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//div[1]/div[2]"));
	Thread.sleep(4000);
	for(WebElement suggetion:Suggetions)
	{
		System.out.println(suggetion.getText());
	}
	
	String exp="realme c11";
	
	for(WebElement temp:Suggetions)
	{
		String act=temp.getText();
		if(act.equals(exp))
		{
			System.out.println("Expected Output Printed");
			temp.click();
			
			
		}
		
		
	}
	
	
     
	
	
}
}
