package stepdef;


import cucumber.api.java.en.*;
import pageobjects.HomePage;

public class HomeStepDef extends HomePage{

	@Given("^User has launched \"([^\"]*)\" browser with url \"([^\"]*)\"$")
	public void user_has_launched_browser_with_url(String arg1, String arg2) throws Throwable {
	    
		System.out.println("In given");
		this.launchApplication(arg1, arg2);
	    
	}

	@Given("^verify page by \"([^\"]*)\" with \"([^\"]*)\"$")
	public void verify_page_by_with(String arg1, String arg2) throws Throwable {
	  
		System.out.println("In Given again");
	    
	}

	@When("^verify total page links are (\\d+)$")
	public void verify_total_page_links_are(int arg1) throws Throwable {
	  
		System.out.println("In When");
	}

	@When("^close browser$")
	public void close_browser() throws Throwable {
	    
		this.closeApplication(true);
		System.out.println("In When again...");
	}
}
