package automation.steps.dianasteps;

import automation.baseTest.BaseTest;
import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

public class ReduceriSteps extends BaseTest {
    @Then("Check Reduceri Fete page is displayed")
    public void checkReduceriFetePageIsDisplayed(DataTable url1) {
        Map<String, String> dataMap = url1.asMap(String.class, String.class);
        reduceriPage.checkReduceriFetePageIsDisplayed(dataMap.get("url1"));

    }
}
