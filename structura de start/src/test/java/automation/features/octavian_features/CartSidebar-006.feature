Feature: Cart-Check items in cart

  Background:
    Given The user navigates to Baieti Category Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit

  @Tickbird-011 @Automation_Smoke @UI @Octavian
  Scenario: cart-011-Check items are added to cart
    And The user clicks on first product
    And The user selects a size
    And The user clicks on Adauga in cos
    And The user navigates back
    And The user clicks on second product
    And The user selects a size
    And The user clicks on Adauga in cos
    Then The following products should be in the cart
      | Blugi regular fit pentru baieti    |
      | Bluza polo din bumbac pentru copii |

  @Tickbird-012 @Automation_Smoke @UI @Octavian
  Scenario: cart-012-Check items are added to cart by looping list of WebElements
    And The user clicks on first product
    And The user selects a size
    And The user clicks on Adauga in cos
    And The user navigates back
    And The user clicks on second product
    And The user selects a size
    And The user clicks on Adauga in cos
    Then The following products should be in the cart by looping list of WebElements
      | Blugi regular fit pentru baieti    |
      | Bluza polo din bumbac pentru copii |

  @Tickbird-013 @Automation_Smoke @UI @Octavian
  Scenario: cart-013-Check items are added to cart by key table
    And The user clicks on first product
    And The user selects "140" size
    And The user clicks on Adauga in cos
    And The user navigates back
    And The user clicks on second product
    And The user selects "140" size
    And The user clicks on Adauga in cos
    Then The following products should be in the cart by key table
      | product1 | Blugi regular fit pentru baieti    |
      | product2 | Bluza polo din bumbac pentru copii |

