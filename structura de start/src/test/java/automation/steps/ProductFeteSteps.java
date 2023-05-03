package automation.steps;

import automation.baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class ProductFeteSteps extends BaseTest {
    @And("User  clicks on the second product of the page")
    public void clickOnSecondProductItem() {
        productFetePage.clickOnTheProductButton();
    }

    @And("User clicks on the Add to basket button without selecting any size")
    public void addToBasketItem() {
        productFetePage.addToBasket();
    }

    @Then("An alert button containing {string} is displayed")
    public void checkIfAlertIsDisplayed(String message) {
        productFetePage.checkAlertIsDisplayed(message);
    }
}

