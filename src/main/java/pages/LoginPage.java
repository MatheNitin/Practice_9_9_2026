package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver ;
	
	@FindBy (xpath="//input[@name='user-name']")
	WebElement  Username ;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement Password;
	
    @FindBy (xpath="//input[@class='btn_action']")
	WebElement LoginButton ; 
	
	
	public LoginPage (WebDriver driver)
	{
		PageFactory.initElements(driver,this );
		this.driver = driver ;
	}
	
	public void clickOnUsername() 
	{
	
	//	Username.click();
		Username.sendKeys("standard_user");
	}
	
	public void clickOnPassword() 
	{
	
	//	Password.click();
		Password.sendKeys("secret_sauce");
	}
	
	public void clickOnLoginButton() 
	{
		
		LoginButton.click();
	}
	
	public String getTitleOfPage()
	{
		String titleofPage =driver.getTitle();
		
		return titleofPage ;
	}
	
}
