package extentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport_Generator {
	
	
//	public static void extentReport_Generator ()
//	{
//	  String path = System.getProperty ("user.dir") +
//			  
//			        "//Reports//SaucedemoReport.Html";  
//	
//	   // In this method we will just define the Look and feel of the Report
//	  
//	  ExtentHtmlReporter reporter  =new ExtentHtmlReporter (path) ;
//	  
//	           reporter .config().setTheme(Theme.DARK);
//	  
//	         reporter.config().setReportName("Saucedemo_Report");
//	         
//	    ExtentReports extent = new ExtentReports() ; 
//	    
//	    extent.attachReporter(reporter);
//	    
//	    extent.setSystemInfo("Browser Used", "Chrome");
//	    
//	    extent.setSystemInfo("Executed By", "Automation");
//	    
//	    extent.setSystemInfo("Environment", "SIT");    
//	    
//	}
	
//--------------------------------------------------------------------------
	
	
	static ExtentReports extent ; //<--static method च्या आतमध्ये non-static variable 
    //    access करू शकत नाही . म्हणून Static define केल 
       
        public static ExtentReports extentReport_Generator ()
         { 
        String path = System.getProperty ("user.dir")+"//Reports//livingLiquidsReport.Html";  

           // In this method we will just define the Look and feel of the Report

          ExtentHtmlReporter reporter  =new ExtentHtmlReporter (path) ;

           reporter .config().setTheme(Theme.DARK);

           reporter.config().setReportName("Revision Livingliquids_Report");

           //   ExtentReports extent = new ExtentReports(); 

            extent = new ExtentReports();

             extent.attachReporter(reporter);

             extent.setSystemInfo("Browser Used", "Chrome");

            extent.setSystemInfo("Executed By", "Automation");

             extent.setSystemInfo("Environment", "SIT");

            return extent;
}


}
