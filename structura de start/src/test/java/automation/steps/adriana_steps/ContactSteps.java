package automation.steps.adriana_steps;

import automation.baseTest.BaseTest;
import cucumber.api.java.en.Then;


public class ContactSteps extends BaseTest {

    @Then("A form named {string} is displayed")
    public void checkContactPageIsDisplayed(String title) {
        contactPage.checkContactTitle(title);
    }

    @Then("A form named {string} is displayed using Css")
    public void checkContactPageIsDisplayedCss(String title) {
        contactPage.checkContactTitleCss(title);
    }
}


