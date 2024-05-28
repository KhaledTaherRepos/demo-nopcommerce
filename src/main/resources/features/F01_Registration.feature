@smoke
Feature: F01_Registration | guest users could create new accounts

  #positive scenario
  Scenario: user could create new account with valid data
    Given user go to register page
    When user select gender type
    And user enter "automation" & "tester"
    And user select date of birth
    And user enter email
    And user enter "P@assword" password and confirm password
    And user click on register button
    Then account created successfully