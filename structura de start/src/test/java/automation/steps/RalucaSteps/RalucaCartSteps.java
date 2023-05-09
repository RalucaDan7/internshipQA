package automation.steps.RalucaSteps;

import automation.baseTest.BaseTest;
import cucumber.api.java.en.And;

public class RalucaCartSteps extends BaseTest {
    @And("Click on Vezi cosul")
    public void clickOnVeziCosul() {
        ralucaCartPage.clickOnVeziCosul();
    }

    @And("Increment the quantity")
    public void incrementTheQuantity() {
        ralucaCartPage.incrementTheQuantity();
    }

    @And("Check the quantity was increased and the price is {string}")
    public void checkThePriceIsIncreased(String newPrice) {
        ralucaCartPage.checkThePriceIsIncreased(newPrice);
    }

    @And("Check the quantity was increased and in the card are {string} products")
    public void checkTheQuantityWasIncreased(String productQuantity) {
        ralucaCartPage.checkTheQuantityWasIncreased(productQuantity);
    }
}
