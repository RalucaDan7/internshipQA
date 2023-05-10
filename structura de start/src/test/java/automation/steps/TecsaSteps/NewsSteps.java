package automation.steps.TecsaSteps;

import automation.base.DriverUtil;
import automation.baseTest.BaseTest;
import automation.common.Constants;
import automation.common.WaitUtils;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTable;

import java.util.Map;

public class NewsSteps extends BaseTest {

    @Then("Check noutati-fete page is shown")
    public void checkPageIsDisplayed(DataTable data) {
        Map<String, String> dataMap = data.asMap(String.class, String.class);
        newsPage.checkPageIsDisplayed(dataMap.get("url"));
    }

    @And("Click on Brand filter")
    public void clickOnBrandFilter() {
        newsPage.clickOnBrandFilter();
    }

    @And("Select Calvin Klein Jeans option from brand filter")
    public void selectCalvinKleinJeansOption() {
        newsPage.selectCalvinKleinJeansOption();
    }

    @And("Click on Filtreaza button from News page")
    public void clickOnFiltreazaButton() {
        newsPage.clickOnFiltreazaButton();
    }

    @And("Click on second product from News page")
    public void clickOnSecondProduct(){
        newsPage.clickOnSecondProduct();
    }

    @And("Click on first product from News page")
    public void clickOnFirstProduct(){
        newsPage.clickFirstProduct();
    }


}


