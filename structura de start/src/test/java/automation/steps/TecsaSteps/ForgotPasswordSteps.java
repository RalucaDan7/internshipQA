package automation.steps.TecsaSteps;

import automation.baseTest.BaseTest;
import cucumber.api.java.en.Then;

public class ForgotPasswordSteps extends BaseTest {
    @Then("Check Email input textbox is displayed")
    public void checkEmailInputtextbox(){
        forgotPasswordPage.checkEmailInputTextbox();

    }

}
