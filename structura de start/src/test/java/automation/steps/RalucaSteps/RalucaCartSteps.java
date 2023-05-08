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

    @And("Check the quantity was increased by subtotalText")
    public void checkTheQuantityBySubtotalText() {
        ralucaCartPage.checkTheQuantityBySubtotalText();
    }

    @And("Check the quantity was increased by quantityValue")
    public void checkTheQuantityByQuantityValue() {
        ralucaCartPage.checkTheQuantityByQuantityValue();
    }
}
