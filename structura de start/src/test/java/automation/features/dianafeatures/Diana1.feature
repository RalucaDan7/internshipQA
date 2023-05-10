Feature: Dashboard-UI-Main Page

  @Tickbird-002 @Automation_Smoke @UI
  Scenario: dashboard-UI-002-Check noutati
    Given The user navigates to Home Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit
    And Click on noutati link
    And Filtreaza button is present
    Then Check title "Noutati fete" noutati


  @Tickbird-003 @Automation_Smoke @UI
  Scenario: dashboard-UI-002-Check reduceri cu dataTable
    Given The user navigates to Home Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit
    And Click on reduceri link
    Then Check Reduceri Fete page is displayed
    |url1|Reduceri Fete|
#    //sa caut bluze in search si sa dea search

  @Tickbird-004 @Automation_Smoke @UI
  Scenario: dash
  board-UI-002-Check search box and type in bluze
    Given The user navigates to Home Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit
    And Click on Cauta produse search box
    Then Type in "bluze" and submit
    Then Check title "Căutare rezultate pentru bluze" apare
#//de verificat titlu