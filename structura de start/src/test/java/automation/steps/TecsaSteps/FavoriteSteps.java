package automation.steps.TecsaSteps;

import automation.baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTable;

import java.util.List;
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

    @Then("Check {string} title is present in favorites section")
    public void checkTitlePantaloniMudSandPentruFete(String title){
        favoritePage.checkTitlePantaloniMudSandPentruFete(title);
    }

    @Then("The following items are displayed in Favorite Page")
    public void checkItemsInFavoritePage(DataTable dataTable){
        List<String> data = dataTable.asList(String.class);
        favoritePage.checkItemsInFavoriteList(data);
    }
}
