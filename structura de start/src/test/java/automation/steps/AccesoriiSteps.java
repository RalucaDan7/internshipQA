package automation.steps;


import automation.baseTest.BaseTest;
import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

public class AccesoriiSteps extends BaseTest {

    @Then("A page containing {string} title is displayed")
    public void checkPageTitleIsDisplayed(String title) {
        accesoriiPage.checkAccesoriiTitle(title);
    }

    @Then ("A dropdown menu containing the following items is displayed")
    public void checkDropdownContentIsDisplayed(DataTable dataTable) {
        List<String> dataL = dataTable.asList(String.class);
        System.out.println(dataL);
        for (int i = 0; i<dataL.size(); i++)
        {
            accesoriiPage.checkAccesoriiElements(dataL.get(i));
        }
    }
}
