package com.aspire.selenium.TestNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FailXml
{

	  @Test
		public void m1() 
		{
			Reporter.log(" 1", true);
		}
	  @Test
		public void m2() 
		{
			Reporter.log(" 2", true);
			//Assert.fail();
		}
	  @Test
		public void m3() 
		{
			Reporter.log(" 3", true);
			//Assert.fail();
		}
	  @Test
		public void m4() 
		{
			Reporter.log(" 4", true);
			//Assert.fail();
		}
	  @Test
		public void m5() 
		{
			Reporter.log(" 5", true);
		}
	
	
	
}
