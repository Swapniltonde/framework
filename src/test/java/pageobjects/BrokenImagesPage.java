package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;

import helper.SeleniumClass;

public class BrokenImagesPage extends SeleniumClass
{
	String xpathHeader ="//h3";
	String xpathImage1 = "//img[@src='asdf.jpg']";
	String xpathImage2 = "//img[@src='hjkl.jpg']";
	String xpathImage3 = "//img[@src='img/avatar-blank.jpg']";
	
	String tagnameImg="img";
	
	public List<WebElement> getAllImages() {
		
		return this.identifyElements("tagname",tagnameImg);
	}
	
}
