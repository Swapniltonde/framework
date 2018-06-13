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
		if(type.equalsIgnoreCase("id")) {
			By by = By.id(address);
			element = driver.findElement(by);
		}
		
		return element;
		
	}
	
	public void performAction(WebElement element, String actionType, String value) {
		
		
		if(actionType.equalsIgnoreCase("click")) {
			
			element.click();
			
		}
		
		else if(actionType.equalsIgnoreCase("gettext"))
		{
			element.getText();
		}
		else if(actionType.equalsIgnoreCase("gettext"))
		{
			element.getText();
		}
		
		else if(actionType.equalsIgnoreCase("sendKeys"))
		{
			element.sendKeys(value);
		}
		
	}

}
