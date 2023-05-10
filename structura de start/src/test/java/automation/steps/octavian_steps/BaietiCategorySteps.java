package automation.steps.octavian_steps;

import automation.baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class BaietiCategorySteps extends BaseTest {


    @And("The user clicks on first product")
    public void clickFirstProduct(){
        baietiCategoryPage.clickFirstProduct();
    }

    @And("The user clicks on second product")
    public void clickSecondProduct(){
        baietiCategoryPage.clickSecondProduct();
    }

    @And("The user clicks on {string} product")
    public void clickOnGivenProduct(String pass){
        baietiCategoryPage.clickOnGivenProduct(pass);
    }

    @Then("User checks price of {string}")
    public void checkPrice(String pass){
        baietiCategoryPage.checkPrice(pass);
    }

    @Then("User checks price of {string} with load more")
    public void checkPriceLoadMore(String pass){
        baietiCategoryPage.checkPriceLoadMore(pass);
    }


}
