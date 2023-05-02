Feature: Cart-Modify product quantity

  @Tickbird-009 @Automation_Smoke @UI @Octavian
  Scenario: cart-009-Decrement single product quantity
    Given The user navigates to Home Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit
    And The user clicks on Baieti
    And The user clicks on first product
    And The user selects a size
    And The user clicks on Adauga in cos
    And The user clicks on Vezi cosul
    And The user decrements product quantity and clicks on Actualizeaza cosul
    Then Cart is empty

  @Tickbird-010 @Automation_Smoke @UI @Octavian
  Scenario: cart-010-Increment single product quantity
    Given The user navigates to Home Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit
    And The user clicks on Baieti
    And The user clicks on first product
    And The user selects a size
    And The user clicks on Adauga in cos
    And The user clicks on Vezi cosul
    And The user increments product quantity and clicks on Actualizeaza cosul
    Then Product quantity is "2"
