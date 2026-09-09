package testClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import listner.Listner;
import listner.Listner1;
import pages.LoginPage;

public class LoginTest1 extends BaseTest {

	@Test (priority =1)
	
	public void ValidateUsername() 
	{
		lg.clickOnUsername();
		
		Listner1.test.info("UserName entre Correctly"); 	// Report मध्ये ह्या step पण कळाव्या कि 
	                                            //  Testcase कोणती execute झाली आहे म्हणून 
	                                            //  info() method चा उपयोग केलाय 
		 
	}
	
	@Test (priority =2)
	public void ValidatePassword() 
	{
	     lg.clickOnPassword();
	  
	     Listner1.test.info("Password entre Correctly");
	     
	}
	
	@Test (priority=3)
	public void validateLoginButton() 
	{
		Assert.fail();         // fail झाल्यावर Screenshot येत नाहीये . कारण आपण project मध्ये 
		                       // Screenshot नावाचा folder बनविलेला नाहीये . म्हणून screenshot 
		                       // दिसत नाही . So folder बनविल्यावर screenshot दिसेल . 
		
		lg.clickOnLoginButton();		
		
		
		Listner1.test.info("Click on Login Button Correctly");
		
	}
	
}	
//------------------------------------------------------------------------
	
	

	             

