package automation.steps.MagazinPageSteps;

import automation.baseTest.BaseTest;
import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTable;

import java.util.Map;

public class MagazinPageSteps extends BaseTest {

    @Then("Check magazin url page is displayed")
    public void checkMagazinUrlIsDysplayed(DataTable data) {
        Map<String, String> dataMap = data.asMap(String.class, String.class);
        magazinPage.checkMagazinUrlIsDisplayed(dataMap.get("url"));
    }

    @Then("Check magazin text is displayed")
    public void checkMagazinTextIsDysplayed() {
        magazinPage.checkMagazinTextIsDisplayed();
    }

}
