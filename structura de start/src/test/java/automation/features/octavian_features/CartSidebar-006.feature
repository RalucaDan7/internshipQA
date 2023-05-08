Feature: Cart-Check items in cart

  Background:
    Given The user navigates to Baieti Category Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit
#    And Accepts cookies

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

  @Tickbird-014 @Automation_Smoke @UI @Octavian
  Scenario: cart-014-Add items to cart from feature file
    And The user clicks on "Pantaloni din bumbac pentru copii" product
    And The user selects "122" size
    And The user clicks on Adauga in cos
    And The user navigates back
    And The user clicks on "Bluza polo din bumbac pentru copii" product
    And The user selects "140" size
    And The user clicks on Adauga in cos
    Then The following products should be in the cart by key table
      | product1 | Pantaloni din bumbac pentru copii  |
      | product2 | Bluza polo din bumbac pentru copii |

  @Tickbird-015 @Automation_Smoke @UI @Octavian
  Scenario: cart-015-Check item price
    Then User checks price of "Hanorac cu gluga pentru copii"

  @Tickbird-016 @Automation_Smoke @UI @Octavian
  Scenario: cart-016-Check item price with load more items
    Then User checks price of "Set din bumbac pentru copii" with load more

  @Tickbird-017 @Automation_Smoke @UI @Octavian
  Scenario: cart-017-Add items to cart with JS and Actions
    And The user clicks on "Pantaloni din bumbac pentru copii" product
    And The user selects "122" size
    And The user clicks on Adauga in cos with JS
    And The user navigates back
    And The user clicks on "Bluza polo din bumbac pentru copii" product
    And The user selects "140" size
    And The user clicks on Adauga in cos with Actions
