package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.SeleniumClass;

public class DynamicLoadingPage extends SeleniumClass {
	
	String link = "%s";
	String LinkText1 = "Example 1: Element on page that is hidden";
	String LinkText2 = "Example 2: Element rendered after the fact";
	String XpathHeader = "//h3";
	String XpathTest1="/html/body/div[2]//div[@class='example']/p[1]";
	String XpathTest2="/html/body/div[2]//div[@class='example']/p[2]";
	String xpathButton = "//button[contains(text(),'Start')]";
	String xpathText = "//h4[contains(text(),'Hello World!')]";
	
	public void clickLink(String linkName) {
		
		link = String.format(link, linkName);
		WebElement element = this.identifyElement("linktext", link);
		this.performAction(element, "click", null);
		
	}
	
	public void clickButton() {
		WebElement element = this.identifyElement("xpath", xpathButton);
		this.performAction(element, "click", null);
		
	}
	
	public String getHelloWorldText() {
		By by = this.getElementBy("xpath", xpathText);
		this.waitUntilPresenceOfElementLocated(by);
		
		WebElement element = this.identifyElement("xpath", xpathText);
		String text = (String) this.performAction(element, "gettext", null);
		return text;
		
	}

}
