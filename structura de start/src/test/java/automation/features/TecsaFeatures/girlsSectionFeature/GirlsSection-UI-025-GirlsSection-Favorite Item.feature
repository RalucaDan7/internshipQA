Feature: Dashboard-UI-Girls Page

  @Tickbird-002 @Automation_Smoke @UI
  Scenario: girlssection-UI-025- Check the ability to add one product to favorites
    Given The user navigates to Home Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit
    And   Click on Descopera Colectia from home page
    And   Click on Incarca mai multe produse button from girls section
    And   Click on Pantaloni Mud Sand image from girls section
    And   Click on Heart button from product page
    Then  Check Heart Button is changed
    And   Click On Lista mea de dorințe Button
    Then  Check "Pantaloni Mud Sand pentru fete" title is present in favorites section

