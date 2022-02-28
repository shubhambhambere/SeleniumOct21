package com.aspire.selenium.Practice;

import java.util.List;
import java.util.TreeSet;

import javax.swing.tree.TreeNode;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookMonth 
{public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	
	Dimension D = new Dimension(500,600);
	driver.manage().window().setSize(D);
	
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	Thread.sleep(2000);
	WebElement monthlist=driver.findElement(By.xpath("//select[@name='birthday_month']"));
	Select s = new Select(monthlist);
	List<WebElement> allmonth = s.getOptions();
	for(WebElement month:allmonth)
	{
		System.out.println(month.getText());
	}
	Thread.sleep(2000);
	 TreeSet<String> tr = new TreeSet();
	
	for(WebElement m1:allmonth)
	{
		tr.add(m1.getText());
	}
	for(Object tr1:tr)
	{
		System.out.println(tr1);
	}
	 
	
	
	
	 
}
}
