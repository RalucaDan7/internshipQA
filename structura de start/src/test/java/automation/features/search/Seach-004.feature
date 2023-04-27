Feature: Search-UI-Check Search Function

  @Tickbird-004 @Automation_Smoke @UI @Search
  Scenario: search-UI-004-Check Search is functional
    Given The user navigates to Home Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit
    And  Insert "tricou" In Search Box
    And Click Search
    Then Check "Căutare rezultate pentru tricou" title is displayed

  @Tickbird-005 @Automation_Smoke @UI @Search
  Scenario: search-UI-005-Check Search is functional by CSS
    Given The user navigates to Home Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit
    And  Insert "tricou" In Search Box By CSS
    And Click Search By CSS
    Then Check "Căutare rezultate pentru tricou" title is displayed by CSS

  @Tickbird-006 @Automation_Smoke @UI @Search
  Scenario: search-UI-006-Check Search suggestions are displayed
    Given The user navigates to Home Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit
    And  Insert "tricou" In Search Box
    Then A suggestion box is displayed

  @Tickbird-007 @Automation_Smoke @UI @Search
  Scenario: search-UI-007-Check Search suggestions are correct
    Given The user navigates to Home Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit
    And  Insert "tricou" In Search Box
    And A suggestion box is displayed
    Then Suggestion has "tricou" in name

  @Tickbird-008 @Automation_Smoke @UI @Search
  Scenario: search-UI-008-Check Suggestion redirects to proper page
    Given The user navigates to Home Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit
    And  Insert "tricou" In Search Box
    And A suggestion box is displayed
    And Suggestion has "tricou" in name
    And Click On Suggestion
    Then "tricou" suggestion product page is displayed