Feature: F03_currencies | user can change currency from the drop down

  Scenario: user able to change currency from us dollar to euro
    When user select euro currency from the dropdown list on the top left of home page
    Then user select euro currency the products displayed in home page shown Euro Symbol

