package automation.steps.RalucaSteps;

import automation.base.DriverUtil;
import automation.baseTest.BaseTest;
import automation.common.Constants;
import automation.common.WaitUtils;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BluzeSiHanoraceFeteSteps extends BaseTest {
    @Given("The user navigates to Bluze si Hanorace Page")
    public void userNavigatesToBluzeSiHanoracePage() {
        DriverUtil.getDriver().get(Constants.BASE_URL + Constants.BLUZE_SI_HANORACE_URL);
        WaitUtils.waitForPageToLoad();
    }

    @Then("Check Bluza cu volane pentru fete is displayed")
    public void checkBluzaCuVolanePentruFete() {
        bluzeSiHanoraceFetePage.checkBluzaCuVolanePentruFeteIsDisplayed();
    }

    @Then("Check {string} from Bluze si Hanorace Page are displayed")
    public void checkDisplayedProducts(String product) {
        bluzeSiHanoraceFetePage.checkDisplayedProducts(product);
    }


    @Then("Click on Bluza cu volane pentru fete")
    public void clickOnBluzaCuVolanePentruFete() {
        bluzeSiHanoraceFetePage.clickOnBluzaCuVolanePentruFete();
    }

    @And("{string} is displayed on the page with the individual product")
    public void checkProductTitleIsDisplayed(String title) {
        bluzeSiHanoraceFetePage.checkProductTitle(title);
    }
}
