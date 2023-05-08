package automation.steps.homePageSteps;

import automation.baseTest.BaseTest;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps extends BaseTest {

    @When("Check Favorites Link Is Visible")
    public void checkFavoritesLinkIsVisible() {
        homePage.checkFavoritesLinkIsVisible();
    }

    @When("Click On MyAccount Button")
    public void clickOnMyAccountButton() {
        homePage.clickOnMyAccountButton();
    }

    @When("Click on Noutati Button")
    public void clickOnNoutatiButton() {
        homePage.clickOnNoutatiLink();
    }

    @When("Click on Cauta produse box")
    public void clickOnCautaProduseBox() {
        homePage.clickOnCautaProduseBox();
    }

    @When("Type in rochie and click search")
    public void completeSearchInputAndClickSearch() {
        homePage.completeSearchInputAndClickSearch();


    }

    @When("Type in rochie")
    public void completeSearch() {
        homePage.completeSearchInput2();


    }

    @Then("A dropdown menu with the suggested results is displayed")
    public void checkSuggestionList() {
        homePage.checkSuggestionListIsVisible();

    }

    @When("The user clicks on {string} button")
    public void clickOnContulMeuButton() {
        homePage.clickOnContulMeuButton();
    }

    @When("The {string} side menu is displayed")
    public void seeAutentificareSideMenu() {
        homePage.seeAutentificareSideMenu();
    }

    @When("The user inputs {string} email address")
    public void inputEmailAddress(String user) {
        homePage.inputEmailAddress(user);
    }

    @When("Inputs {string} password")
    public void inputPassword(String parola) {
        homePage.inputPassword(parola);
    }

    @When("Clicks on {string} button")
    public void clickOnLogareButton() {
        homePage.clickOnLogareButton();
    }
}
