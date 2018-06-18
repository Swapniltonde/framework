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
		String driverPath = "%s\\src\\test\\java\\utilities\\"+"%s"+".exe";
		if(browserName.equalsIgnoreCase("chrome")) 
		{
			driverPath = this.getAndConcatPath(driverPath, "chromedriver");
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("firefox")) 
		{
			driverPath = this.getAndConcatPath(driverPath, "geckodriver");
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("ie")) 
		{			
			driverPath = this.getAndConcatPath(driverPath,"IEDriverServer");
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new InternetExplorerDriver();
		}
		else 
		{
			System.out.println("Invalid browser name");
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	
	public WebElement identifyElement(String type, String address) {
		WebElement  element= null;
		By by = null;
		if(type.equalsIgnoreCase("id")) {
			by = By.id(address);					
		}
		else if(type.equalsIgnoreCase("name")) {
	        by = By.name(address);			
		}
		else if(type.equalsIgnoreCase("classname")) {
			by = By.className(address);			
		}
		else if(type.equalsIgnoreCase("css")) {
			by= By.cssSelector(address);			
		}
		else if(type.equalsIgnoreCase("xpath")) {
			 by = By.xpath(address);			
		}
		else if(type.equalsIgnoreCase("linktext")) {
			by = By.linkText(address);			
		}
		else if(type.equalsIgnoreCase("tagname")) {
			 by = By.tagName(address);			 
		}
		else if(type.equalsIgnoreCase("partiallinktext")) {
			 by = By.partialLinkText(address);			 
		}
		element = driver.findElement(by);
		return element;
		
	}
	
	public String performAction(WebElement element, String actionType, String value) {
		
		String str = null;
		if(actionType.equalsIgnoreCase("click")) {
			element.click();
		}		
		else if(actionType.equalsIgnoreCase("gettext"))
		{
			str = element.getText();
		}
		else if(actionType.equalsIgnoreCase("settext"))
		{
			element.sendKeys(value);
		}
		
		return str;
	}
	
  
	public void closeApplication(boolean flag) {
		
		if(flag)
		{
			driver.quit();
		}
		else {
			driver.close();
		}
	}
	
}
