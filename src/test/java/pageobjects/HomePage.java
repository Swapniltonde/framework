package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;

import helper.SeleniumClass;

public class HomePage extends SeleniumClass {

	String tagNameLinks = "a";	
	
	public List<WebElement> getAllLinks() {		
		return this.identifyElements("tagname", tagNameLinks);
	}
	
	public int getElementListCount(List<WebElement> listOfWebElements) {
		return listOfWebElements.size(); 
	}
}
