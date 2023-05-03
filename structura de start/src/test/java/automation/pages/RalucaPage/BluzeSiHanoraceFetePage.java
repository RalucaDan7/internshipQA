package automation.pages.RalucaPage;

import automation.base.DriverUtil;
import automation.baseTest.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class BluzeSiHanoraceFetePage {
    @FindBy(xpath = "(//a[@href=\"https://qa-training.co.in/produs/bluza-cu-volane-pentru-fete/\"])[5]")
    private WebElement bluzaCuVolanePentruFeteText;

    @FindBy(xpath = "(//a[@class='product-image-link'])[1]")
    private WebElement bluzaCuVolanePentruFeteImage;

    @FindBy(xpath = "(//h1[@class=\"product_title entry-title wd-entities-title\"])")
    private WebElement productTitle;

    public void checkBluzaCuVolanePentruFeteIsDisplayed() {
        Assert.assertTrue("Bluza cu volane pentru fete is not displayed", bluzaCuVolanePentruFeteText.isDisplayed());

    }

    public void clickOnBluzaCuVolanePentruFete() {
        JavascriptExecutor js = (JavascriptExecutor) DriverUtil.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", bluzaCuVolanePentruFeteImage);
        Actions action = new Actions(DriverUtil.getDriver());
        action.moveToElement(bluzaCuVolanePentruFeteImage).click().build().perform();


    }

    public void checkProductTitle(String title) {
        JavascriptExecutor js = (JavascriptExecutor) DriverUtil.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", productTitle);
        Assert.assertEquals("The title from" + title + "is not correct ", title, productTitle.getText());
    }
}
