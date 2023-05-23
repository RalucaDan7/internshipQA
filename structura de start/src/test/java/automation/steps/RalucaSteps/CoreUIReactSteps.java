package automation.steps.RalucaSteps;

import automation.base.DriverUtil;
import automation.baseTest.BaseTest;
import automation.common.Constants;
import automation.common.WaitUtils;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CoreUIReactSteps extends BaseTest {
    @Given("The user navigates to CoreUIReact page")
    public void userNavigatesToCoreUIReactPage() {
        DriverUtil.getDriver().get(Constants.COREUIREACT_URL);
        WaitUtils.waitForPageToLoad();
    }

    @When("Click on Users")
    public void clickOnUsers() {
        coreUIReactPage.clickOnUsers();
    }
    @Then("Check the user page is displayed")
    public void checkUserPageIsDisplayed() {
        coreUIReactPage.checkUserPageIsDisplayed();
    }

    @And("Click on {string}")
    public void clickOnStatus(String status) {
        coreUIReactPage.clickOnStatus(status);
    }


}
