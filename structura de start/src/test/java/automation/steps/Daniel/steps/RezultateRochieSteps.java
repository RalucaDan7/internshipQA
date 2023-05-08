package automation.steps.Daniel.steps;

import automation.baseTest.BaseTest;
import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTable;

import java.util.Map;

public class RezultateRochieSteps extends BaseTest {
    @Then("Check rezultate rochie page is displayed")
    public void checkCautareRezultatePentruRochie() {
        rezultateRochiePage.checkCautareRezultatePentruRochieIsVisible();
    }

    @Then("Check {string} title is displayed")
    public void checkCautareRezultatePentruRochieTileIsDisplayed(String gigi) {
        rezultateRochiePage.checkCautareRezultatePentruRochieTileIsDisplayed(gigi);
    }
    @Then("Check page is visible for rezultate rochie")
    public void checkSearchPageIsDisplayed(DataTable data ){
        Map<String, String> dataMap = data.asMap(String.class, String.class);
//        rezultateRochiePage.checkSearchPageIsDisplayed(dataMap.get("url"));
    }
}
