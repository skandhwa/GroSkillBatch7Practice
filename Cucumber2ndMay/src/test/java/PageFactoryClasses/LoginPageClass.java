package PageFactoryClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class LoginPageClass extends BaseClass 
{
	WebDriver driver;
	
	public LoginPageClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(css="[name='uid']")
	WebElement userID;
	
	@FindBy(css="[name='password']")
	WebElement pwd;
	
	@FindBy(css="[name='btnLogin']")
	WebElement btnLogin;
	
	public void enterUserName(String uname)
	{
		userID.sendKeys(uname);
	}
	
	public void enterPassword(String password)
	{
		pwd.sendKeys(password);
	}
	
	public void clickLogin()
	{
		btnLogin.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
