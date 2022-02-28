package com.aspire.selenium.FrameWork.PomPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy (xpath="//img[@alt='Kite logo']") WebElement Actlogo;
	@FindBy (xpath="//span[text()='PM']") WebElement ActInitialName;

	
	public HomePage(WebDriver driver) 
	{
	  PageFactory.initElements(driver, this);
	}
	
	
	//logo verify
	public void logoVerify()
	{
		boolean exp = true;
		boolean act = ActInitialName.isDisplayed();
		if(act==exp)
		{
			System.out.println("LogoDisplay Test Case pass");
		}
		else
		{
			
			System.out.println("LogoDisplay Test case Fail");
		}
	}
	
	
	//initials 
   public void Initials()
   {    String ExpIn = "PM";
	   String actIn = ActInitialName.getText();
	   
	   if(ExpIn.equals(actIn))
	   {
		   System.out.println("Initials name is TestCase Pass");   
	   }
	   else
	   {
		   System.out.println("Initials name is TestCase Fail");
	   }
	   
   }

}
