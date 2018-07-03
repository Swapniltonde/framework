package stepdef;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
import pageobjects.NestedFramesPage;

public class NestedFramesStepDef extends NestedFramesPage
{
	@Then("^verify total frames are (\\d+)$")
	public void verify_total_frames_are(int expectedframesCount) throws Throwable {
		int actualcount= this.getAllFrames().size();
		for(WebElement ee : this.getAllFrames()) {
			System.out.println(ee.getAttribute("src"));
		}
		this.compareValues(actualcount, expectedframesCount);
	}
	
	@Then("^verify inner frame text as \"([^\"]*)\"$")
	public void verify_inner_frame_text_as(String expectedValue) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    String actualValue = this.getFrameBodyText();
	    this.compareValues(actualValue, expectedValue);
	}
	
	@Then("^switch to frame called as \"([^\"]*)\"$")
	public void switch_to_frame_called_as(String frameName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		this.switchBetweenFrames(frameName);
		
		
	}

}
