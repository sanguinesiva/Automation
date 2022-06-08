@tag
Feature: log in to imdb
@tag1

Scenario: default login
 Given user is on landing page
 And in chrome browser
 When using login id and password
 And wait for 100ms
 Then I validate the outcomes
 And check more outcomes
 
@tag2
  Scenario Outline: Title of your scenario outline
    Given i want to enter  <user name>
    When I check for the <password> in step
    Then I verify the <status> in step
    
    Examples: 
      | user name  | password | status  |
      | fake@emailid.com | fake | fail |
      | duplicate@emailid.com |duplica  te| Fail  |