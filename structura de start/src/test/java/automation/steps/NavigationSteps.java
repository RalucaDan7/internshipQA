package automation.steps;

import automation.base.DriverUtil;
import automation.baseTest.BaseTest;
import automation.common.Constants;
import automation.common.WaitUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class NavigationSteps extends BaseTest {

    @Given("The user navigates to Home Page")
    public void userNavigatesToHomePage() {
        DriverUtil.getDriver().get(Constants.BASE_URL);
        WaitUtils.waitForPageToLoad();
    }

    @When("The user navigates back to the previous page")
    public void theUserNavigatesBackToTheLastPage() {
        DriverUtil.getDriver().navigate().back();
        WaitUtils.waitForPageToLoad();
    }

    @When("The user navigates back")
    public void navigatesBack() {
        DriverUtil.getDriver().navigate().back();
        WaitUtils.waitForPageToLoad();
    }

    @When("The user refreshes the page")
    public void refreshPage() {
        DriverUtil.getDriver().navigate().refresh();
        WaitUtils.waitForPageToLoad();
    }

    @Given("The user navigates to News Girls Page")
    public void userNavigatesToNewsGirlsPage() {
        DriverUtil.getDriver().get(Constants.BASE_URL+Constants.NEWSGIRLSPAGE_URL);
        WaitUtils.waitForPageToLoad();
    }
    @Given("The user navigates to Baieti Category Page")
    public void  userNavigatesToBaietiCategoryPage(){
        DriverUtil.getDriver().get(Constants.BASE_URL + Constants.BaietiCategoryPage_URL);
        WaitUtils.waitForPageToLoad();
    }


}