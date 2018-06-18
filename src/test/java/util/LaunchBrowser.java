package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchBrowser{
	public static void main(String args[]) {
		LaunchBrowser lb = new LaunchBrowser();
		lb.launchApplication("firefox");
		lb.identifyElement("xpath");
		
	}
	
	WebDriver driver;
	
	public void launchApplication(String browserName) 
	{
		if(browserName.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "D:\\VeatAutomation\\framework\\src\\test\\java\\utilities\\chromedriver.exe");
			driver = new ChromeDriver(); 
			driver.get("http://www.facebook.com/");
			
		}
		else if(browserName.equalsIgnoreCase("firefox")) 
		{

			System.setProperty("webdriver.gecko.driver", "D:\\VeatAutomation\\framework\\src\\test\\java\\utilities\\geckodriver.exe");
			driver = new FirefoxDriver(); 
			driver.get("http://www.facebook.com/");
		}
		else if(browserName.equalsIgnoreCase("internetexplorer")) 
		{

			System.setProperty("webdriver.ie.driver", "D:\\VeatAutomation\\framework\\src\\test\\java\\utilities\\IEDriverServer.exe");
			driver = new InternetExplorerDriver(); 
			driver.get("http://www.facebook.com/");
		}
		
		
	}
	
	
	public void identifyElement(String type) {
		
		
		if(type.equalsIgnoreCase("xpath")) {
			 
			 driver.findElement(By.xpath("input#email")).sendKeys("Veta");
		}
		/*else if(type.equalsIgnoreCase("link Text")) {
			by = By.linkText(address);
			element = driver.findElement(by);
		}*/
		
		
	}
	
	/*public void performAction(WebElement element, String actionType) {
		
		if(actionType.equalsIgnoreCase("Text")) {
			element.sendKeys("Test Selenium");
		}
		
		else if(actionType.equalsIgnoreCase("gettext"))
		{
			element.getText();
		}
		
		else if(actionType.equalsIgnoreCase("sendKeys"))
		{
			element.sendKeys(value);
		}
		
	}*/
  
}
