package automation.steps.RalucaSteps;

import automation.base.DriverUtil;
import automation.baseTest.BaseTest;
import automation.common.Constants;
import automation.common.WaitUtils;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class CostumeDeBaieFeteSteps extends BaseTest {
    @Given("The user navigates to Costume de Baie Page")
    public void userNavigatesToCostumeDeBaiePage() {
        DriverUtil.getDriver().get(Constants.BASE_URL + Constants.COSTUME_DE_BAIE_URL);
        WaitUtils.waitForPageToLoad();
    }

    @And("Check {string} is displayed")
    public void checkDisplayedCostumeDeBaie(String costumDeBaieNume) {
        costumeDeBaieFetePage.checkDisplayedCostumeDeBaie(costumDeBaieNume);
    }
}
