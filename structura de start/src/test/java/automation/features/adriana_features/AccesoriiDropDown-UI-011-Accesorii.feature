Feature: AccesoriiDropDown-UI-Main Page

  @Tickbird-011 @Automation_Smoke @UI @Adriana
  Scenario: Accesorii-UI-011-Check the display of Accesorii button
    Given The user navigates to Home Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit
    And  User mouse over the Accesorii dropdown
    Then  A dropdown menu containing the following items is displayed
      | Caciuli si fulare  |
      | Genti si rucsacuri |
      | Manusi             |


  @Tickbird-012 @Automation_Smoke @UI @Adriana
  Scenario: Accesorii-UI-012-Check one item from dropdown is clickable
    Given The user navigates to Home Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit
    And User mouse over the Accesorii dropdown
    And User clicks on Sepci si palarii item
    Then  A page named "Sepci si palarii" is displayed

