Feature: Dashboard-UI-Forgot Password Page

  @Tickbird-002 @Automation_Smoke @UI
  Scenario: forgotpassword-UI-024- Check forgot password page
    Given The user navigates to Home Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit
    And   Click On MyAccount Button
    And   Click On FogotPassword Link
    Then  Check Email input textbox is displayed

