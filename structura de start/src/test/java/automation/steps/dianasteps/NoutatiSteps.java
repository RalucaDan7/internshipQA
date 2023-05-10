package automation.steps.dianasteps;

import automation.baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class NoutatiSteps extends BaseTest {

   @And("Filtreaza button is present")
   public void filtreazaButtonIsPresent() {
       noutatiPage.filtreazaButtonIsPresent();

   }
    @Then("Check title {string} noutati")
    public void checkTitleNoutati(String gica) {
        noutatiPage.checkNoutatiTitle(gica);




    }
}
