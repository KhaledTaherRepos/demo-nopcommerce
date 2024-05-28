@smoke
Feature: follow us links
  Scenario:  user opens facebook link
    Given user opens facebook link
    Then  "https://www.facebook.com/nopCommerce" is opened in new tab


  Scenario:  user opens twitter link
    Given user opens twitter link
    Then  "https://twitter.com/nopCommerce" this link opened in new tab

  Scenario:  user opens rss link
    Given user opens rss link
    Then  "https://demo.nopcommerce.com/news/rss/1" rss link opened in new tab

