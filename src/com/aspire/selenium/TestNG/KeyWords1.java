package com.aspire.selenium.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class KeyWords1
{
//     @Test (invocationCount=2,priority=1)
//	public void m1()
//	{
//		Reporter.log("Pass m1", true);
//	}
//	
//     @Test(priority=2)
// 	public void m2()
// 	{
// 		Reporter.log("Pass m2", true);
// 	}
//     @Test(enabled=false)
// 	public void m3()
// 	{
// 		Reporter.log("Pass m3", true);
// 	}
//     
//     @Test(priority=-2)
// 	public void m4()
// 	{
// 		Reporter.log("Pass m4", true);
// 	}
//     @Test(priority=-3)
// 	public void m5()
// 	{
// 		Reporter.log("Pass m5", true);
// 	}
//     @Test(timeOut=3000)
// 	public void m6() throws InterruptedException
// 	{   Thread.sleep(2000);
// 		Reporter.log("Pass m6", true);
// 	}
//     @Test(enabled=false)
// 	public void m7()
// 	{
// 		Reporter.log("Pass m7", true);
// 	}

@Test (timeOut=1000)
public void login() throws InterruptedException
{   Thread.sleep(2000);
	Reporter.log("login Successful",true);
}


@Test (dependsOnMethods= {"login"})
public void logout()
{
	Reporter.log("logout Successful",true);
}
     
     
     
	
}
