package stepdef;

import cucumber.api.java.en.*;
import pageobjects.DropdownPage;

public class DropdownStepDef extends DropdownPage{

	@Then("^verify default dropdown value is \"([^\"]*)\"$")
	public void verify_default_dropdown_value_is(String expectedValue) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String actualValue = this.getDropdownValues().get(0);
		this.compareValues(actualValue, expectedValue);
	}

	@Then("^the count of dropdown options should be (\\d+)$")
	public void the_count_of_dropdown_options_should_be(int expectedCount) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		int actualCount = this.getValuesCount();
		this.compareValues(actualCount, expectedCount);
	}


	
}
