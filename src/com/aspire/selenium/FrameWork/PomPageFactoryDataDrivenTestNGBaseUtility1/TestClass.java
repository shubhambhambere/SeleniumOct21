package com.aspire.selenium.FrameWork.PomPageFactoryDataDrivenTestNGBaseUtility1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.bouncycastle.oer.its.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aspire.selenium.FrameWork.PomPageFactoryDataDrivenTestNGBaseUtility.Utility;



public class TestClass extends BaseClass
{
	
	
	
	Login lp;
	 Pin  pp;
	 Home hp;
	 DashBoard dp;
	 @BeforeTest
	public  void BrowserLaunch() throws EncryptedDocumentException, IOException {
		BrowserOpen();
		 lp=new Login (driver);	
		 pp=new Pin (driver); 
		 hp=new Home(driver);	
		 dp=new DashBoard(driver);
	}
	@BeforeClass
	public void Loginapp() throws EncryptedDocumentException, IOException
	{
		 
		 lp.UserName(Utillity1.Testdata(10, 1));
		 lp.Password(Utillity1.Testdata(10, 2));
		 lp.Loginbtn();

		
		 
		 pp.Pin(Utillity1.Testdata(10, 3));
		 pp.ContinueBtn();
		 
		
	}
	
		@Test
		 public void InintialVerification() throws EncryptedDocumentException, IOException
		 {
		    String ExpValue = Utillity1.Testdata(10,6);
			String ActValue = hp.verifyInitialName();
		    Assert.assertEquals(ExpValue, ActValue);
		
			
		 }
		@Test
		public void LogoVerification() throws IOException
		{
		   boolean ExpValue = Utillity1.Testdata1(10, 4);
		   boolean actlogo = hp.verifylogo();
			Assert.assertEquals(ExpValue, actlogo,"Test Case Fail plz Enter Correct Boolean value ");  
		
		}
		@AfterMethod
		public void DashBoard(ITestResult result) throws IOException
		{
			if(result.getStatus()==ITestResult.SUCCESS)
			{
			    Utillity1.screenShot(driver);
			}
			
			
			hp.ClickInitial();
			dp.ProfileClick();
		}
		
		@AfterClass
		public void BrowserClose()
		{
			driver.quit();
		}
		 
		 
		
		 
		
		   
		 
	     
	 
	
		
	
}
