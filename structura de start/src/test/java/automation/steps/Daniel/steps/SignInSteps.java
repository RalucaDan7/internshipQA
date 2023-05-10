package automation.steps.Daniel.steps;

import automation.baseTest.BaseTest;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInSteps extends BaseTest {

    @FindBy(xpath = "//h1[@class=\"entry-title title\"]")
    private WebElement contulMeuMenu;


    @When("The Autentificare side menu is displayed")
    public void seeAutentificareSideMenu() {
        signInPage.seeAutentificareSideMenu();
    }

    @When("The user inputs {string} email address")
    public void inputEmailAddress(String user) {
        signInPage.inputEmailAddress(user);
    }

    @When("Inputs {string} password")
    public void inputPassword(String parola) {
        signInPage.inputPassword(parola);
    }

    @When("Clicks on Logare button")
    public void clickOnLogareButton() {
        signInPage.clickOnLogareButton();
    }
    @Then("The user should be logged in into the account and the Contul meu sub menu should be displayed")
    public void verifySubMenuContulMeuIsDisplayed() {
        signInPage.verifySubMenuContulMeuIsDisplayed();
    }

}
