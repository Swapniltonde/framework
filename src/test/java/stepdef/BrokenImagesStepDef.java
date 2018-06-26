package stepdef;

import java.util.List;

import org.openqa.selenium.WebElement;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import pageobjects.BrokenImagesPage;

public class BrokenImagesStepDef extends BrokenImagesPage{

	@Then("^verify number of images are (\\d+)$")
	public void verify_number_of_images_are(int expectedcount) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   int actualcount= this.getAllImages().size();
	   this.compareValues(actualcount, expectedcount);
	}

	@Then("^verify number of links are (\\d+)$")
	public void verify_number_of_links_are(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^verify number of brokenimages are (\\d+)$")
	public void verify_number_of_brokenimages_are(int expected) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    List<WebElement> elements=this.getAllImages();
	    int actualcount=0;
	    for(WebElement ele:elements) {
	    	String url=(String) this.performAction(ele, "attribute","src");
	    	int code=this.getStatusCodeFromResponse(url);
	    	if(code!=200) {
	    		actualcount++;
	    	}
	    }
	    this.compareValues(actualcount, expected);
	}

}
