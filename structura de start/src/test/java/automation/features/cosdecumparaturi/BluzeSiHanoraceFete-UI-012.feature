Feature: AdaugareProduseBluzeSiHanoraceFeteCosDeCumparaturi-UI


  Background:
    Given The user navigates to Bluze si Hanorace Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit


  @Tickbird-013 @Automation_Smoke @UI @Raluca
  Scenario: AdaugareProduseCosDeCumparaturi-UI-013-CheckTheProductsAreInTheCart
    And Check Bluza cu volane pentru fete is displayed
    Then Click on Bluza cu volane pentru fete
    And "Bluza cu volane pentru fete" is displayed on the page with the individual product


