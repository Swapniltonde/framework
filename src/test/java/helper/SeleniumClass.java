package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumClass extends Base{
	
	WebDriver driver;
	
	public void launchApplication(String browserName, String url) 
	{
		if(browserName.equalsIgnoreCase("Chrome Browser")) 
		{
			driver = new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("Firefox Browser")) 
		{
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("IE Browser")) 
		{
			driver = new InternetExplorerDriver();
		}
		else 
		{
			System.out.println("Invalid browser name");
		}
		
	}
	
	
	public WebElement identifyElement(String type, String address) {
		WebElement  element= null;
		if(type.equalsIgnoreCase("id")) {
			By by = By.id(address);
			element = driver.findElement(by);
		}
		
		return element;
		
	}
	
	public void performAction(WebElement element, String actionType) {
		
		
	}

}
