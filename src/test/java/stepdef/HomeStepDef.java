package stepdef;


import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import pageobjects.HomePage;

public class HomeStepDef extends HomePage{

	@Given("^User has launched \"([^\"]*)\" browser with url \"([^\"]*)\"$")
	public void user_has_launched_browser_with_url(String arg1, String arg2) throws Throwable {
	    
		System.out.println("In given");
		this.launchApplication(arg1, arg2);
	    
	}

	@Given("^verify page by \"([^\"]*)\" with \"([^\"]*)\"$")
	public void verify_page_by_with(String type, String expectedTitle) throws Throwable {
	  
		String actualTitle = this.getPageDetails(type);
		this.compareValues(actualTitle, expectedTitle);
	    
	}

	@When("^verify total page links are (\\d+)$")
	public void verify_total_page_links_are(int expectedLinkCount) throws Throwable {
	  
		int actualLinkCount = this.getElementListCount(this.getAllLinks());
		this.compareValues(actualLinkCount -2, expectedLinkCount);
	}

	@When("^close browser$")
	public void close_browser() throws Throwable {
	    
		this.closeApplication(true);
		
	}
	
	@Given("^click on \"([^\"]*)\" link$")
	public void click_on_link(String linkName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	    this.performAction(this.getLink(linkName), "click", null);
	}
}
