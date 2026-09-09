package listner;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import extentReport.ExtentReport_Generator;
import testClass.BaseTest;
import utility.ScreenShots;




public class Listner1  implements ITestListener 
{
	ExtentReports extent =ExtentReport_Generator.extentReport_Generator();
	
	public static ExtentTest test ;
	
	public void onTestStart(ITestResult result) 
	{
//		System.out.println("Test Cases Started ");
//		
//		System.out.println(result.getName());
		
		System.out.println("Test Cases Started :" + result.getName());
		
//		ExtentTest test = extent.createTest(result.getName());
		
	        test = extent.createTest(result.getName());
	}
	
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("Test Cases Sucess :" + result.getName());
		
		test.log(Status.PASS, "Test Case Passed");
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test Cases Failed :" + result.getName());
		
//		test.log(Status.FAIL, "Test Case Failed");
//		
		test.fail(result.getThrowable());
		
		ScreenShots scr = new ScreenShots ();
		
		try {
			
			     test.addScreenCaptureFromPath(scr. CaptureScreenshot(BaseTest.driver,result.getName()));
			    
		//	 scr. CaptureScreenshot(driver,result.getName());
		    
		     }
		catch (IOException e) 
		     {
		 	     System.out.println("Exception arrived while Taking Screenshot");
		
		       }
	 }

	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Test Cases Skipped :" + result.getName());
		
	//	test.log(Status.SKIP, "Test Case Skipped");
		
	}

	public void onStart(ITestContext context) // जेव्हा @Test (test tag )सुरू होईल तेव्हा हि method run होईल .  
	{                                         // हि method Run झाल्यावर आपल्याला त्या Test tag च जे नाव आहे ते 
		                                      // पण हव असेल तर आपण getName() method Use करणार 
		System.out.println("Test Tag Started : "+ context.getName()); 
	}

	public void onFinish(ITestContext context) 
	{
		System.out.println("Test Tag Finished : "+ context.getName());
		
		extent.flush();
	}
	
}	
