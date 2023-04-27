Feature: AccesoriiDropDown-UI-Main Page

  @Tickbird-011 @Automation_Smoke @UI
  Scenario: Accesorii-UI-011-Checking the display of Accesorii button
    Given The user navigates to Home Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit
    When  User mouse over the Accesorii dropdown
    Then  A button containing  text is displayed
     |Caciuli si fulare|
     |Genti si rucsacuri|
     |Manusi|


