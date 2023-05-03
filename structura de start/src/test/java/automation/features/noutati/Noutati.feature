Feature: Noutati-UI-Main Page

  @Tickbird-008 @Automation_Smoke @UI
  Scenario: NoutatiByCSS-UI-008-Check Noutati fete Page
    Given The user navigates to Home Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit
    When Click on Noutati Button
    Then Check title "Noutati fete" is visible by css on page Noutati

  @Tickbird-010 @Automation_Smoke @UI
  Scenario: NoutatiByXPATH-UI-008-Check Noutati fete Page
    Given The user navigates to Home Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit
    When Click on Noutati Button
    Then Check title "Noutati fete" is visible by xpath on page Noutati