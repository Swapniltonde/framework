Feature: To verify functionality of Dropdown page
Background: 
	Given User has launched "chrome" browser with url "https://the-internet.herokuapp.com/"
    And verify page by "title" with "The Internet"
    And click on "Dropdown" link
    And verify page by "url" with "https://the-internet.herokuapp.com/dropdown"
 
    
  Scenario: To verify default dropdown value
  			Then verify default dropdown value is "Please select an option"
  			And close browser
  			
  Scenario: To verify count of dropdown options
  			Then the count of dropdown options should be 3
  			And close browser
  			
  			
 			
  						
  
  
   