package automation.steps.RalucaSteps;

import automation.base.DriverUtil;
import automation.baseTest.BaseTest;
import automation.common.Constants;
import automation.common.WaitUtils;
import automation.pages.RalucaPages.NoutatiFetePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class NoutatiFeteSteps extends BaseTest {
    @Given("The user navigates to Noutati Fete page")
    public void userNavigatesToNoutatiFetePage() {
        DriverUtil.getDriver().get(Constants.BASE_URL + Constants.NOUTATI_FETE_URL);
        WaitUtils.waitForPageToLoad();
    }

    @Then("Click on {string} title from noutatiFetePage")
    public void clickOnProductRaluca(String productName){
        noutatiFetePage.clickOnProductRaluca(productName);
    }
}
