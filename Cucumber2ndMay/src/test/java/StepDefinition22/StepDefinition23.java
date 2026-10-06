package StepDefinition22;

import org.openqa.selenium.WebDriver;

import PageFactoryClasses.CreateUserPage;
import PageFactoryClasses.LoginPageClass;
import Utilities.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinition23 extends BaseClass {
	
	WebDriver driver=BaseClass.initializeDriver();
	LoginPageClass obj=new LoginPageClass(driver);
	CreateUserPage obj1=new CreateUserPage(driver);
	
	
	
	@Given("user opens the guru99 home page application")
	public void user_opens_the_guru99_home_page_application() 
	{
	 String title=	BaseClass.getTitle();
	// Assert.assertEquals(title, "Guru99");
	 
	}

	@Given("user enters the username as {string}")
	public void user_enters_the_username_as(String username) 
	{
	   obj.enterUserName(username);
	}

	@Given("user enters the password as {string}")
	public void user_enters_the_password_as(String password) 
	{
	    obj.enterPassword(password);
	}

	@When("user enters login button")
	public void user_enters_login_button() {
		
		obj.clickLogin();
	   
	}

	@Then("user will be able to login into the application")
	public void user_will_be_able_to_login_into_the_application() throws Exception 
	{
		String title=	BaseClass.getTitle();
		 if(title.contains("HomePage"))
		 {
			 System.out.println("Test case passed");
		 }
		 else
		 {
			 throw new Exception("Login not validated");
		 }
	}
	
	@Then("user clicks on the new customer link")
	public void user_clicks_on_the_new_customer_link() {
		
		obj1.clickOnNewCustomer();
	   
	}

	@Then("the user enters Customer Name as {string}")
	public void the_user_enters_customer_name_as(String CustomerName) {
		
		obj1.enterUserName(CustomerName);
	    
	}

	@Then("the user selects Gender as {string}")
	public void the_user_selects_gender_as(String Gender) {
		
		obj1.selectGender();
	    
	}

	@Then("the user enters Date of Birth as {string}")
	public void the_user_enters_date_of_birth_as(String DateOfBirth) {
		
		obj1.enterDOB(DateOfBirth);
	   
	}

	@Then("the user enters Address as {string}")
	public void the_user_enters_address_as(String Address) {
		
		obj1.enterAddress(Address);
	   
	}

	@Then("the user enters City as {string}")
	public void the_user_enters_city_as(String City) {
		
		obj1.enterCity(City);
	    
	}

	@Then("the user enters State as {string}")
	public void the_user_enters_state_as(String State) {
		
		obj1.enterState(State);
	   
	}

	@Then("the user enters PIN as {string}")
	public void the_user_enters_pin_as(String PIN) {
		
		obj1.enterPin(PIN);
	   
	}

	@Then("the user enters Mobile Number as {string}")
	public void the_user_enters_mobile_number_as(String MobileNumber) {
		
		obj1.enterMobile(MobileNumber);
	    
	}

	@Then("the user enters E-mail as {string}")
	public void the_user_enters_e_mail_as(String Email) {
		
		obj1.enterEmail(Email);
	   
	}

	@Then("the user enters Password as {string}")
	public void the_user_enters_password_as(String Password) {
		
		obj1.enterPassword(Password);
	   
	}

	@Then("the user clicks the Register button")
	public void the_user_clicks_the_register_button() {
		
		obj1.clickOnSubmit();
	  
	}

	@Then("the customer should be registered successfully")
	public void the_customer_should_be_registered_successfully() {
		
	String CustID=	obj1.getCustomerID();
	System.out.println(CustID);
	   
	}

	
	

}
