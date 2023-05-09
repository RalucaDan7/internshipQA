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


  @Tickbird-022 @Automation_Smoke @UI
    Scenario: Check page-UI-022-Check page is displayed by URL
    Given The user navigates to Home Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit
    And Click on Cauta produse box
    And Type in rochie and click search
    Then Check "https://qa-training.co.in/?s=rochie&post_type=product" page is visible


  @Tickbird-023 @Automation_Smoke @UI
    Scenario: Check text on page-UI-023-Check text is displayed on page
    Given The user navigates to Home Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit
    And Click on Cauta produse box
    And Type in rochie and click search
    Then Check "Căutare rezultate pentru rochie" title is displayed

  @Tickbird-044 @Automation_Smoke @UI
  Scenario: Check page-UI-044-Check page by link
    Given The user navigates to Home Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit
    And Click on Cauta produse box
    And Type in rochie and click search
    Then Check page is visible for rezultate rochie
      |url|qa-training.co.in/?s=rochie&post_type=product|
