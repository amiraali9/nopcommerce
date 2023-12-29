@smoke
Feature: F02_Login | User Login by Existed Account
  Scenario: User Can Login Successfully
    Given User Go to Login Page
     When User write the email address "mira4455@gmail.com"
     And User Write password "12345678"
     And User clicks on Login Button
     Then User Login successfully

  Scenario: User Cannot Login Successfully
    Given User Go to Login Page
    When User write the email address "mira95@gmail.com"
    And User Write password "12345678"
    And User clicks on Login Button
    Then User cannot login successfully due to wrong username or password

