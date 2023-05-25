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



