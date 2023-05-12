package automation.steps.TecsaSteps;

import automation.baseTest.BaseTest;
import cucumber.api.java.en.Then;

public class basketSteps extends BaseTest {

    @Then("Check {string} product is present in Basket page")
    public void checkProduct(String title){
        basketPage.checkProduct(title);
    }

}
