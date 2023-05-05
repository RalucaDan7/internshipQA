Feature: Search-UI-Main Page

  @Tickbird-020 @Automation_Smoke @UI
  Scenario: Search-UI-020-Check dropdown results
    Given The user navigates to Home Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit
    And Click on Cauta produse box
    And Type in rochie
    Then A dropdown menu with the suggested results is displayed

  @Tickbird-021 @Automation_Smoke @UI
  Scenario: Search-UI-021-Check search result
    Given The user navigates to Home Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit
    And Click on Cauta produse box
    And Type in rochie and click search
    Then Check rezultate rochie page is displayed