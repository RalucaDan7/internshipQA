package automation.steps;

import automation.baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class SearchSteps extends BaseTest {

    @Then("Check {string} title is displayed")
    public void checkTitle(String pass){
        searchPage.checkTitle(pass);
    }

    @Then("Check {string} title is displayed by CSS")
    public void checkTitleByCSS(String pass){
        searchPage.checkTitleByCSS(pass);
    }
}
