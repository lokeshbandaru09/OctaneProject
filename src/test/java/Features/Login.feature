Feature: SearchFeature
  SearchFeature deals with search Functionality of the Company

  Scenario:  Searching with Correct feature
    Given I navigate to Amazon Page
    And I should search for the Search Bar
    And I should search for the Adidas Shoes
    Then I should see all the available Adidas Shoes


