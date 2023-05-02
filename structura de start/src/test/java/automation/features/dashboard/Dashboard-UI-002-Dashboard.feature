Feature: Dashboard-UI-Main Page

  @Tickbird-002 @Automation_Smoke @UI
  Scenario: dashboard-UI-002-Check xyz links
    Given The user navigates to Home Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit
    Then Check "qa-training" page is displayed
      | url | qa-training |
#comment