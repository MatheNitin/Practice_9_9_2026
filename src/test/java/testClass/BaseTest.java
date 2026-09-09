package testClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import extentReport.ExtentReport_Generator;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class BaseTest{

	public static WebDriver  driver ;
	
	public static LoginPage lg; 
	 

	 
//	 public static ExtentReports extent ;
	
	@BeforeSuite
	public void initBrowser()
	{
		WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/v1/");		
	}
	
	
	@BeforeClass 
	public void createObject() 
	{
	  //	LoginPage lg= new LoginPage(driver);
		
		      lg= new LoginPage(driver);
		      
		     
		      
		   }
	
//	@AfterClass
//	public void tear()
//	{
//		extent.flush();
//	}
	
	
	@AfterSuite
    public void tearDown () 
    {
    	driver.quit();
  
    }	
}
