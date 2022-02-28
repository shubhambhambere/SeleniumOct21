package com.aspire.selenium.Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;
//take diff screen shot with unique name  and save in destination folder
public class prg4 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		      String randomname = RandomString.make(3);
		      
		File destination = new File("D:\\Java project\\OCT 21\\SeleniumOct21\\ScreenShot\\"+randomname+".jpg");
		FileHandler.copy(source,destination);
		System.out.println(destination);
	}
	
}
