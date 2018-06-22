@tag
Feature: To verify functionality of Brokenimages page
Background: 
	Given User has launched "chrome" browser with url "https://the-internet.herokuapp.com/"
    And verify page by "title" with "The Internet"
    And click on "Broken Images" link
    
    
    
    @tag1
    Scenario : To verify total number of images
    Then verify number of images are 4
    And close browser
    
    @tag2
    Scenario : To verify links present on brokenimages page
    Then verify number of links are 2
    And close browser
    
      @tag2
    Scenario : To verify count of brokenimages
    Then verify number of brokenimages are 2
    And close browser
    
    