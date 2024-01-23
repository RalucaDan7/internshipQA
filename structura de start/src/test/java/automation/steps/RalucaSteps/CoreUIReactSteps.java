package automation.steps.RalucaSteps;

import automation.base.DriverUtil;
import automation.baseTest.BaseTest;
import automation.common.Constants;
import automation.common.WaitUtils;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CoreUIReactSteps extends BaseTest {
    @Given("The user navigates to CoreUIReact page")
    public void userNavigatesToCoreUIReactPage() {
        DriverUtil.getDriver().get(Constants.BASE_CORE_UI_URL + Constants.CORE_UI_REACT_DASHBORD_URL);
        WaitUtils.waitForPageToLoad();
    }

    @When("Click on Users")
    public void clickOnUsers() {
        coreUIReactPage.clickOnUsers();
    }

    @Then("Check the user page is displayed")
    public void checkUserPageIsDisplayed() {
        coreUIReactPage.checkUserPageIsDisplayed();
    }

    @And("Click on {string}")
    public void clickOnStatus(String status) {
        coreUIReactPage.clickOnStatus(status);
    }

    @When("Click on Base section")
    public void clickOnBase() {
        coreUIReactPage.clickOnBase();
    }

    @Then("Click on Cards")
    public void clickOnCards() {
        coreUIReactPage.clickOnCards();
    }

    @And("Check Card actions is displayed")
    public void checkCardsActionsIsDisplayed() {
        coreUIReactPage.checkCardsActionsIsDisplayed();
    }

    @And("Check Lorem ipsum text is displayed")
    public void checkLoremIpsumTextIsDisplayed() {
        coreUIReactPage.checkLoremIpsumTextIsDisplayed();
    }

    @And("Click on arrow sign")
    public void clickOnArrowSign() {
        coreUIReactPage.clickOnArrowSign();
    }

    @And("Check if Lorem ipsum text is not displayed after clicking arrow sign")
    public void checkTextAfterClickingOnArrowSign() {
        coreUIReactPage.checkTextAfterClickingOnArrowSign();
    }

    @And("Click on x sign")
    public void clickOnXSign() {
        coreUIReactPage.clickOnXSign();
    }

    @And("Check if the card is displayed")
    public void checkTheCard() {
        coreUIReactPage.checkTheCard();
    }

    @And("Check if the card is displayed after refreshing the page")
    public void checkTheCardAfterRefresh() {
        coreUIReactPage.checkTheCardAfterRefresh();
    }

    @When("Click on Notification section")
    public void clickOnNotification() {coreUIReactPage.clickOnNotification();}

    @Then("Click on Modal")
    public void clickOnModal() {
        coreUIReactPage.clickOnModal();
    }

    @And("Click on cancel button")
    public void clickOnCancelButton() {
        coreUIReactPage.clickOnCancelButton();
    }

    @And("Click on Primary, Warning and Info modal")
    public void clickOnPrimaryWarningInfoModal() {
        coreUIReactPage.clickOnPrimaryWarningInfoModal();
    }

    @When("Click on Pages")
    public void clickOnPages() {
        coreUIReactPage.clickOnPages();
    }

    @Then("Click on Login")
    public void clickOnLogin() {
        coreUIReactPage.clickOnLogin();
    }

    @And("Check username and password is displayed")
    public void checkUsernameAndPasswordIsDisplayed() {
        coreUIReactPage.checkUsernameAndPasswordIsDisplayed();
    }

    @And("Input {string} as username and {string} as password")
    public void inputUsernameAndPassword(String username, String password) {
        coreUIReactPage.inputUsernameAndPassword(username, password);
    }
    @And("Check login button is blue")
    public void checkLoginButtonColor() {
        coreUIReactPage.checkLoginButtonColor();
    }

    @And("Input the button text as username")
    public void inputTheButtonTextAsUsername() {
        coreUIReactPage.inputTheButtonTextAsUsername();
    }

    @Then("Display the name and the registered date of {string} with {string} status")
    public void displayTheNameAndTheRegisteredDate(String role, String status) {
        coreUIReactPage.displayTheNameAndTheRegisteredDate(role, status);
    }
}
