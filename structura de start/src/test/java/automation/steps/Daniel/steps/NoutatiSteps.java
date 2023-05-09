package automation.steps.Daniel.steps;

import automation.baseTest.BaseTest;
import cucumber.api.java.en.Then;

public class NoutatiSteps extends BaseTest {
    @Then("Check title {string} is visible by css on page Noutati")
    public void checkPageIsDisplayed(String pageName) {
        noutatiPage.checkNoutatiFeteIsVisible(pageName);
    }

    @Then("Check title {string} is visible by xpath on page Noutati")
    public void checkTitleIsVisibleByXpathOnPageNoutati(String arg0) {
        noutatiPage.checkNoutatiFeteIsVisibleByXpath(arg0);
    }
}
