package automation.steps;

import automation.baseTest.BaseTest;
import cucumber.api.java.en.And;

public class CategorySteps extends BaseTest {

    @And("The user clicks on first product")
    public void clickFirstProduct(){
        categoryPage.clickFirstProduct();
    }
}
