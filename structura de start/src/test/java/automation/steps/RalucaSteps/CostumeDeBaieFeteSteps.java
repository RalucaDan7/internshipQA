package automation.steps.RalucaSteps;

import automation.base.DriverUtil;
import automation.baseTest.BaseTest;
import automation.common.Constants;
import automation.common.WaitUtils;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CostumeDeBaieFeteSteps extends BaseTest {
    @Given("The user navigates to Costume de Baie Page")
    public void userNavigatesToCostumeDeBaiePage() {
        DriverUtil.getDriver().get(Constants.BASE_URL + Constants.COSTUME_DE_BAIE_URL);
        WaitUtils.waitForPageToLoad();
    }

    @And("Check {string} is displayed and click on it")
    public void checkDisplayedCostumeDeBaieAndClickOnIt(String costumDeBaieNume) {
        costumeDeBaieFetePage.checkDisplayedCostumeDeBaieAndClickOnIt(costumDeBaieNume);
    }

    @Then("Check {string} is displayed on the page with the individual product")
    public void checkProductTitleIsDisplayed(String productName) {
        costumeDeBaieFetePage.checkProductTitle(productName);
    }

    @And("Click on Selecteaza o marime and choose {string}")
    public void selectTheSize(String size) {
        costumeDeBaieFetePage.selectTheSize(size);
    }

    @Then("Click on Adauga in cos button")
    public void clickOnAdaugaInCosButton() {
        costumeDeBaieFetePage.clickOnAdaugaInCosButton();
    }

    @Then("Check {string} is displayed and print {string}")
    public void checkTheProductAndPrintThePrice(String costumDeBaieNume, String price) {
        costumeDeBaieFetePage.checkTheProductAndPrintThePrice(costumDeBaieNume, price);
    }
}
