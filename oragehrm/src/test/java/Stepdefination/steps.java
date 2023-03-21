package Stepdefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Pageobject_library.AddNew_employee;
import Pageobject_library.Loginpage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class steps extends Besic

{
	public WebElement emplist;
	public AddNew_employee empl;

	@Given("^i lunch chrome browser$")
	public void i_lunch_chrome_browser() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver= new ChromeDriver();
	    lp=new Loginpage(driver);
	    
	}

	@When("^i open with url \"([^\"]*)\"$")
	public void i_open_with_url(String url) throws Throwable {
	   driver.get(url);
	}

	@Then("^i should see admin login page$")
	public boolean i_should_see_admin_login_page() throws Throwable {
	   if(driver.findElement(By.id("btnLogin")).isDisplayed())
	   {
		   return true;
	   }else
	   {
		   return false;
	   }
	}

	@When("^i enter username as \"([^\"]*)\"$")
	public void i_enter_username_as(String uid) throws Throwable {

           lp.setusername1(uid);
	}

	@When("^i enter userpassword as \"([^\"]*)\"$")
	public void i_enter_userpassword_as(String pwd) throws Throwable {
	   lp.setuserpassword(pwd);
	}

	@When("^i click login$")
	public void i_click_login() throws Throwable {

      lp.setloginbutten();  
	}

	@Then("^i should see admin modul displayed$")
	public boolean i_should_see_admin_modul_displayed() throws Throwable {

  if( driver.findElement(By.linkText("Admin")).isDisplayed())
  {
	  return true;
  }else
  {
	  return false;
  }
	}

	@When("^i click logout$")
	public void i_click_logout() throws Throwable {
	    lp.Welcomeclick();
	    Thread.sleep(2000);
	    lp.logoutclick();
	}

	@When("^i close the Browser$")
	public void i_close_the_Browser() throws Throwable {
	 driver.close();
	}
	
	@Then("^i should see erorr message$")
	public boolean i_should_see_erorr_message() throws Throwable {
		String errmsg=	driver.findElement(By.id("spanMessage")).getText();
		if(errmsg.toLowerCase().contains("invalid"))
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	@When("^i goto add employee page$")
	public void i_goto_add_employee_page() throws Throwable 
	{
		empl=new AddNew_employee(driver);
		empl.PIMlink();
		empl.Addemplink();
	   
	}

	@When("^i enter first name \"([^\"]*)\"$")
	public void i_enter_first_name(String fname) throws Throwable {
	   empl.Firstname(fname);
	}

	@When("^i enter last name \"([^\"]*)\"$")
	public void i_enter_last_name(String lname) throws Throwable {
	   empl.lastname(lname);
	}

	@When("^i click save$")
	public void i_click_save() throws Throwable {
	    empl.employeeid();
	    empl.save();
	}

	@Then("^i shoud see employee personal details$")
	public boolean i_shoud_see_employee_personal_details() throws Throwable {
	   if(driver.findElement(By.linkText("Personal Details")).isDisplayed())
	   {
		   return true;
	   }else
	   {
		   return false;
	   }
	}

	@When("^i click Employee list$")
	public void i_click_Employee_list() throws Throwable {
	   empl.employeelist();
	  
	   
	}

	@Then("^i should see registered employee in employee list$")
	public void i_should_see_registered_employee_in_employee_list( ) throws Throwable {
		 empl.employeesearchid();
		 
		 Thread.sleep(2000);
		 
		   empl.search();
		   
    empl.empolyeetable();
//    List<WebElement>rows=emplist.findElements(By.tagName("tr"));
//    boolean flag=false;
//    for(int i=1;i<rows.size();i++)
//    {
//    List<WebElement>colms=	rows.get(i).findElements(By.tagName("td"));
//    
//        if(colms.get(1).equals(empl))
//        {
//        	flag=true;
//        }
//    }
//	   return flag;
	}
	
	
	
}
