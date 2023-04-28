Feature: VerifyCosDeCumparaturi-UI-003

  @Tickbird-003 @Automation_Smoke @UI
  Scenario: CosDeCumparaturi-UI-003-CheckTheMessageAndTheSidebar
    Given The user navigates to Home Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit
    When Click on Cos de cumparaturi
    Then Check the message Nu ai niciun produs in coș is displayed
    Then Click on Inchide button on the sidebar
    Then Check the sidebar is not displayed

  @Tickbird-004 @Automation_Smoke @UI
  Scenario: CosDeCumparaturi-UI-003-CheckTheInapoiLaMagazinButton
    Given The user navigates to Home Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit
    When Click on Cos de cumparaturi
    Then Click on Inapoi la magazin button on the sidebar
    Then Check magazin url page is displayed
      | url | magazin |

  @Tickbird-004 @Automation_Smoke @UI
  Scenario: CosDeCumparaturi-UI-004-CheckTextOnMagazinPage
    Given The user navigates to Home Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit
    When Click on Cos de cumparaturi
    Then Click on Inapoi la magazin button on the sidebar
    Then Check magazin text is displayed