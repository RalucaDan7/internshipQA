Feature: Contact-UI-Main Page

  @Tickbird-006 @Automation_Smoke @UI @Adriana
  Scenario: contact-UI-006-Check the Contact section
    Given The user navigates to Home Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit
    And Click on Trimite-ne mesaj button
    Then A form named "Contact" is displayed

  @Tickbird-007 @Automation_Smoke @UI @Adriana
  Scenario: contact-UI-007-Check the Contact section using Css
    Given The user navigates to Home Page
    When  Insert "w${#p2m1iu2%" Password And Click Submit
    And Click on Trimite-ne mesaj button  using CSS
    Then A form named "Contact" is displayed using Css
