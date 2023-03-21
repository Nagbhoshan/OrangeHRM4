package Pageobject_library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{

	   public  WebDriver ldriver;
	   
	   

	public  Loginpage(WebDriver driver)
	   {
		  ldriver=driver; 
		  PageFactory.initElements(driver, this);
	   }
	   
	   @FindBy(id="txtUsername")
	   WebElement username;
	
	   @FindBy(id="txtPassword")
	   WebElement userpwd;
	
	   @FindBy(id="btnLogin")
	WebElement loginbutten;
	   
	  @FindBy(partialLinkText="Welcome")
	   WebElement log_welcome;
	  
	  @FindBy(linkText="Logout")
	  WebElement log_logout;
	  
	  
	   
	public void setusername1(String usern)
	{
		username.sendKeys(usern);
	}
	
	public void setuserpassword(String upwd)
	{
		userpwd.sendKeys(upwd);
	}
	
	public void setloginbutten()
	{
		loginbutten.click();
	}
	
	
	public void Welcomeclick() 
	{
		log_welcome.click();
		
	}
	public void logoutclick()
	{
		log_logout.click();
	}
}
