package automation.steps;

import automation.baseTest.BaseTest;
import automation.pages.ForgotPasswordPage;
import cucumber.api.java.en.Then;
import org.glassfish.grizzly.compression.lzma.impl.Base;

public class ForgotPasswordSteps extends BaseTest {
    @Then("Check Email input textbox is displayed")
    public void checkEmailInputtextbox(){
        forgotPasswordPage.checkEmailInputTextbox();

    }

}
