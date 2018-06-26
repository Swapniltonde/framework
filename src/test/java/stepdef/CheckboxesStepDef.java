package stepdef;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.Checkboxes;
import pageobjects.HomePage;

public class CheckboxesStepDef extends Checkboxes
{
	@Then("^verify total checkboxes are (\\d+)$")
	public void verify_total_checkboxes_are(int expectedCheckboxesCount) throws Throwable {
		int actualCheckboxesCount = this.getElementListCount(this.getAllCheckboxes());
		this.compareValues(actualCheckboxesCount , expectedCheckboxesCount); 
	}
	
	

	@Then("^verify  checkbox (\\d+) is \"([^\"]*)\"$")
	public void verify_checkbox_is(int arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	


}
