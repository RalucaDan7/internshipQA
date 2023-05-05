package automation.steps.octavian_steps;

import automation.baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class ProductSteps extends BaseTest {

    @Then("{string} suggestion product page is displayed")
    public void checkProperProductPageIsDisplayed(String pass){
        productPage.checkProperProductPageIsDisplayed(pass);
    }

    @And("The user selects a size")
    public void selectFirstSize(){
        productPage.selectFirstSize();
    }

    @And("The user selects {string} size")
    public void selectSize(String pass){
        productPage.selectSize(pass);
    }

    @And("The user clicks on Adauga in cos")
    public void addToCart(){
        productPage.addToCart();
    }
}
