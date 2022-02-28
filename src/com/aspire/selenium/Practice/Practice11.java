package com.aspire.selenium.Practice;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Practice11 
{
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	driver.manage().window().maximize();
	WebElement seleniumdropdown=driver.findElement(By.xpath("//a[text()='Selenium Practice']"));
	Actions act=new Actions(driver);
	act.moveToElement(seleniumdropdown).perform();
	Thread.sleep(2000);
	for(int i=1;i<=8;i++)
	{
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
	}	

	act.sendKeys(Keys.ENTER).perform();
	act.doubleClick().perform();
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//button[text()='Click me'])[1]")).click();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
	Thread.sleep(2000);
	driver.switchTo().alert().dismiss();
	driver.findElement(By.xpath("//button[@id='promptBox']")).click();
	Thread.sleep(2000);
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();	
	driver.navigate().back();
	driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
	Set<String> ids = driver.getWindowHandles();
	System.out.println(ids);
	
	ArrayList<String> al=new ArrayList<String>(ids);
	driver.switchTo().window(al.get(1));
	Thread.sleep(2000);
	System.out.println(driver.findElement(By.xpath("//h1[@class='post-title entry-title']")).getText());
	
	TakesScreenshot ts = (TakesScreenshot)driver;	
	File Source = ts.getScreenshotAs(OutputType.FILE);
	File Dest=new File("D:\\Java project\\OCT 21\\SeleniumOct21\\ScreenShot\\Selenium.png");
	FileHandler.copy(Source, Dest);
	Thread.sleep(5000);
	driver.quit();
	
}
	
	
}
