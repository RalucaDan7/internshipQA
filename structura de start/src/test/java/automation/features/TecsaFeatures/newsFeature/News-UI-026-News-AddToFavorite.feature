Feature: News-UI-News Page

  @Tickbird-026 @Automation_Smoke @UI
  Scenario: news-UI-026-Check items from news girls section in Favorite Page
    Given The user navigates to News Girls Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit
    And   Click on second product from News page
    And   Click on Heart button from product page
    Then  Check Heart Button is changed
    And   The user navigates back
    And   Click on first product from News page
    And   Click on Heart button from product page
    Then  Check Heart Button is changed
    And   Click On Lista mea de dorințe Button
    Then  The following items are displayed in Favorite Page
       | Bluza cu volane pentru fete |
       | Hanorac multicolor bumbac pentru copii    |

