Feature: HomePage-UI-001- Check Login Page

  @Tickbird-001 @Automation_Regression @HomePage @UI
  Scenario: HomePage-UI-001- Check Login Page
    Given The user navigates to Home Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit
    Then  Check Favorites Link Is Visible
    And  Click On MyAccount Button
