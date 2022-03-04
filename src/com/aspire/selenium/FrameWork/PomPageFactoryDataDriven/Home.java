package com.aspire.selenium.FrameWork.PomPageFactoryDataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	@FindBy(xpath="//img[@alt='Kite logo']")private  WebElement logo;
	@FindBy(xpath="//span[text()='PM']")private  WebElement Initial;
	
     public Home(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	//logo verify
	public void logoVerify(boolean logoexp)
	{  
		boolean logoact = logo.isDisplayed();
		if(logoexp==logoact)
		{
			System.out.println("LogoDisplay Test Case pass");
		}
		else
		{
			System.out.println("LogoDisplay Test case Fail");
		}	
	}
	//initials 
      public void initial(String inintialexpaname)
      {   
    	  String intialactname = Initial.getText();
    	  if(inintialexpaname.equals(intialactname))
    	  {
    		  System.out.println("Initials name is TestCase Pass");
    	  }
    	  else
    	  {
    		  System.out.println("Initials name is TestCase Fail");
    	  }
      }
	
}
