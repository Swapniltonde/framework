package stepdef;

import java.util.List;

import org.openqa.selenium.WebElement;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.CheckboxPage;
import pageobjects.HomePage;

public class CheckboxesStepDef extends CheckboxPage
{
	@Then("^verify total checkboxes are (\\d+)$")
	public void verify_total_checkboxes_are(int expectedCheckboxesCount) throws Throwable {
		
		  int actualcount= this.getAllCheckboxes().size();
		  this.compareValues(actualcount, expectedCheckboxesCount);
	}
	
	

	@Then("^verify  checkbox (\\d+) is \"([^\"]*)\"$")
	public void verify_checkbox_is(int index, String status) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		List<WebElement> checkboxes= this.getAllCheckboxes();
		for(int i=0;i<checkboxes.size();i++) {
			if(i+1==index) {
				this.clickCheckBox(status, checkboxes.get(i));
			}
		}
	}
	
	


}
