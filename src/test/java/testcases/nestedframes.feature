Feature:To verify functinality of NestedFrames on home page
Background: 
	Given User has launched "chrome" browser with url "https://the-internet.herokuapp.com/"
    And verify page by "title" with "The Internet"
    And click on "Nested Frames" link
    And verify page by "url" with "https://the-internet.herokuapp.com/nested_frames"

@nestedframes1
  Scenario: To verify  total frames on nested frames link    
    Then verify total frames are 2
    And close browser
   
  @nestedframes
  Scenario: To verify  total frames on nested frames link
  	Then switch to frame called as "top"
  	Then switch to frame called as "left"    
    Then verify inner frame text as "LEFT"
    And close browser