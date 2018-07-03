package stepdef;

import cucumber.api.java.en.Then;
import pageobjects.NestedFramesPage;

public class NestedFramesStepDef extends NestedFramesPage
{
	@Then("^verify total frames are (\\d+)$")
	public void verify_total_frames_are(int expectedframesCount) throws Throwable {
		int actualcount= this.getAllFrames().size();
		this.compareValues(actualcount, expectedframesCount);
	}
}
