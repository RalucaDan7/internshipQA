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
        Assert.assertFalse("The div is displayed and it should not be",cardActionsDiv.getAttribute("class").contains("show"));
    }

    public void checkTheCardAfterRefresh() {
        DriverUtil.getDriver().navigate().refresh();
        WebElement cardActionsDiv = DriverUtil.getDriver().findElement(By.xpath("//div[@class='fade show']"));
        Assert.assertTrue("The div is not displayed and it should not be",cardActionsDiv.getAttribute("class").contains("show"));
    }

}


