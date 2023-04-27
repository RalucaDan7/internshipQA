package automation.steps;

import automation.baseTest.BaseTest;
import automation.pages.ProductPage;
import automation.pages.SearchPage;
import automation.steps.homePageSteps.HomePageSteps;
import cucumber.api.java.en.Then;

public class ProductSteps extends BaseTest {

    @Then("{string} suggestion product page is displayed")
    public void checkProperProductPageIsDisplayed(String pass){
        productPage.checkProperProductPageIsDisplayed(pass);
    }
}
