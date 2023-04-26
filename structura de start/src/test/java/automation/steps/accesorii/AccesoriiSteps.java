package automation.steps.accesorii;


import automation.baseTest.BaseTest;
import cucumber.api.java.en.When;

public class AccesoriiSteps extends BaseTest {

//    @When("Check Favorites Link Is Visible")
//    public void checkFavoritesLinkIsVisible() {
//        homePage.checkFavoritesLinkIsVisible();
//    }
//
//    @When("Click On MyAccount Button")
//    public void clickOnMyAccountButton() {
//        homePage.clickOnMyAccountButton();
//    }


    @When("Click on Accesorii button")
    public void clickOnAccesoriiButton() {
        homePage.clickOnAccesoriiLink();
    }
}