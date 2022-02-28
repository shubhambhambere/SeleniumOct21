package com.aspire.selenium.TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation
{

	//Senario For login Functionality
	@BeforeMethod
	public void Username()
	{
		Reporter.log("Useranme Entered Succesfully", true);
		
	}
	@Test
	public void Password() 
	{
		Reporter.log("Password enter Succesfully", true);
		Assert.fail();
	}
	@Test
	public void signIn ()
	{
		Reporter.log("SignIni Succefully", true);
	}
	@Test
	public void VerifyUser()
	{
		Reporter.log("User Verify Succcesfully", true);
	}
	
	
	
	
	
	
	
}
