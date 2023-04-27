package automation.steps;

import automation.baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTable;

import java.util.Map;

public class FavoriteSteps extends BaseTest {

    @Then("Check title Lista de dorinte from Lista de dorințe page")
    public void checkTitleListadeDorinte() {
        favoritePage.checkTitleListadeDorinte();
    }

    @And("Click On Acasa Button")
    public void clickOnAcasaButton() {
        favoritePage.clickOnAcasabutton();
    }
}
