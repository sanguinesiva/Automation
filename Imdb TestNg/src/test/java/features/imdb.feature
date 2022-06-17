@tag
Feature: log in to imdb

Background: 
Given user is on  imdb webpage
When using chrome browser
Then navigates to login page

@loginScenario
Scenario: default login
 Given login using using login id 
 And wait for 100ms
 When user enters the password 
 Then I validate the outcomes
 
 
@loginParameter
  Scenario Outline: Title of your scenario outline
    Given i want to enter  <user name>
    When I check for the <password> in step
    Then I verify the <status> in step
    
    Examples: 
      | user name  | password | status  |
      | fake@emailid.com | fake | pass |
      | duplicate@emailid.com |duplicate| Fail  |