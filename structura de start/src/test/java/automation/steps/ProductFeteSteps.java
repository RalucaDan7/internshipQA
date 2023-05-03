package automation.steps;

import automation.baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

public class ProductFeteSteps extends BaseTest {
    @And("User  clicks on the second product of the page")
    public void clickOnSecondProductItem() {
        productFetePage.clickOnTheProductButton();
    }

    @And("User clicks on the Add to basket button without selecting any size")
    public void addToBasket() {
        productFetePage.addToBasketButton();
    }

    @Then("A pop-up alert with the following message is displayed")
    public void checkIfAlertIsDisplayed(DataTable dataTable) {
        Map<String, String> dataMap = dataTable.asMap(String.class, String.class);
        productFetePage.checkAlertIsDisplayed(dataMap.get("message"));

        }
    @Then("User accepts alert pop-up by clicking Ok")
    public void clickOnTheOkAlert() {
        productFetePage.clickingOnTheOkAlert();
    }

    }


