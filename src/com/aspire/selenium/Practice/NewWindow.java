package com.aspire.selenium.Practice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow 
{

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	WebDriver driver=new	ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("(//button[@class='whButtons'])[2]")).click();
	Set<String> ids=driver.getWindowHandles();
	ArrayList<String> al=new ArrayList(ids); 
	
	driver.switchTo().window(al.get(1));
	System.out.println(driver.findElement(By.xpath("//h1[contains(@class,'post-title entry')]")).getText());
	driver.switchTo().window(al.get(0));
	System.out.println(driver.findElement(By.xpath("//h1[@class='post-title entry-title']")).getText());
	
}
}
