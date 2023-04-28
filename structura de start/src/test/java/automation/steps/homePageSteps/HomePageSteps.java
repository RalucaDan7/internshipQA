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

    @When("Click the  Accesorii button")
    public void clickOnAccesoriiButton() {
        homePage.clickOnAccesoriiLink();
    }



    @When("User mouse over the Accesorii dropdown")
    public void mouseOverAccesorii() throws InterruptedException {
        homePage.mouseOverAccesoriiButton();
    }



    @When("Click on Trimite-ne mesaj button")
    public void clickOnContactButton() {
        homePage.clickOnTheContactButton();
    }
    @When("Click on Trimite-ne mesaj button  using CSS")
    public void clickOnContactButtonCss() throws InterruptedException {
        Thread.sleep(1000);
        homePage.clickOnTheContactButtonCss();
    }
}