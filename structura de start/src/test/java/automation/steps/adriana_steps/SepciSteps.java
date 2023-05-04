package automation.steps.adriana_steps;

import automation.baseTest.BaseTest;
import cucumber.api.java.en.And;

public class SepciSteps extends BaseTest {
    @And("User clicks on the Prima pagina item")
    public void clickOnPrimaPaginaLink() {
        sepciPage.clickOnThePrimaPaginaLink();
    }

    @And("User clicks on Fete item")
    public void clickOnFeteLink() {
        sepciPage.clickOnTheFeteLink();

    }
    @And("User clicks on Marime dropdown button")
    public void clickOnMarimeFilterDropdwon() {
        sepciPage.clickOnTheMarimeButton();
        }
}

