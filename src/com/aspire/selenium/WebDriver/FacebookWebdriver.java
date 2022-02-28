package com.aspire.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookWebdriver {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Java project\\OCT 21\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
//Is dispaly	
		boolean FaceBookLogo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
		System.out.println("FaceBookLogoIs Displayed:-"+FaceBookLogo);
		
		if(FaceBookLogo==true)
		{
			System.out.println("facebookLogo visible");
		}
		else
		{
			System.out.println("faceBook Logo NOt Display");
		}
		
//IS ENABLED 
		
		boolean EmailTExtFiled = driver.findElement(By.xpath("//input[@id='email']")).isEnabled();
		System.out.println("EmailText Field Enable:-"+EmailTExtFiled);
		
		
// is Select
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Shbham");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Bhambere");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("8452081990");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Shubham650");
		Thread.sleep(2000);
		
	driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();
	
		
	    boolean maleButton = driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).isSelected();
		System.out.println("Male Button Selected:-"+maleButton);
		
		boolean femalebutton = driver.findElement(By.xpath("(//label[@class='_58mt'])[1]")).isSelected();
		System.out.println("Female Button Selected:-"+femalebutton);
	      
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		
	}
	
}
