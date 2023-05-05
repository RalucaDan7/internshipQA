Feature: SepciSiPalariiPage-UI-Check functionality of page items

  Background:
    Given The user navigates to Home Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit
    And   User mouse over the Accesorii dropdown
    And   User clicks on Sepci si palarii item


  @Tickbird-009 @Automation_Smoke @UI @Adriana
  Scenario: Sepci-UI-012-Check the "Prima pagina" link is functional

    And   User clicks on the Prima pagina item
    Then  Check "qa-training" page is displayed
      | url | qa-training |

  @Tickbird-010 @Automation_Smoke @UI @Adriana
  Scenario: Sepci-UI-013-Check the flow for purchasing an item from Fete page

    And User clicks on Fete item
    And User  clicks on the second product of the page
    And User clicks on the Add to basket button without selecting any size
    Then A pop-up alert with the following message is displayed
      | message | Te rog selectează câteva opțiuni pentru produs înainte de a-l adăuga în coșul tău. |
    And User accepts alert pop-up by clicking Ok


  @Tickbird-011 @Automation_Smoke @UI @Adriana
  Scenario:Sepci-UI-014-Check the functionality of "Marime" dropdown filter
    And User clicks on Marime dropdown button
    And User choses the SM option from to dropdown list
    And The user clicks the Resetare filtre option
    Then The filters are cleared


  @Tickbird-012 @Automation_Smoke @UI @Adriana
  Scenario:Speci-UI-015- Check if the user can add a product to Wishlist
    And User clicks on Sapca de baseball pentru copii product
    And User clicks on Wishlist icon
    And User navigates to Wishlist page to see added products
    Then A page with the entry title "Lista de dorinte" is displayed
    And The Wishlist contains "Sapca de baseball pentru copii" product