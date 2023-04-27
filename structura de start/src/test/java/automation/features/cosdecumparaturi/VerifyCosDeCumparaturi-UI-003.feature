Feature: VerifyCosDeCumparaturi-UI-003

  @Tickbird-003 @Automation_Smoke @UI
  Scenario: CosDeCumparaturi-UI-003-CheckTheMessage
    Given The user navigates to Home Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit
    When Click on Cos de cumparaturi
    Then Check the message Nu ai niciun produs in coș  is displayed
    Then Click on Inchide
    Then Check the sidebar is not displayed
#      | url | qa-training |
