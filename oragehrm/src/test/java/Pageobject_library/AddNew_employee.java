package Pageobject_library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNew_employee
{

	 public WebDriver ldriver;
	 
		public  AddNew_employee(WebDriver driver)
		   {
			  ldriver=driver; 
			  PageFactory.initElements(driver, this);
		   }
	
	  @FindBy(linkText="PIM")
	   WebElement PIM_link;
	  
	  @FindBy(linkText="Add Employee")
	  WebElement AddEMP_link;
	  
	  @FindBy(id="firstName")
	  WebElement firstname_element;
	  
	@FindBy(id="lastName")
	WebElement lastname_element;
	
	@FindBy(id="employeeId")
	WebElement empid_element;
	
	@FindBy(id="btnSave")
	WebElement save_element;
	
	@FindBy(linkText="Employee List")
	WebElement emplist_link;
	
	@FindBy(id="empsearch_id")
	WebElement serchEMP_Id;
	
	@FindBy(id="searchBtn")
	WebElement search_element;
	
	@FindBy(id="resultTable")
	WebElement emptableList;
	
	
	String emp;
	public void PIMlink()
	{
		PIM_link.click();

	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
	public void Addemplink()
	{
		AddEMP_link.click();
		
	}
	
	public void Firstname(String fname)
	{
		firstname_element.sendKeys(fname);
	}
	public void lastname(String lname)
	{
		lastname_element.sendKeys(lname);
	}
	public void employeeid()
	{
	 emp=empid_element.getAttribute("value");
	}
	public void save()
	{
		save_element.click();
	}
	public void employeelist()
	{
		emplist_link.click();
	}
	public void employeesearchid()
	{
		serchEMP_Id.sendKeys(emp);
	}
	public void search()
	{
		search_element.click();
	}
	public  void empolyeetable()
	{
       WebElement emplist= emptableList;
	}
}
