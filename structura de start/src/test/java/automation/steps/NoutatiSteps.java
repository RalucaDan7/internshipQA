package automation.steps;

import automation.baseTest.BaseTest;
import automation.pages.NoutatiPage;
import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTable;

import java.util.Map;

public class NoutatiSteps extends BaseTest {
    @Then("Check title {string} is visible on page Noutati")
    public void checkPageIsDisplayed(String pageName) {
        noutatiPage.checkNoutatiFeteIsVisible(pageName);
    }
}
