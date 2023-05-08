package automation.steps.Daniel.steps;

import automation.baseTest.BaseTest;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInSteps extends BaseTest {

    @FindBy(xpath = "//ul[@class=\"wd-sub-menu\"]")
    private WebElement subMenu;
    @Then("The user should be logged in into the account and the sub menu should be displayed")
    public void checkIfSubMenuIsVisible(){
        Assert.assertTrue("The user has succesfully logged in ", subMenu.isDisplayed());
    }
}
