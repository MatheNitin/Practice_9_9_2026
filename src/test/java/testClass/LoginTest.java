package testClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import listner.Listner;
import pages.LoginPage;

public class LoginTest extends Listner {

	@Test (priority =1)
	
	public void ValidateUsername() 
	{
		lg.clickOnUsername();
		
	//	test.info("UserName entre Correctly");
		
		 
	}
	
	@Test (priority =2)
	public void ValidatePassword() 
	{
	     lg.clickOnPassword();
	  
	 //    test.info("Password entre Correctly");
	     
	}
	
	@Test (priority=3)
	public void validateLoginButton() 
	{
		Assert.fail();
		
		lg.clickOnLoginButton();
		
		Assert.fail();
		
	//	test.info("Click on Login Button Correctly");
		
	}
	
}	
//------------------------------------------------------------------------
	
	

	             

