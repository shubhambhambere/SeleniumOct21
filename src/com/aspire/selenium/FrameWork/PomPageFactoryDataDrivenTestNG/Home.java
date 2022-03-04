package com.aspire.selenium.FrameWork.PomPageFactoryDataDrivenTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

	@FindBy(xpath="//img[@alt='Kite logo']")private WebElement Logo;
	@FindBy(xpath="//span[text()='PM']")private WebElement INITIALS;
	public  Home(WebDriver driver )
	{
		PageFactory.initElements(driver,this);
	}
	

	
	//logo verify
	public void logo(boolean lOGOValue) throws InterruptedException
	{   
		boolean logoact=Logo.isDisplayed();
		if(lOGOValue==logoact)
		{
			System.out.println("LogoDisplay Test Case pass");
		}
		else
		{
			System.out.println("LogoDisplay Test case Fail");
		}
		Thread.sleep(2000);
	}

	//initials 
public void Initials (String InitialValue) throws InterruptedException
{   String Expectinitial = InitialValue;
	String ActInitial=INITIALS.getText();
	System.out.println(ActInitial);
	if(Expectinitial.equals(ActInitial))
	{
		System.out.println("Initials name is TestCase Pass");
	}
	else
	{
		System.out.println("Initials name is TestCase Fail");
	}
	Thread.sleep(2000);

	
}

	
}
