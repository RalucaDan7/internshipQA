package automation.steps.octavian_steps;

import automation.baseTest.BaseTest;
import cucumber.api.java.en.And;

public class BaietiCategorySteps extends BaseTest {


    @And("The user clicks on first product")
    public void clickFirstProduct(){
        baietiCategoryPage.clickFirstProduct();
    }

    @And("The user clicks on second product")
    public void clickSecondProduct(){
        baietiCategoryPage.clickSecondProduct();
    }

    @And("The user clicks on {string}")
    public void clickOnProduct(String pass){

    }


}
