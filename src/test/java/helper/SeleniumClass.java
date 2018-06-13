package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumClass extends Base{
	
	WebDriver driver;
	
	public void launchApplication(String browserName, String url) {
		
		
	}
	
	
	public WebElement identifyElement(String type, String address) {
		WebElement  element= null;
		By by ;
		if(type.equalsIgnoreCase("id")) {
			by = By.id(address);
			element = driver.findElement(by);
		
		}
		else if(type.equalsIgnoreCase("name")) {
	         by = By.name(address);
			element = driver.findElement(by);
		}
		else if(type.equalsIgnoreCase("className")) {
			by = By.className(address);
			element = driver.findElement(by);
		}
		else if(type.equalsIgnoreCase("cssSelector")) {
			by= By.cssSelector(address);
			element = driver.findElement(by);
		}
		else if(type.equalsIgnoreCase("xpath")) {
			 by = By.xpath(address);
			element = driver.findElement(by);
		}
		else if(type.equalsIgnoreCase("link Text")) {
			by = By.linkText(address);
			element = driver.findElement(by);
		}
		else if(type.equalsIgnoreCase("tagname")) {
			 by = By.name(address);
			element = driver.findElement(by);
		}
		else if(type.equalsIgnoreCase("partialLinkText")) {
			 by = By.name(address);
			element = driver.findElement(by);
		}
		return element;
		
	}
	
	public void performAction(WebElement element, String actionType, String value) {
		
		if(actionType.equalsIgnoreCase("click")) {
			element.sendKeys();
		}
		
		if(actionType.equalsIgnoreCase("click")) {
			element.sendKeys();
		}
		
	}

}
