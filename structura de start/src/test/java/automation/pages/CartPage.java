package automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {

    @FindBy(xpath = "//a[@class=\"button btn-cart wc-forward\"]")
    private WebElement goToCartButton;

    @FindBy(xpath = "//input[@value=\"-\"]")
    private WebElement decrementProductQuantityButton;

    @FindBy(xpath = "//input[@value=\"+\"]")
    private WebElement incrementProductQuantityButton;

    @FindBy(xpath = "//button[@name=\"update_cart\"]")
    private WebElement updateCartButton;

    @FindBy(xpath = "//p[@class=\"cart-empty wd-empty-page\"]")
    private WebElement emptyCartImage;

    @FindBy(xpath = "//input[@title=\"Cantitate\"]")
    private WebElement productQuantityElement;


    public void goToCart() {
        goToCartButton.click();
    }

    public void decrementProductQuantity() {
        decrementProductQuantityButton.click();
        updateCartButton.click();
    }

    public void cartEmpty() {
        emptyCartImage.isDisplayed();
    }

    public void incrementProductQuantity() {
        incrementProductQuantityButton.click();
        updateCartButton.click();
    }

    public void checkProductQuantity(String pass) {
        Assert.assertTrue("Product quantity did not increase", productQuantityElement.getText().contains(pass));
    }
}
