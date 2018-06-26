package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;

import helper.SeleniumClass;

public class Checkboxes extends SeleniumClass{
	String xpathHeader = "//h3";
	String checkboxName1 =" checkbox 1";
	String checkboxName2 =" checkbox 2";
	
	
	public List<WebElement> getAllCheckboxes() {
		return null;		
		
	}
	
	public int getElementListCount(List<WebElement> listOfWebElements) {
		return listOfWebElements.size(); 
	}

}
