package Utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass 
{

	static String browserName;
	public static WebDriver driver;
	
	public static WebDriver initializeDriver() 
	{
		try {
			browserName=FetchDataFromProperty.getDataProperty().getProperty("browser");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			try {
				driver.get(FetchDataFromExcel.getURL(1, 0));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			try {
				driver.get(FetchDataFromExcel.getURL(1, 0));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		else 
		{
			driver=new EdgeDriver();
			try {
				driver.get(FetchDataFromExcel.getURL(1, 0));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		return driver;
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public static String getTitle()
	{
		String title=driver.getTitle();
		return title;
		
	}
	
	
	
	
	
}
