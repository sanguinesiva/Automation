Feature: log in to imdb
Scenario: default login
		@tag1
 Given user is on landing page
 And in chrome browser
 When using login id and password
 And wait for 100ms
 Then I validate the outcomes
 And check more outcomes
 
   @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <user name>
    When I check for the <password> in step
    Then I verify the <status> in step
    
    Examples: 
      | user name  | password | status  |
      | fake@emailid.com | fake | fail |
      | duplica te@emailid.com |duplica  te| Fail  |