package com.aspire.selenium.Practice;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class KissanKonnect
{
public static void main(String[] args) throws IOException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.kisankonnect.in/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("(//div[@role='combobox'])[2]")).click();
	driver.findElement(By.xpath("(//div[@role='option'])[2]")).click();
// screen Shot for Home Page	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File Source=ts.getScreenshotAs(OutputType.FILE);
	File  Target=new File("D:\\Java project\\OCT 21\\SeleniumOct21\\ScreenShot\\KisanKonnect1.png");
	FileHandler.copy(Source, Target);
	
//screen Shot for Logo	
	WebElement logo=driver.findElement(By.xpath("(//img[@alt='KisanKonnect'])[1]"));
    File source=logo.getScreenshotAs(OutputType.FILE);
	File  target=new File("D:\\Java project\\OCT 21\\SeleniumOct21\\ScreenShot\\Logo.png");
	FileHandler.copy(source, target);
	
//Handle Multi Webelement Get all Module Text on Page
	
//	List<WebElement> listele = driver.findElements(By.xpath("//nav[@class='cate_list']//a"));
//	
//	for(WebElement ele:listele)
//	{
//		System.out.println(ele.getText());
//	}

	
	
	driver.quit();
	
	
	
	
	
	
}
}
