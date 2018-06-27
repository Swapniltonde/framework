package helper;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.client.HttpClient;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumClass extends Base{
	
	static WebDriver driver;
	
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
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	public By getElementBy(String type, String address) {
		
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
		
		return by;
		
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
	
	public List<WebElement> identifyElements(String type, String address) {
		List<WebElement>  elements= null;
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
		elements = driver.findElements(by);
		return elements;
		
	}
	
	public String getPageDetails(String type) {
		String value = null;
		
		if(type.equalsIgnoreCase("title")) {
			value = driver.getTitle();
		}
		else if(type.equalsIgnoreCase("url")) {
			value = driver.getCurrentUrl();
		}
		else if(type.equalsIgnoreCase("source")) {
			value = driver.getPageSource();
		}
		else if(type.equalsIgnoreCase("handle")) {
			value = driver.getWindowHandle();
		}	
		
		return value;
	}
	
	
	public Object performAction(WebElement element, String actionType, String value) {
		
		Object obj = null;
		
		
		if(actionType.equalsIgnoreCase("click")) {
			element.click();
		}		
		else if(actionType.equalsIgnoreCase("gettext"))
		{
			obj = element.getText();
		}
		else if(actionType.equalsIgnoreCase("settext"))
		{
			element.sendKeys(value);
		}
		/*else if(actionType.equalsIgnoreCase("dropdown")) {
			obj = new Select(element);
		}*/
		else if(actionType.equalsIgnoreCase("attribute"))
		{
			obj= element.getAttribute(value);
		}
		else if(actionType.equalsIgnoreCase("checkboxes")) {
			obj = new Select(element);
		}
		
		return obj;
		
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

	public void waitUntilPresenceOfElementLocated(By by) {
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		ExpectedCondition<WebElement> ec = ExpectedConditions.presenceOfElementLocated(by);
		
		wait.until(ec);
	}
	
}
