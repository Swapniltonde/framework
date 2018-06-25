package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;

import helper.SeleniumClass;

public class HomePage extends SeleniumClass {

	String tagNameLinks = "a";	
	String linkTextLink = "%s";
	
	public WebElement getLink(String linkName) {		
		linkTextLink = String.format(linkTextLink, linkName);
		return this.identifyElement("linktext", linkTextLink);
	}
	
	public List<WebElement> getAllLinks() {		
		return this.identifyElements("tagname", tagNameLinks);
	}
	
	public int getElementListCount(List<WebElement> listOfWebElements) {
		return listOfWebElements.size(); 
	}
	
}
