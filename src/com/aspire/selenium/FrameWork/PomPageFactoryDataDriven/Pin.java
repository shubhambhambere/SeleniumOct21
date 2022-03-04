package com.aspire.selenium.FrameWork.PomPageFactoryDataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pin {
	
	@FindBy(xpath="//input[@id='pin']")private  WebElement pin;
	@FindBy(xpath="//button[@type='submit']") private WebElement ContBtn;
	
     public Pin(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	//pin
	public void PinEnter(String PinValue)
	{
		pin.sendKeys(PinValue);
	}
	
	
	//driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("976976");
	//Continue button
	public void Continuebtn() 
	{
		ContBtn.click();
	}

	//driver.findElement(By.xpath("//button[@type='submit']")).click();

}
