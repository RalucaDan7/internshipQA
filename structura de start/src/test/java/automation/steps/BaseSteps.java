package automation.steps;

import automation.baseTest.BaseTest;
import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTable;

import java.util.Map;

public class BaseSteps extends BaseTest {

    @Then("Check {string} page is displayed")
    public void checkPageIsDisplayed(String pageName, DataTable data) {
        Map<String, String> dataMap = data.asMap(String.class, String.class);
        basePage.checkPageIsDisplayed(pageName, dataMap.get("url"));
    }
}
