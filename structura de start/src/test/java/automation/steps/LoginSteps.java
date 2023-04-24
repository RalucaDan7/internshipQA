package automation.steps;

import automation.baseTest.BaseTest;
import cucumber.api.java.en.When;

public class LoginSteps extends BaseTest {

    @When("Insert {string} Password And Click Submit")
    public void insertPasswordAndClickSubmit(String pass) {
        loginPage.insertPasswordAndClickSubmit(pass);
    }
}
