package com.aspire.selenium.Practice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp 
{


	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	WebDriver driver=new	ChromeDriver();
	driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[@id='win1']")).click();
	String homepagetext=driver.findElement(By.xpath("//label[contains(text(),'Drag and drop')]")).getText();
	System.out.println(homepagetext);
	String id=driver.getWindowHandle();
	System.out.println(id);
	Thread.sleep(2000);
	Set<String> ids = driver.getWindowHandles();
    ArrayList<String>al=new ArrayList<String>(ids);
    driver.switchTo().window(al.get(1));
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Samsung");
    
    
	
	
	}
	
}
