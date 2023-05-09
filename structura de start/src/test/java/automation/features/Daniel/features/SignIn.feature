Feature: Login-UI-Main Page

  Background:
    Given The user navigates to Home Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit


  @Tickbird-025 @Automation_Smoke @UI
  Scenario: Login-UI-025-Check login with credentials
    When The user clicks on Contul meu button
    When The Autentificare side menu is displayed
    When The user inputs "dany.marginean@gmail.com" email address
    And  Inputs "Aleatoriu123" password
    And Clicks on Logare button
    Then The user should be logged in into the account and the Contul meu sub menu should be displayed