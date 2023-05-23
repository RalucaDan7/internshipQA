Feature: CoreUIReact-UI

  Background:
    Given The user navigates to CoreUIReact page
    
  @Tickbird-021 @Automation_Smoke @UI @Raluca2
  Scenario: CoreUIReact-UI-021-Click on status
    When Click on Users
    Then Check the user page is displayed
    And Click on "Don't panic!"
