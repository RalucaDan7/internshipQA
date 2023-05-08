Feature: AdaugareProduseCostumeDeBaieFeteCosDeCumparaturi-UI


  Background:
    Given The user navigates to Costume de Baie Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit


  @Tickbird-015 @Automation_Smoke @UI @Raluca
  Scenario: AdaugareProduseCosDeCumparaturi-UI-015-CheckTheQuantityWasIncreased - subtotalText
    And Check "Costum de baie Happy Rainbow pentru fete" is displayed and click on it
    Then Check "Costum de baie Happy Rainbow pentru fete" is displayed on the page with the individual product
    And Click on Selecteaza o marime and choose "110 (4-5 ani)"
    Then Click on Adauga in cos button
    And Click on Vezi cosul
    And Increment the quantity
    And Check the quantity was increased by subtotalText

  @Tickbird-016 @Automation_Smoke @UI @Raluca
  Scenario: AdaugareProduseCosDeCumparaturi-UI-016-CheckTheQuantityWasIncreased - quantity value
    And Check "Costum de baie Happy Rainbow pentru fete" is displayed and click on it
    Then Check "Costum de baie Happy Rainbow pentru fete" is displayed on the page with the individual product
    And Click on Selecteaza o marime and choose "110 (4-5 ani)"
    Then Click on Adauga in cos button
    And Click on Vezi cosul
    And Increment the quantity
    And Check the quantity was increased by quantityValue

  @Tickbird-017 @Automation_Smoke @UI @Raluca
  Scenario: AdaugareProduseCosDeCumparaturi-UI-017-DisplayThePrice
    Then Check "Costum de baie Happy Dots pentru fete" is displayed and print "229.00lei"






