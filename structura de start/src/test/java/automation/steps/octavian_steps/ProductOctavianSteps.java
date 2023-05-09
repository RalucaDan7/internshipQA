package automation.steps.octavian_steps;

import automation.baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class ProductOctavianSteps extends BaseTest {

    @Then("{string} suggestion product page is displayed")
    public void checkProperProductPageIsDisplayed(String pass){
        productOctavianPage.checkProperProductPageIsDisplayed(pass);
    }

    @And("The user selects a size")
    public void selectFirstSize(){
        productOctavianPage.selectFirstSize();
    }

    @And("The user selects {string} size")
    public void selectSize(String pass){
        productOctavianPage.selectSize(pass);
    }

    @And("The user clicks on Adauga in cos")
    public void addToCart(){
        productOctavianPage.addToCart();
    }

    @And("The user clicks on Adauga in cos with JS")
    public void addToCartJS(){
        productOctavianPage.clickOnSettingsIcon();
    }

    @And("The user clicks on Adauga in cos with Actions")
    public void addToCartActions(){
        productOctavianPage.addToCartActions();
    }
}
