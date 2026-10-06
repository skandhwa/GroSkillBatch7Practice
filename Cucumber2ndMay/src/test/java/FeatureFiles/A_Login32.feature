@sanity
Feature: Validate Login Functionality for Guru99 App

  Scenario Outline: Validate login with correct credentials
    Given user opens the guru99 home page application
    And user enters the username as "<username>"
    And user enters the password as "<password>"
    When user enters login button
    Then user will be able to login into the application

    Examples: 
      | username   | password |
      | mngr668169 | YzUsUmU  |
