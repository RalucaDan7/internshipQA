package automation.steps.RalucaSteps;

import automation.baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class cartStepsRaluca extends BaseTest {
    @And("Click on Vezi cosul")
    public void clickOnVeziCosul() {
        cartPageRaluca.clickOnVeziCosul();
    }

    @And("Increment the quantity")
    public void incrementTheQuantity() {
        cartPageRaluca.incrementTheQuantity();
    }
}
