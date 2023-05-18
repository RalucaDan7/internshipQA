package automation.steps.RalucaSteps;

import automation.base.DriverUtil;
import automation.baseTest.BaseTest;
import automation.common.Constants;
import automation.common.WaitUtils;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SearchTheProductSteps extends BaseTest {
    String value;

    @Given("The user navigates to a page where Rochie Sun Power pentru fete is displayed individual")
    public void userNavigatesToRochieSunPowerFetePage() {
        DriverUtil.getDriver().get(Constants.BASE_URL + Constants.ROCHIE_SUN_POWER_PENTRU_FETE_URL);
        WaitUtils.waitForPageToLoad();
    }

    @Then("Take the title and return its value")
    public void takeTheTitleAndReturnTheValue() {
        value = rochieSunPowerFetePage.takeTheTitleAndReturnTheValue();
    }

    @And("Input the value in the search box")
    public void typeTheValueInSearchBox() {
        rochieSunPowerFetePage.typeTheValueInSearchBox(value);
    }

    @And("Check the product is displayed")
    public void checkTheProductIsDisplayed() {
        rochieSunPowerFetePage.checkTheProductIsDisplayed(value);
    }
}

