package automation.steps.homePageSteps;

import automation.baseTest.BaseTest;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps extends BaseTest {

    @When("Check Favorites Link Is Visible")
    public void checkFavoritesLinkIsVisible() {
        homePage.checkFavoritesLinkIsVisible();
    }

    @When("Click On MyAccount Button")
    public void clickOnMyAccountButton() {
        homePage.clickOnMyAccountButton();
    }

    @When("Click on Cos de cumparaturi")
    public void clickOnCosDeCumparaturi() {
        homePage.clickOnCosDeCumparaturi();
    }

    @Then("Check the sidebar is not displayed")
    public void checkTheSidebarIsNotDisplayed() {
        homePage.checkTheSidebarIsNotDisplayed();
    }
}
