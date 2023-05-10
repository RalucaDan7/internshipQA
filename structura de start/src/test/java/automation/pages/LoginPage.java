package automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(css = "input[type=password]")
    private WebElement passwordInput;
    @FindBy(css = "input[type=password]")
    private WebElement noutatiTitle;


    @FindBy(css = "input[type=submit]")
    private WebElement submitButton;


    public void insertPasswordAndClickSubmit(String password) {
        passwordInput.sendKeys(password);
        submitButton.click();
    }



}
