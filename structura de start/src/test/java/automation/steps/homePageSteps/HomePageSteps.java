package automation.steps.homePageSteps;

import automation.baseTest.BaseTest;
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

    @When("Click on Noutati Button")
    public void clickOnNoutatiButton() {
        homePage.clickOnNoutatiLink();
    }
}