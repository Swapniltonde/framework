Feature:To verify functinality of NestedFrames on home page
Background: 
	Given User has launched "chrome" browser with url "https://the-internet.herokuapp.com/"
    And verify page by "title" with "The Internet"
    And click on "Nested Frames" link
    And verify page by "url" with "https://the-internet.herokuapp.com/nested_frames"

@nestedframes
  Scenario: To verify  total frames on nested frames link    
    Then verify total frames are 4
    And close browser