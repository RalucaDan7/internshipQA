Feature: Accesorii-UI-Main Page

  @Tickbird-009 @Automation_Smoke @UI
  Scenario: Accesorii-UI-010-Checking the functionality of Accesorii button
    Given The user navigates to Home Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit
    When  Click the  Accesorii button
    Then  A page containing "Accesorii" title is displayed
#      | url | qa-training |
