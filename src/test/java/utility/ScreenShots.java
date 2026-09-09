package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class ScreenShots {

	
//	public void CaptureScreenshot(WebDriver driver ,String FileName) throws IOException
//	{
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		
//	   File screenshot = ts.getScreenshotAs(OutputType.FILE);
//	   
//	  String path = System.getProperty("user.dir")+"\\screenshots\\" + FileName+".png" ;
//	
//	   File  destinationpath = new File(path);
//	   
//	   FileHandler.copy(screenshot , destinationpath);	   
//	   
//	}
	
//---------------------------------------------------------------------------------	
	
	public String CaptureScreenshot(WebDriver driver ,String FileName) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		
	   File screenshot = ts.getScreenshotAs(OutputType.FILE);
	   
	  String path = System.getProperty("user.dir")+"\\Screenshots\\" + FileName+".png" ;
	
	   File  destinationpath = new File(path);
	   
	   FileHandler.copy(screenshot , destinationpath);	
	   
	   return path ;
	   
	}
	
}
