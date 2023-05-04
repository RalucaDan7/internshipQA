package automation.pages.TecsaPages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPage {
    @FindBy(css = "input[name=\"user_login\"]")
    private WebElement emailInputTextbox;

    public void checkEmailInputTextbox(){
        Assert.assertTrue("Email Input textbox is not displayed", emailInputTextbox.isDisplayed());
    }

    }

