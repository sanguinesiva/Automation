#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@webapplication
Feature: inspect the homepage

Background: 
Given user is on  webdriveruniversity.com webpage
When using chrome browser
Then navigates to login page

  @tag1
  Scenario: inspect the contact us page
    Given when the user is in chrome browser
    When the user is in webdriveruniversity.com
    And enters the details
    Then submits the details


  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <lastname> in step
    Then I verify the <email> in step
    And write <comments> 

    Examples: 
      | name| lastname | email           |comments|
      | sam |     kay  | fakeid@gmail.com| hello  |
      | ram |     sita | Fail@yahoo.com  | Hi     |
