package com.aspire.selenium.TestNG;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping
{

	 @Test(groups="signin")
		public void m1() 
		{
			Reporter.log(" 1", true);
		}
	  @Test(groups="signin")
		public void m2() 
		{
			Reporter.log(" 2", true);
			
		}
	  @Test(groups="signin")
		public void m3() 
		{
			Reporter.log(" 3", true);
			
		}
	  @Test(groups="signout")
		public void m4() 
		{
			Reporter.log(" 4", true);
			
		}
	  @Test(groups="signout")
		public void m5() 
		{
			Reporter.log(" 5", true);
		}
	  
	  @Test(groups="signout")
		public void m6() 
		{
			Reporter.log(" 6", true);
		}
	  @Test(groups="payment")
		public void m7() 
		{
			Reporter.log(" 7", true);
		}
	  @Test(groups="payment")
		public void m8() 
		{
			Reporter.log(" 8", true);
		}
	  
	  
}
