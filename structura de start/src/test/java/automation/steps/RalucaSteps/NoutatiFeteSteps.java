package automation.steps.RalucaSteps;

import automation.base.DriverUtil;
import automation.baseTest.BaseTest;
import automation.common.Constants;
import automation.common.WaitUtils;
import automation.pages.RalucaPages.NoutatiFetePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class NoutatiFeteSteps extends BaseTest {
    @Given("The user navigates to Noutati Fete page")
    public void userNavigatesToNoutatiFetePage() {
        DriverUtil.getDriver().get(Constants.BASE_URL + Constants.NOUTATI_FETE_URL);
        WaitUtils.waitForPageToLoad();
    }

    @When("Click on {string}")
    public void clickOnProduct(String productName){
        noutatiFetePage.clickOnProduct(productName);
    }
}
