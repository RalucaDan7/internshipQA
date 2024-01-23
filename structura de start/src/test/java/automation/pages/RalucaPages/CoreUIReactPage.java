package automation.pages.RalucaPages;

import automation.base.DriverUtil;
import automation.common.WaitUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CoreUIReactPage {

    @FindBy(xpath = "(//a[@class='c-header-nav-link'])[1]")
    private WebElement usersButton;

    @FindBy(xpath = "(//li[@class='active breadcrumb-item'])[1]")
    private WebElement usersText;

    @FindBy(xpath = "(//a[@class='page-link'])[6]")
    private WebElement nextPageButton;

    @FindBy(xpath = "//li[@class=' page-item']")
    private List<WebElement> pageNumberButtons;

    @FindBy(xpath = "(//a[@class='c-sidebar-nav-dropdown-toggle'])[1]")
    private WebElement baseText;

    @FindBy(xpath = "//a[contains(text(),'Cards')]")
    private WebElement cardsText;

    @FindBy(xpath = "(//header[@class='card-header'])[23]")
    private WebElement cardActionsTitle;

    @FindBy(xpath = "//div[@class='collapse show']")
    private WebElement loremIpsumText;

    @FindBy(xpath = "(//a[@class='card-header-action'])[3]")
    private WebElement arrowSignButton;

    @FindBy(xpath = "(//a[@class='card-header-action'])[4]")
    private WebElement xSignButton;

    @FindBy(xpath = "//a[contains(text(),'Notifications')]")
    private WebElement notificationButton;

    @FindBy(xpath = "//a[contains(text(),'Modal')]")
    private WebElement modalButton;

    @FindBy(xpath = "//button[contains(text(),'Cancel')]")
    private List<WebElement> modalCancelButtonList;

    @FindBy(xpath = "(//button[contains(text(),'Cancel')])[1]")
    private WebElement cancelButton;

    @FindBy(css = "button[class*=\"mr-1 btn btn\"]")
    private List<WebElement> modalButtonsList;


    @FindBy(xpath = "//a[contains(text(),'Pages')]")
    private WebElement pagesButton;

    @FindBy(xpath = "//a[contains(text(),'Login')]")
    private WebElement loginButton;

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    private WebElement loginButtonFromLoginPage;

    @FindBy(css = "input[type=\"text\"]")
    private WebElement usernameField;
    @FindBy(css = "input[type=\"password\"]")
    private WebElement passwordField;


    public void clickOnUsers() {
        usersButton.click();
    }

    public void checkUserPageIsDisplayed() {
        Assert.assertTrue("User page is not displayed", usersText.getText().contains("Users"));
    }

    public void clickOnStatus(String status) {
        int loadNextPage = 0;
        boolean condition = true;
        while (condition && loadNextPage <= pageNumberButtons.size()) {
            List<WebElement> statusText = DriverUtil.getDriver().findElements(By.xpath("//td/span"));
            for (WebElement text : statusText) {
                if (text.getText().contains(status)) {
                    text.click();
                    condition = false;
                    break;
                }
            }
            if (condition && loadNextPage <= pageNumberButtons.size()) {
                nextPageButton.click();
                loadNextPage++;
            }
        }
        WebElement statusStrong = DriverUtil.getDriver().findElement(By.xpath("(//td/strong)[5]"));
        WaitUtils.waitForVisibilityOfElement(DriverUtil.getDriver(), statusStrong);
        Assert.assertTrue("You were not redirect to the correct page when you clicked " + status, statusStrong.getText().contains(status));
    }

    public void clickOnBase() {
        baseText.click();
    }

    public void clickOnCards() {
        WaitUtils.waitForVisibilityOfElement(DriverUtil.getDriver(), cardsText);
        cardsText.click();
    }

    public void checkCardsActionsIsDisplayed() {
        JavascriptExecutor js = (JavascriptExecutor) DriverUtil.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", cardActionsTitle);
        WaitUtils.waitForVisibilityOfElement(DriverUtil.getDriver(), cardActionsTitle);
        Assert.assertTrue("The title doesn't contain Card actions title", cardActionsTitle.getText().contains("Card actions"));
    }

    public void checkLoremIpsumTextIsDisplayed() {
        Assert.assertTrue("Lorem ipsum text is not displayed", loremIpsumText.getText().contains("Lorem ipsum"));
    }

    public void clickOnArrowSign() {
        arrowSignButton.click();
    }

    public void checkTextAfterClickingOnArrowSign() {
        WebElement loremIpsumText = DriverUtil.getDriver().findElement(By.xpath("//div[@class='collapse']"));
        Assert.assertFalse("Lorem ipsum text is displayed and it should not be", loremIpsumText.getAttribute("class").contains("show"));
    }

    public void clickOnXSign() {
        xSignButton.click();
    }

    public void checkTheCard() {
        WebElement cardActionsDiv = DriverUtil.getDriver().findElement(By.xpath("//div[@class='fade']"));
        Assert.assertFalse("The div is displayed and it should not be", cardActionsDiv.getAttribute("class").contains("show"));
    }

    public void checkTheCardAfterRefresh() {
        DriverUtil.getDriver().navigate().refresh();
        WebElement cardActionsDiv = DriverUtil.getDriver().findElement(By.xpath("//div[@class='fade show']"));
        Assert.assertTrue("The div is not displayed and it should not be", cardActionsDiv.getAttribute("class").contains("show"));
    }

    public void clickOnNotification() {
        notificationButton.click();
    }

    public void clickOnModal() {
        modalButton.click();
    }

    public void clickOnCancelButton() {
        cancelButton.click();
    }

    public void clickOnPrimaryWarningInfoModal() {
        for (int i = 0; i < modalButtonsList.size(); i += 2) {
            modalButtonsList.get(i).click();
            modalCancelButtonList.get(3 + i).click();
        }
    }
    public void clickOnPages() {
        Actions action = new Actions(DriverUtil.getDriver());
        action.moveToElement(pagesButton).click().build().perform();
    }

    public void clickOnLogin() {
        WaitUtils.waitForVisibilityOfElement(DriverUtil.getDriver(), loginButton);
        loginButton.click();
    }

    public void checkUsernameAndPasswordIsDisplayed() {
        Assert.assertTrue("Username is not displayed", usernameField.getAttribute("placeholder").contains("Username"));
        Assert.assertTrue("Password is not displayed", passwordField.getAttribute("placeholder").contains("Password"));
    }

    public void inputUsernameAndPassword(String username, String password) {
        usernameField.click();
        usernameField.sendKeys(username);
        passwordField.click();
        passwordField.sendKeys(password);
    }

    public void checkLoginButtonColor() {
        String rgbaButtonColor = loginButtonFromLoginPage.getCssValue("background-color").trim();
        Assert.assertTrue("The button is not blue", rgbaButtonColor.contains("rgba(50, 31, 219, 1)"));

        String[] color = rgbaButtonColor.replace("rgba(", "").split(",");
        String hex = String.format("#%02x%02x%02x", Integer.parseInt(color[0].trim()), Integer.parseInt(color[1].trim()), Integer.parseInt(color[2].trim()));
        Assert.assertTrue("The button is not blue", hex.contains("#321fdb"));
    }

    public void inputTheButtonTextAsUsername() {
        usernameField.click();
        usernameField.clear();
        String loginButtonText = loginButtonFromLoginPage.getText();
        usernameField.sendKeys(loginButtonText);
    }

    public void displayTheNameAndTheRegisteredDate(String role, String status) {
        boolean condition = false;
        int loadNextPage = 0;
        while (loadNextPage <= pageNumberButtons.size()) {
            List<WebElement> nameList = DriverUtil.getDriver().findElements(By.xpath("//tr/td[1]"));
            List<WebElement> registeredDateList = DriverUtil.getDriver().findElements(By.xpath("//tr/td[2]"));
            List<WebElement> roleList = DriverUtil.getDriver().findElements(By.xpath("//tr/td[3]"));
            List<WebElement> statusTextList = DriverUtil.getDriver().findElements(By.xpath("//td/span"));
            for (int i = 0; i < roleList.size(); i++) {
                if (roleList.get(i).getText().equals(role) && statusTextList.get(i).getText().equals(status)) {
                    System.out.println("The person with " + role + " role and " + status + " status is " + nameList.get(i).getText()
                            + " and his registered date is " + registeredDateList.get(i).getText());
                    condition = true;
                }
            }
            if (loadNextPage < pageNumberButtons.size()) {
                pageNumberButtons.get(loadNextPage).click();
            }
            loadNextPage++;
        }
        Assert.assertTrue("The user doesn't exist", condition);
    }
}





