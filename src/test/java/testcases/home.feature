@tag
Feature: To verify functionality of home page
Background: 
	Given User has launched "chrome" browser with url "https://the-internet.herokuapp.com/"
    And verify page by "title" with "The Internet"
    
  @tag1
    Scenario: To verify total link count on home page    
    When verify total page links are 39
    And close browser
   
   @tag2 
    Scenario: To verify total link count on home page
    When verify total page links are 39
    And close browser
    
    @tag3
    Scenario: To verify total link count on home page
    When verify total page links are 39
    And close browser
    
  