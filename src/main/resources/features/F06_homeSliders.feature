@smoke
Feature: F06_homeSliders | User clicks on home page sliders
  Scenario: User can clicks on first slider
    When User clicks on the first slider
    Then direct user to first url "https://demo.nopcommerce.com/nokia-lumia-1020"

    Scenario: User can clicks on second slider
      When User clicks on the second slider
      Then direct user to second url "https://demo.nopcommerce.com/iphone-6"




