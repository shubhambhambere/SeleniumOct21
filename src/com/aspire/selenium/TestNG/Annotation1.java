package com.aspire.selenium.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation1
{
     @BeforeMethod
	public void m1() 
	{
		Reporter.log(" 1", true);
	}
     @AfterMethod
	public void m2() 
	{
		Reporter.log(" 2", true);
	}
     @BeforeClass
	public void m3() 
	{
		Reporter.log(" 3", true);
	}
     @AfterClass
	public void m4() 
	{
		Reporter.log(" 4", true);
	}
     @BeforeTest
	public void m5() 
	{
		Reporter.log(" 5", true);
	}
     @AfterTest
	public void m6() 
	{
		Reporter.log(" 6", true);
	}
     @Test
	public void m7() 
	{
    	 Reporter.log(" 7", true);
	}
	
	
	
}
