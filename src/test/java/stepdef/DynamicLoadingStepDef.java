package stepdef;

import org.openqa.selenium.WebElement;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import pageobjects.DynamicLoadingPage;

public class DynamicLoadingStepDef extends DynamicLoadingPage {
	
	
	@When("^user clicks on \"([^\"]*)\"$")
	public void user_clicks_on(String linkName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    this.clickLink(linkName);
	    
	}
	
	@Then("^user should click on the Start Button$")
	public void user_should_click_on_the_Start_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    this.clickButton();
	    
	}
	
	@Then("^\"([^\"]*)\" message should be displayed$")
	public void message_should_be_displayed(String expectedMessage) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    String actualText = this.getHelloWorldText();
	    this.compareValues(actualText, expectedMessage);
	}

}
