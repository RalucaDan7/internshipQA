package automation.pages.octavian_pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage {

    @FindBy(xpath = "//h1[@class=\"product_title entry-title wd-entities-title\"]")
    private WebElement productTitle;

    @FindBy(xpath = "//select[@id=\"pa_marime\"]")
    private WebElement sizeBox;

    @FindBy(xpath = "(//option[@class=\"attached enabled\"])[1]")
    private WebElement selectSizeDropdown;

    @FindBy(xpath = "(//button[@type=\"submit\"])[2]")
    private WebElement addToCartButton;


    public void checkProperProductPageIsDisplayed(String pass) {
        Assert.assertTrue("The product page title does not contain the search string", productTitle.getText().toLowerCase().contains(pass.toLowerCase()));
    }

    public void selectSize() {
        sizeBox.click();
        selectSizeDropdown.click();
    }

    public void addToCart() {
        addToCartButton.click();
    }
}
