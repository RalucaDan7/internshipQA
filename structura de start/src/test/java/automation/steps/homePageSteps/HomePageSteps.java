package automation.steps.homePageSteps;

import automation.baseTest.BaseTest;
import cucumber.api.java.en.And;
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

    @And("Click On Lista mea de dorințe Button")
    public void clickOnListaMeaDeDorinteButton() {
        homePage.clickOnFavoriteButton();
    }


    @Then("Check {string} title {string} {string} from Home Page")
    public void checkTitleExploreazacategorii(String title,String a, String b){
        homePage.checkTitleExploreazacategorii(title, a,b);
    }

    @And("Click On FogotPassword Link")
    public void clickOnForgotPasswordLink(){homePage.clickOnForgotPasswordLink();}

}