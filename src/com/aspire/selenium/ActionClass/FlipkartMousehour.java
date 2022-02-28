package com.aspire.selenium.ActionClass;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class FlipkartMousehour 
{
public static void main(String[] args) throws IOException, InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
    WebElement fashion = driver.findElement(By.xpath("(//div[@class='xtXmba'])[4]"));
    Actions act=new Actions(driver);
	act.moveToElement(fashion).perform();
	Thread.sleep(2000);
	 List<WebElement> fashiolist = driver.findElements(By.xpath("//div[contains(@class,'_3_')]//a"));
//	for(WebElement fs:fashiolist)
//	{
//		System.out.println(fs.getText());
//	}
	String exp="Men's Top Wear";
	
	for(WebElement fashion1:fashiolist)
	{
		String actual=fashion1.getText();
		if(actual.equals(exp))
		{
			fashion1.click();
			
			System.out.println("Expected output Printed");
			break;
		}
//		Thread.sleep(2000);
//		WebElement modelpic = driver.findElement(By.xpath("((//div[@class='_1xHGtK _373qXS'])[1]//img)[1]"));
//		Thread.sleep(2000);
//		File source = modelpic.getScreenshotAs(OutputType.FILE);
//		File Dest=new File("D:\\Java project\\OCT 21\\SeleniumOct21\\ScreenShot");
//		FileHandler.copy(source, Dest);
		
	}
		
	
}
}
