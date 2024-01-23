Feature: CoreUIReact-UI

  Background:
    Given The user navigates to CoreUIReact page

  @Tickbird-021 @Automation_Smoke @UI @Raluca2 @Ionica
  Scenario: CoreUIReact-UI-021-Click on status
    When Click on Users
    Then Check the user page is displayed
    And Click on "Active"


  @Tickbird-022 @Automation_Smoke @UI @Raluca2 @Ionica
  Scenario: CoreUIReact-UI-022-Check card actions functionalities
    When Click on Base section
    Then Click on Cards
    And Check Card actions is displayed
    And Check Lorem ipsum text is displayed
    And Click on arrow sign
    And Check if Lorem ipsum text is not displayed after clicking arrow sign
    And Click on x sign
    And Check if the card is displayed
    And Check if the card is displayed after refreshing the page

  @Tickbird-023 @Automation_Smoke @UI @Raluca2 @Ionica
  Scenario: CoreUIReact-UI-023-Check Modal functionalities
    When Click on Notification section
    Then Click on Modal
    And Click on cancel button
    And Click on Primary, Warning and Info modal

  @Tickbird-024 @Automation_Smoke @UI @Raluca2 @Ionica
  Scenario: CoreUIReact-UI-024-Check login
    When Click on Pages
    Then Click on Login
    And Check username and password is displayed
    And Input "Raluca" as username and "Raluca123" as password
    And Check login button is blue
    And Input the button text as username

  @Tickbird-025 @Automation_Smoke @UI @Raluca2 @Ionica
  Scenario: CoreUIReact-UI-025-Click on users and display the name and the registered date
    When Click on Users
    Then Display the name and the registered date of "Alien" with "Don't panic!" status



