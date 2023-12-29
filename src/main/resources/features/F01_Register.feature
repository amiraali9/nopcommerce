@smoke
Feature: F01_Register| User creates a new account

  Scenario: Guest user can create account successfully
   #Given Prerequisite
    Given User go to registration page
    #when --> Actions
    # And multiple Keywords (Given, When, Then)
    When User select the gender
    And User write the first name "Amira" and write last name "Ali"
    And User select the Date of Brith
    And User write the Email address "mira4455@gmail.com"
    And User write company name
    And User Write "12345678" and "12345678"
    And User clicks on Register Button
    Then User Register successfully




