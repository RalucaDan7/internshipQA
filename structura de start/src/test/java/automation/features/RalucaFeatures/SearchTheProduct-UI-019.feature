Feature: SearchTheProduct-UI

  Background:
    Given The user navigates to a page where Rochie Sun Power pentru fete is displayed individual
    When  Insert "w${#p2m1iu2%" Password And Click Submit

  @Tickbird-019 @Automation_Smoke @UI @Raluca1
  Scenario: SearchTheProduct-UI-019-Search a product after you click on it
    Then Take the title and return its value
    And Input the value in the search box
    And Check the product is displayed

  @Tickbird-020 @Automation_Smoke @UI @Raluca1
  Scenario: SearchTheProduct-UI-020-Search the price
    Then Take the price and return its value
    And Input the price in the search box
    Then Take the price and return its value - integer
    And Input the price in the search box - integer
    Then Take the price and return its value - float
    And Input the price in the search box - float





