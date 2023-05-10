package automation.pages.octavian_pages;

import automation.base.DriverUtil;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductOctavianPage {

    @FindBy(xpath = "//h1[@class=\"product_title entry-title wd-entities-title\"]")
    private WebElement productTitle;

    @FindBy(xpath = "//select[@id=\"pa_marime\"]")
    private WebElement sizeBox;

    @FindBy(xpath = "(//option[@class=\"attached enabled\"])[1]")
    private WebElement selectSizeDropdown;

    @FindBy(xpath = "//option[@class=\"attached enabled\"]")
    private List<WebElement> selectSizeDropdownList;

    @FindBy(xpath = "(//button[@type=\"submit\"])[2]")
    private WebElement addToCartButton;


    public void checkProperProductPageIsDisplayed(String pass) {
        Assert.assertTrue("The product page title does not contain the search string", productTitle.getText().toLowerCase().contains(pass.toLowerCase()));
    }

    public void selectFirstSize() {
        sizeBox.click();
        selectSizeDropdown.click();
    }

    public void addToCart() {
        addToCartButton.click();
    }

    public void selectSize(String pass) {
        sizeBox.click();
        int count = 0;
        for (WebElement element: selectSizeDropdownList) {
            if (element.getText().contains(pass)){
                element.click();
                break;
            }
            count++;
        }
        if (count == selectSizeDropdownList.size()){
            System.out.println("Desired size is not a valid option for product: \"" + productTitle.getText() + "\".");
        }
    }

    public void addToCartJS() {
        JavascriptExecutor js = (JavascriptExecutor) DriverUtil.getDriver();
        js.executeScript("arguments[0].click();", addToCartButton);
    }

    public void addToCartActions() {
        Actions actions = new Actions(DriverUtil.getDriver());
        actions.click(addToCartButton).perform();
    }

    public void clickOnSettingsIcon(){
        JavascriptExecutor js = (JavascriptExecutor) DriverUtil.getDriver();
//        WebElement settingsIconButton = (WebElement)
        js.executeScript("document.querySelector('button.single_add_to_cart_button').click()");
//        settingsIconButton.click();
    }
}
