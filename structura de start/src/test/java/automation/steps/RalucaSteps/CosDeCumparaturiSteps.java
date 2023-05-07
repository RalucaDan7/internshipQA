package automation.steps.RalucaSteps;

import automation.baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class CosDeCumparaturiSteps extends BaseTest {
    @Then("Check the message Nu ai niciun produs in coș is displayed")
    public void checkCosDeCumparaturiMessageIsDysplayed() {
        cosDeCumparaturiPage.checkCosDeCumparaturiMessageIsDisplayed();
    }

    @And("Click on Inchide button on the sidebar")
    public void clickOnInchideButtonOnTheSidebar() {
        cosDeCumparaturiPage.clickOnInchideButtonOnTheSidebar();
    }

    @Then("Click on Inapoi la magazin button on the sidebar")
    public void clickOnInapoiLaMagazinButtonOnTheSidebar(){
        cosDeCumparaturiPage.clickOnInapoiLaMagazinButtonOnTheSidebar();
    }
}
