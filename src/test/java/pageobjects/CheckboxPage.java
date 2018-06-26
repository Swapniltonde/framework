package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;

import helper.SeleniumClass;

public class CheckboxPage extends SeleniumClass{
	String xpathHeader = "//h3";
	String tagnamecheckboxes ="input";
	
	
	public List<WebElement> getAllCheckboxes() {
		return this.identifyElements("tagname",tagnamecheckboxes);	
		
	}
	
	public void clickCheckBox(String status,WebElement element) {
		boolean flag=element.isSelected();
		if(status.equalsIgnoreCase("tick")) {
			if(flag==true) {
				System.out.println("Already checked");
			}
			else {
				this.performAction(element, "click", null);
			}
		}
		else if(status.equalsIgnoreCase("untick")) {
			if(flag==true) {
				this.performAction(element, "click", null);
				
			}
			else {
				System.out.println("Already unchecked");
			}
		}
		System.out.println(flag);
	}

}
