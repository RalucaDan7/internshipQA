Feature: AccesoriiDropDown-UI-Main Page


  @Tickbird-004 @Automation_Smoke @UI @Adriana
  Scenario: Accesorii-UI-004-Checking the functionality of Accesorii button
    Given The user navigates to Home Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit
    And  Click the  Accesorii button
    Then  A page containing "Accesorii" name is displayed


  @Tickbird-005 @Automation_Smoke @UI @Adriana
  Scenario: Accesorii-UI-005-Check the display of Accesorii button
    Given The user navigates to Home Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit
    And  User mouse over the Accesorii dropdown
    Then  A dropdown menu containing the following items is displayed
      | Caciuli si fulare  |
      | Genti si rucsacuri |
      | Manusi             |


  @Tickbird-006 @Automation_Smoke @UI @Adriana
  Scenario: Accesorii-UI-006-Check one item from dropdown is clickable
    Given The user navigates to Home Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit
    And User mouse over the Accesorii dropdown
    And User clicks on Sepci si palarii item
    Then  A page named "Sepci si palarii" is displayed

