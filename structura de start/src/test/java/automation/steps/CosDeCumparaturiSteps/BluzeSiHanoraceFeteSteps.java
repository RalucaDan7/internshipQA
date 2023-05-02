package automation.steps.CosDeCumparaturiSteps;

import automation.base.DriverUtil;
import automation.baseTest.BaseTest;
import automation.common.Constants;
import automation.common.WaitUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BluzeSiHanoraceFeteSteps extends BaseTest {
    @Given("The user navigates to Bluze si Hanorace Page")
    public void userNavigatesToBluzeSiHanoracePage() {
        DriverUtil.getDriver().get(Constants.BLUZE_SI_HANORACE_URL);
        WaitUtils.waitForPageToLoad();
    }

    @When("Click on Bluza cu volane pentru fete")
    public void clickOnBluzaCuVolanePentruFete() {
        bluzeSiHanoraceFetePage.clickOnBluzaCuVolanePentruFete();
    }

    @Then("{string} is displayed on the page with the individual product")
    public void checkProductTitleIsDisplayed(String productTitle) {
        bluzeSiHanoraceFetePage.checkProductTitle(productTitle);
    }
}
