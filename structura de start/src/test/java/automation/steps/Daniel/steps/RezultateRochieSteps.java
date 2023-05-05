package automation.steps.Daniel.steps;

import automation.baseTest.BaseTest;
import cucumber.api.java.en.Then;

public class RezultateRochieSteps extends BaseTest {
    @Then("Check rezultate rochie page is displayed")
    public void checkPageIsDisplayed() {
        rezultateRochiePage.checkCautareRezultatePentruRochieIsVisible();
    }
}
