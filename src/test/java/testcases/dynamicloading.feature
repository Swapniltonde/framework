Feature: To verify functionality of DynamicLoading page
Background: 
	Given User has launched "chrome" browser with url "https://the-internet.herokuapp.com/"
    And verify page by "title" with "The Internet"
    And click on "Dynamic Loading" link
    And verify page by "url" with "https://the-internet.herokuapp.com/dynamic_loading"
    
    @dl
    Scenario: verify Example 1 on Dynamically Loaded Page Elements 
  			  When user clicks on "Example 1: Element on page that is hidden" 
  			  Then user should click on the Start Button
  			  And "Hello World!" message should be displayed
  			 
  			  
 