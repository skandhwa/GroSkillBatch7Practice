package PageFactoryClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateUserPage {
	
	WebDriver driver;
	
	public CreateUserPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[text()='New Customer']")
	WebElement newCustLink;
	
	
	@FindBy(xpath="//input[@name='name']")
	WebElement Cust_name;
	
	@FindBy(xpath="//input[@value='m']")
	WebElement Gender;
	
	@FindBy(xpath="//input[@name='dob']")
	WebElement Dob;
	
	@FindBy(xpath="//textarea[@name='addr']")
	WebElement Address;
	
	@FindBy(xpath="//input[@name='city']")
	WebElement City;
	
	@FindBy(xpath="//input[@name='state']")
	WebElement State;
	
	@FindBy(xpath="//input[@name='pinno']")
	WebElement Pin;
	
	
	@FindBy(xpath="//input[@name='telephoneno']")
	WebElement Mobile;
	
	
	@FindBy(xpath="//input[@name='emailid']")
	WebElement Email;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement Password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement Submit;
	
	@FindBy(xpath="//*[text()='Customer ID']//following-sibling::td")
	WebElement CustID;
	
	public void clickOnNewCustomer()
	{
		newCustLink.click();
	}
	
	
	public void enterUserName(String cname)
	{
		Cust_name.sendKeys(cname);
	}
	
	public void selectGender()
	{
		Gender.click();
	}
	
	public void enterDOB(String dob)
	{
		Dob.sendKeys(dob);
	}
	
	public void enterAddress(String address)
	{
		Address.sendKeys(address);
	}
	
	public void enterCity(String city)
	{
		City.sendKeys(city);
	}
	
	public void enterState(String state)
	{
		State.sendKeys(state);
	}
	
	
	public void enterPin(String pin)
	{
		Pin.sendKeys(pin);
	}
	
	public void enterMobile(String mobile)
	{
		Mobile.sendKeys(mobile);
	}
	
	public void enterEmail(String email)
	{
		Email.sendKeys(email);
	}
	
	public void enterPassword(String password)
	{
		Password.sendKeys(password);
	}
	
	public void clickOnSubmit()
	{
		Submit.click();
	}
	
	public String getCustomerID()
	{
	   return 	(CustID.getText());
		
	}

	

}
