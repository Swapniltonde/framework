package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;

import helper.SeleniumClass;

public class NestedFramesPage extends SeleniumClass
{
	String xpathFrameText = "//body";
		
	String tagnameFrames="frame";
	
	public String getFrameBodyText() {
		WebElement element = this.identifyElement("xpath", xpathFrameText);
		return (String) this.performAction(element, "gettext", null);
	}
	
	public List<WebElement> getAllFrames() {
		return this.identifyElements("tagname",tagnameFrames);
		
	}
	
	public void switchBetweenFrames(String frameName) {
		List<WebElement> framesElements =  this.identifyElements("tagname",tagnameFrames);
		
		for(WebElement element : framesElements) {
			
			String value = (String) this.performAction(element, "attribute", "name");
			
			if(value.contains(frameName)) {
				this.performAction(element, "switchframe", null);
				break;
			}			
		}
	}
	
	
	
}
