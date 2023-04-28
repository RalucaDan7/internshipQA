package automation.steps;

import automation.baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class ProductSteps extends BaseTest {

    @And("Click on Heart button from product page")
    public void clickOnHeartButton() {
        productPage.clickOnHeartButton();
    }

    @Then("Check Heart Button is changed")
    public void checkHeartButton(){
        productPage.checkHeartButton();
    }



}

