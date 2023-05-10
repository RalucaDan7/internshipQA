package automation.steps.dianasteps;

import automation.baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class NoutatiDianaSteps extends BaseTest {

   @And("Filtreaza button is present")
   public void filtreazaButtonIsPresent() {
       noutatiDianaPage.filtreazaButtonIsPresent();

   }
    @Then("Check title {string} noutati")
    public void checkTitleNoutati(String gica) {
        noutatiDianaPage.checkNoutatiTitle(gica);




    }
}
