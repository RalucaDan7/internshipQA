Feature: Accesorii-UI-Main Page

  @Tickbird-004 @Automation_Smoke @UI @Adriana
  Scenario: Accesorii-UI-004-Checking the functionality of Accesorii button
    Given The user navigates to Home Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit
    And  Click the  Accesorii button
    Then  A page containing "Accesorii" name is displayed

