Feature: SepciSiPalariiPage-UI-Check functionality of page items

  Background:
    Given The user navigates to Home Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit
    And   User mouse over the Accesorii dropdown
    And   User clicks on Sepci si palarii item


  @Tickbird-012 @Automation_Smoke @UI @Adriana
 Scenario: Sepci-UI-012-Check the "Prima pagina" link is functional

    And   User clicks on the Prima pagina item
    Then  Check "qa-training" page is displayed
      | url | qa-training |

  @Tickbird-013 @Automation_Smoke @UI @Adriana
  Scenario: Sepci-UI-013-Check the flow for purchasing in item from Fete page

    And User clicks on Fete item
    And User  clicks on the second product of the page
    And User clicks on the Add to basket button without selecting any size
    Then A pop-up alert with the following message is displayed
      | message |Te rog selectează câteva opțiuni pentru produs înainte de a-l adăuga în coșul tău.|
    And User accepts alert pop-up by clicking Ok





