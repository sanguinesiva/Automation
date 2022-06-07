
Feature: search

  Scenario: finding for a product
    Given user is in the Amazon page
    When user search with "apple"and price "$300"
    Then the result displayed
    
   Scenario: finding for a product
    Given user is in the Amazon page
    When user search with "samsung"and price "$500"
    Then the result displayed
