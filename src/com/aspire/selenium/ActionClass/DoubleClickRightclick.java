package com.aspire.selenium.ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickRightclick 
{
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    Thread.sleep(2000);
    driver.get("https://demo.guru99.com/test/simple_context_menu.html");
    Actions act = new Actions(driver);
    act.contextClick().perform();
// Without Xpath if We Perform Context click action it click on top left corner of page  
  
    
 // Right click/Context Click Action    
	WebElement Rightclick = driver.findElement(By.xpath("//span[contains(@class,'conte')]"));
   
	act.contextClick(Rightclick).perform();
	Thread.sleep(5000);
 
// Double click Action 
	WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	
	act.doubleClick(doubleclick).build().perform();
	Thread.sleep(5000);
	
	driver.quit();
}
}
