Feature: SepciSiPalariiPage-UI-Check functionality of page items

  Background:
    Given The user navigates to Home Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit
    And   User mouse over the Accesorii dropdown
    And   User clicks on Sepci si palarii item


#  @Tickbird-012 @Automation_Smoke @UI @Adriana
#  Scenario: Sepci-UI-012-Check the "Prima pagina" link is functional
#
#    And   User clicks on the Prima pagina item
#    Then  Check "qa-training" page is displayed
#      | url | qa-training |

  @Tickbird-013 @Automation_Smoke @UI @Adriana
  Scenario: Sepci-UI-013-Check the Fete link is functional

    And User clicks on Fete item
    And User  clicks on the second product of the page
    And User clicks on the Add to basket button without selecting any size
    Then An alert button containing "Te rog alege opțiunile pentru produs mergând la" is displayed









#  @Tickbird-012 @Automation_Smoke @UI
#  Scenario: Accesorii-UI-012-Check one item from dropdown is clickable
#    Given The user navigates to Home Page
#    When  Insert "w${#p2m1iu2%" Password And Click Submit
#    And User mouse over the Accesorii dropdown
#    And User clicks on Sepci si palarii item
#    Then  A page named "Sepci si palarii" is displayed
#
