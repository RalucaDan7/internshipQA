package automation.pages.RalucaPages;

import automation.base.DriverUtil;
import automation.common.WaitUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CoreUIReactPage {

    @FindBy(xpath = "(//a[@class='c-header-nav-link'])[1]")
    private WebElement usersButton;

    @FindBy(xpath = "(//li[@class='active breadcrumb-item'])[1]")
    private WebElement usersText;

    @FindBy(xpath = "(//a[@class='page-link'])[6]")
    private WebElement nextPageButton;


    public void clickOnUsers() {
        usersButton.click();
    }

    public void checkUserPageIsDisplayed() {
        Assert.assertTrue("User page is not displayed", usersText.getText().contains("Users"));
    }

    public void clickOnStatus(String status) {
        boolean condition = true;
        while (condition) {
            List<WebElement> statusText = DriverUtil.getDriver().findElements(By.xpath("//td/span"));
            for (WebElement text : statusText) {
                if (text.getText().contains(status)) {
                    text.click();
                    condition = false;
                    break;
                }
            }
            if (condition) {
                nextPageButton.click();
            }
        }
        WebElement statusStrong = DriverUtil.getDriver().findElement(By.xpath("(//td/strong)[5]"));
        WaitUtils.waitForVisibilityOfElement(DriverUtil.getDriver(), statusStrong);
        Assert.assertTrue("You were not redirect to the correct page when you clicked " + status, statusStrong.getText().contains(status));
    }
}


