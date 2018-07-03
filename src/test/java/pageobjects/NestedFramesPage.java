package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;

import helper.SeleniumClass;

public class NestedFramesPage extends SeleniumClass
{
	String xpathLeftFrame = "//body[contains(text(),'LEFT')]";
	String xpathMiddleFrame = "//body/div[contains(text(),'MIDDLE')]";
	String xpathRightFrame = "//body[contains(text(),'RIGHT')]";
	String xpathBottomFrame = "//body[contains(text(),'BOTTOM')]";
	
	String tagnameFrames="body";
	
	public List<WebElement> getAllFrames() {
		return this.identifyElements("tagname",tagnameFrames);	
		
	}
	
	
}
