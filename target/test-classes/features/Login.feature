@LoginFeature
Feature: As user I want to login under different roles


  Scenario: Login as a store manager
    Given User is on landing page
    Then user logs in as a store manager
    And User verifies that "Dashboard" page name is displayed
    Then user quits

    @negative
    Scenario: Verify warning message for invalid credentials
      Given User is on landing page
      Then User logs in with "wrong" username and "wrong" password
      And User verifies that "Invalid user name or password." warning message is displayed
      Then user quits

