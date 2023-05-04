Feature: News-UI-News Page

  @Tickbird-026 @Automation_Smoke @UI
  Scenario: news-UI-026-Check news links
    Given The user navigates to Home Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit
    And   Click On News button from Home page
    Then Check noutati-fete page is shown
      | url | noutati-fete |