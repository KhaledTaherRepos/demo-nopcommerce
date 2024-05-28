
Feature: Search feature
  Scenario Outline: user could search using product name
    Given user could search using "<productName>"
    When user click on search button
    Then url contains "https://demo.nopcommerce.com/search?q="
    And search shows relevant results
    Examples:
      | productName |
    |    book |
    |  laptop |
    |nike     |

  Scenario Outline: user could search using sku
    Given user could search using "<sku>"
    When user click on search button
    Then search shows exact result
    Examples:
      | sku |
      |     SCI_FAITH   |
      |      APPLE_CAM  |
    | SF_PRO_11       |





