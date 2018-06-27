package stepdef;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;

public class DynamicLoading {
	

@When("^user clicks on \"([^\"]*)\"$")
public void user_clicks_on(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^user should click on the Start Button$")
public void user_should_click_on_the_Start_Button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^\"([^\"]*)\" message should be displayed$")
public void message_should_be_displayed(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

}
