package automation.pages;

import automation.base.DriverUtil;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BluzeSiHanoraceFetePage {
    @FindBy(xpath = "(//a[@class=\"product-image-link\"])[1]")
    private WebElement bluzaCuVolanePentruFeteImage;

    @FindBy(xpath = "(//h1[@class=\"product_title entry-title wd-entities-title\"])")
    private WebElement bluzaCuVolanePentruFeteTitle;

    public void clickOnBluzaCuVolanePentruFete() {
        WebDriverWait wait = new WebDriverWait(DriverUtil.getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(bluzaCuVolanePentruFeteImage));

         bluzaCuVolanePentruFeteImage.click();}

    public void checkProductTitle(String productTitle) {
        Assert.assertEquals("The title from" + productTitle + "is not correct ", bluzaCuVolanePentruFeteTitle.getText());
    }
}
