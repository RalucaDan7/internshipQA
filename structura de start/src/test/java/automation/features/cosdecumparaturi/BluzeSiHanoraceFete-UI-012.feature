Feature: AdaugareProduseBluzeSiHanoraceFeteCosDeCumparaturi-UI


  Background:
    Given  The user navigates to Home Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit

  @Tickbird-013 @Automation_Smoke @UI @Raluca
  Scenario: AdaugareProduseCosDeCumparaturi-UI-013-CheckTheProductsAreInTheCart
    Given The user navigates to Bluze si Hanorace Page
    When Click on Bluza cu volane pentru fete
    Then "String" is displayed on the page with the individual product


