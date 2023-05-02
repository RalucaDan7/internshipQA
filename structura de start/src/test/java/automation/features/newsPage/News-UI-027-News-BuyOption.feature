Feature: News-UI-News Page Buy Option

  @Tickbird-027 @Automation_Smoke @UI
  Scenario: news-UI-026-Check the buy option
    Given The user navigates to Home Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit
    And   Click On News button from Home page
    And   Click on Brand filter
    And   Click on Calvin Klein Jeans option from brand filter
    And   Click on Filtreaza button from News page
    And   Click on Pulover din bumbac pentru copii item from magazine page
    And   Click on Selecteaza o marime filter from product page
    And   Click on 152 option from dropdown
    And   Click on Adauga in Cos Button
    And   Click on Inchide Button from product popup
    And   Click on Amount Button from product page
    And   Click on Vezi Cosul button from product popup
    Then  Check Pulover din bumbac pentru copii - 152 item is displayed
