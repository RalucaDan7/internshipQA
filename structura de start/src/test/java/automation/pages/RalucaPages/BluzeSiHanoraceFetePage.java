package automation.pages.RalucaPages;

import automation.base.DriverUtil;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class BluzeSiHanoraceFetePage {
    @FindBy(xpath = "(//a[@href=\"https://qa-training.co.in/produs/bluza-cu-volane-pentru-fete/\"])[5]")
    private WebElement bluzaCuVolanePentruFeteText;
    @FindBy(xpath = "(//a[@href=\"https://qa-training.co.in/produs/bluza-jane-pentru-fete/\"])[5]")
    private WebElement bluzaJanePentruFeteText;
    @FindBy(xpath = "(//a[@href=\"https://qa-training.co.in/produs/hanorac-multicolor-bumbac-pentru-copii/\"])[5]")
    private WebElement hanoracMulticolorBumbacPentruCopiiText;
    @FindBy(xpath="(//a[@href=\"https://qa-training.co.in/produs/hanorac-namina-pentru-fete/\"])[5]")
    private WebElement hanoracNaminaPentruFeteText;
    @FindBy(xpath = "h3.wd-entities-title a")
    private List <WebElement> bluzeSiHanoraceList;

    @FindBy(xpath = "(//a[@class='product-image-link'])[1]")
    private WebElement bluzaCuVolanePentruFeteImage;

    @FindBy(xpath = "(//h1[@class=\"product_title entry-title wd-entities-title\"])")
    private WebElement productTitle;

    public void checkBluzaCuVolanePentruFeteIsDisplayed() {
        Assert.assertTrue("Bluza cu volane pentru fete is not displayed", bluzaCuVolanePentruFeteText.isDisplayed());

    }

    public void checkDisplayedProducts(String product) {
        List<String> displayedProductsList = new ArrayList<>();
        displayedProductsList.add(bluzaCuVolanePentruFeteText.getText());
        displayedProductsList.add(bluzaJanePentruFeteText.getText());
        displayedProductsList.add(hanoracMulticolorBumbacPentruCopiiText.getText());
        displayedProductsList.add(hanoracNaminaPentruFeteText.getText());

        Assert.assertTrue(product + " is not displayed", displayedProductsList.contains(product));
    }


    public void clickOnBluzaCuVolanePentruFete() {
        JavascriptExecutor js = (JavascriptExecutor) DriverUtil.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", bluzaCuVolanePentruFeteImage);
        js.executeScript("arguments[0].click();", bluzaCuVolanePentruFeteImage);
    }

    public void checkProductTitle(String title) {
        Assert.assertEquals("The title from" + title + "is not correct ", title, productTitle.getText());
    }
}
