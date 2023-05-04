package automation.pages.octavian_pages;

import automation.common.WaitUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CartPage {

    @FindBy(xpath = "(//a[@class=\"button btn-cart wc-forward\"])[1]")
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

    @FindBy(xpath = "//li[@class=\"woocommerce-mini-cart-item mini_cart_item\"]")
    private List<WebElement> cartProductsList;

    @FindBy(xpath = "(//span[@class=\"wd-entities-title\"])[2]")
    private WebElement secondCartProduct;


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

    public void checkProductsInCart(List<String> data) {
        WaitUtils.waitForPageToLoad();
        for (String cartProduct : data){
            Assert.assertTrue("Product \""+ cartProduct +"\" is not in the cart.", cartProductsList.stream().map(WebElement::getText).collect(Collectors.joining(", ")).contains(cartProduct));
        }
    }

    public void checkProductsInCartByLoopingWebElements(List<String> data) {
        WaitUtils.waitForPageToLoad();
        for (int i = 0; i < cartProductsList.size(); i++){
            Assert.assertTrue("Product \""+ data.get(i) +"\" is not in the cart.", cartProductsList.get(i).getText().contains(data.get(i)));
        }
    }

    public void checkProductsInCartKeyTable(Map<String, String> dataMap) {
        WaitUtils.waitForPageToLoad();
        Assert.assertTrue("Product \""+ dataMap.get("product1") +"\" is not in the cart.", cartProductsList.stream().map(WebElement::getText).collect(Collectors.joining(", ")).contains(dataMap.get("product1")));
    }
}
