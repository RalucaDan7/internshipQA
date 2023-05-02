package automation.steps;

import automation.baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTable;

import java.util.Map;

public class NewsSteps extends BaseTest {

    @Then("Check {string} page is shown")
    public void checkPageIsDisplayed(String pageName, DataTable data){
        Map<String, String> dataMap = data.asMap(String.class, String.class);
        newsPage.checkPageIsDisplayed(pageName, dataMap.get("url"));}

    @And("Click on Brand filter")
    public void clickOnBrandFilter(){
        newsPage.clickOnBrandFilter();
    }

    @And("Click on Calvin Klein Jeans option from brand filter")
    public void clickOnCalvinKleinJeansOption(){
        newsPage.clickOnCalvinKleinJeansOption();
    }

    @And("Click on Filtreaza button from News page")
    public void clickOnFiltreazaButton(){
        newsPage.clickOnFiltreazaButton();
    }
}
