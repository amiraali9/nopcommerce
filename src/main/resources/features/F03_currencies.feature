@smoke
Feature: F03_currencies | Change Currencies
  Scenario: User changes the currencies from US Dollar to Euro
    When User changes the currency to Euro from the dropdown list
    Then The Euro symbol is appeared on the products details in the home page