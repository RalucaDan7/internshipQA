package automation.pages;

import automation.base.DriverUtil;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BluzeSiHanoraceFetePage {

    @FindBy(xpath = "(//a[@href=\"https://qa-training.co.in/produs/bluza-cu-volane-pentru-fete/\"])[5]")
    private WebElement bluzaCuVolanePentruFeteTextSiLink;

    @FindBy(xpath = "(//a[@class=\"product-image-link\"])[1]")
    private WebElement bluzaCuVolanePentruFeteImage;

    @FindBy(xpath = "(//h1[@class=\"product_title entry-title wd-entities-title\"])")
    private WebElement productTitle;

    public void checkBluzaCuVolanePentruFeteIsDisplayed() {
        Assert.assertTrue("Bluza cu volane pentru fete is not displayed", bluzaCuVolanePentruFeteTextSiLink.isDisplayed());

    }

    public void clickOnBluzaCuVolanePentruFete() {
        WebDriverWait wait = new WebDriverWait(DriverUtil.getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(bluzaCuVolanePentruFeteImage));

        bluzaCuVolanePentruFeteImage.click();
    }

    public void checkProductTitle(String title) {
        Assert.assertEquals("The title from" + title + "is not correct ", title, productTitle.getText());
    }
}
