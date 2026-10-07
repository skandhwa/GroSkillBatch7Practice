@sanity

Feature: Validate Creation of new User

  Background: 
    Given user opens the guru99 home page application
    And user enters the username as "mngr668169"
    And user enters the password as "YzUsUmU"
    When user enters login button
    Then user will be able to login into the application

  Scenario Outline: Validate new user creation Guru 99
    And user clicks on the new customer link
    And the user enters Customer Name as "<CustomerName>"
    And the user selects Gender as "<Gender>"
    And the user enters Date of Birth as "<DateOfBirth>"
    And the user enters Address as "<Address>"
    And the user enters City as "<City>"
    And the user enters State as "<State>"
    And the user enters PIN as "<PIN>"
    And the user enters Mobile Number as "<MobileNumber>"
    And the user enters E-mail as "<Email>"
    And the user enters Password as "<Password>"
    And the user clicks the Register button
    Then the customer should be registered successfully

    Examples: 
      | CustomerName | Gender | DateOfBirth | Address        | City     | State    | PIN     | MobileNumber | Email               | Password |
      | John Smith   | Male   | 15-05-1990  | 12 Park Street | New York | New York | 1000019 |   9876543210 | john.smibgtth7@test.com | Pass@123 |
