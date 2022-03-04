package com.aspire.selenium.FrameWork.PomPageFactoryDataDrivenTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login
{
	@FindBy(xpath="//input[@id='userid']") private WebElement UN;
	@FindBy(xpath="//input[@id='password']") private WebElement Pas;
	@FindBy(xpath="//button[@type='submit']")private WebElement Loginbtn;
	
	public Login(WebDriver driver )
	{
		PageFactory.initElements(driver,this);
	}
	
	
		//Username
	public void UserName(String UNname) throws InterruptedException
	{
		UN.sendKeys(UNname);
		Thread.sleep(2000);
	}

		//Password
	public void Password(String Pass) throws InterruptedException
	{
	 Pas.sendKeys(Pass);	
	 Thread.sleep(2000);
	}
		
		//login button
		public void LoginButton()
		{
			Loginbtn.click();
		}

		
	
		
		
	}
	
	

