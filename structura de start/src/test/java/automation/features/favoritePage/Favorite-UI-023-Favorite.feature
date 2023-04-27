Feature: Dashboard-UI-Favorite Page

  @Tickbird-002 @Automation_Smoke @UI
  Scenario: favorite-UI-023-favorite.feature
    Given The user navigates to Home Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit
    And   Click On Lista mea de dorințe Button
    Then  Check title Lista de dorinte from Lista de dorințe page
    And   Click On Acasa Button
    Then  Check "Exploreaza categorii" title "bla" "bla" from Home Page
