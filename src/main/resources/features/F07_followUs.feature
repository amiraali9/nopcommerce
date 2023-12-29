@smoke
Feature: F07_followUs | users could open followUs links
  Scenario: user opens facebook link
  When user opens facebook link
  Then facebook link "https://www.facebook.com/nopCommerce" is opened in new tab

  Scenario: user opens twitter link
  When user opens twitter link
  Then twitter link "https://twitter.com/nopCommerce" is opened in new tab

  Scenario: user opens rss link
  When user opens rss link
  Then rss link "https://demo.nopcommerce.com/new-online-store-is-open" is opened in new tab

  Scenario: user opens youtube link
  When user opens youtube link
  Then youtube link "https://www.youtube.com/user/nopCommerce" is opened in new tab