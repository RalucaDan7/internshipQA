package automation.steps;


import automation.baseTest.BaseTest;
import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTable;

import java.util.Map;

public class AccesoriiSteps extends BaseTest {

    @Then("A page containing {string} title is displayed")
    public void checkPageTitleIsDisplayed(String title) {
        accesoriiPage.checkAccesoriiTitle(title);
    }
//    @Then("")
}
