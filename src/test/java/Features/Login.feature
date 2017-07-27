Feature: LognFeature
  LoginFeature deals with Login functionality for the System.

  Scenario:  Logging with correct user Name and Password
    Given I navigate to Login Page
    And I enter the UserName as "admin" and password as "adminPassword"
    And I click Login Button
    Then I should see the UserForm Page

