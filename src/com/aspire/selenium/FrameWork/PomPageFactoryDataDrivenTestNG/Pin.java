package com.aspire.selenium.FrameWork.PomPageFactoryDataDrivenTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pin {
	@FindBy(xpath="//input[@id='pin']")private WebElement Pin;
	@FindBy(xpath="//button[@type='submit']")private WebElement Cntbtn;
	public Pin(WebDriver driver )
	{
		PageFactory.initElements(driver,this);
	}
	
	         //pin
	     public void PIN(String PINValue) throws InterruptedException
	     {
	    	 Pin.sendKeys(PINValue);
	    	 Thread.sleep(2000);
	     }
	     
	     	//Continue button
		public void ContinuBtn() throws InterruptedException {
			Cntbtn.click();
		  Thread.sleep(2000);
		}
	     
}
