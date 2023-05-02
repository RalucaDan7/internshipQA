package automation.steps.homePageSteps;

import automation.baseTest.BaseTest;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;

public class HomePageSteps extends BaseTest {

    @When("Check Favorites Link Is Visible")
    public void checkFavoritesLinkIsVisible() {
        homePage.checkFavoritesLinkIsVisible();
    }

    @When("Click On MyAccount Button")
    public void clickOnMyAccountButton() {
        homePage.clickOnMyAccountButton();
    }

    @And("Click the  Accesorii button")
    public void clickOnAccesoriiButton() {
        homePage.clickOnAccesoriiLink();
    }


    @And("User mouse over the Accesorii dropdown")
    public void mouseOverAccesorii() {
        homePage.mouseOverAccesoriiButton();
    }

    @And("User clicks on Sepci si palarii item")
    public void clickOnDropDownItem() {
        homePage.clickOnDropdownItem();
    }

    @When("Click on Trimite-ne mesaj button")
    public void clickOnContactButton() {
        homePage.clickOnTheContactButton();
    }

    @When("Click on Trimite-ne mesaj button  using CSS")
    public void clickOnContactButtonCss() {
        homePage.clickOnTheContactButtonCss();
    }
}