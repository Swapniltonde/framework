Feature:To verify functinality of checkboxes on home page
Background: 
	Given User has launched "chrome" browser with url "https://the-internet.herokuapp.com/"
    And verify page by "title" with "The Internet"
    And click on "Checkboxes" link
    And verify page by "url" with "https://the-internet.herokuapp.com/checkboxes"
    
    @checkboxes
  Scenario: To verify  total checkboxes on checkboxes link    
    Then verify total checkboxes are 2
    And close browser
    
    
    @checkboxes
  Scenario: To verify ticks for checkboxes on checkboxes link 
    Then verify  checkbox 1 is "tick"
    And verify  checkbox 2 is "untick"
    And close browser
    
    @checkboxes
  Scenario: To verify ticks for checkboxes on checkboxes link 
    Then verify  checkbox 1 is "untick"
    And verify  checkbox 2 is "tick"
    And close browser
    
     @checkboxes
  Scenario: To verify ticks for checkboxes on checkboxes link 
    Then verify  checkbox 1 is "tick"
    And verify  checkbox 2 is "tick"
    And close browser
    
    @checkboxes
  Scenario: To verify ticks for checkboxes on checkboxes link 
    Then verify  checkbox 1 is "untick"
    And verify  checkbox 2 is "untick"
    And close browser
    
    
