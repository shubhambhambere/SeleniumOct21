package com.aspire.selenium.TestNG;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SkipTestCase
{
	 @Test(enabled=false)
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
		
		}
	  @Test
		public void m4() 
		{
			Reporter.log(" 4", true);
		
		}
	  @Test
		public void m5() 
		{
			Reporter.log(" 5", true);
		}
	
	
}
