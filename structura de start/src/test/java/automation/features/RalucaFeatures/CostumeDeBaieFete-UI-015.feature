Feature: AdaugareProduseCostumeDeBaieFeteCosDeCumparaturi-UI


  Background:
    Given The user navigates to Costume de Baie Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit


  @Tickbird-015 @Automation_Smoke @UI @Raluca
  Scenario: AdaugareProduseCosDeCumparaturi-UI-013-CheckTheProductsAreInTheCart
    And Check "Costum de baie Happy Rainbow pentru fete" is displayed and click on it
    Then Check "Costum de baie Happy Rainbow pentru fete" is displayed on the page with the individual product
    And Click on Selecteaza o marime and choose "110 (4-5 ani)"
    Then Click on Adauga in cos button
    And Click on Vezi cosul
    And Increment the quantity





