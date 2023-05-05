package automation.pages.adriana_pages;

import automation.base.DriverUtil;


import org.junit.Assert;
import org.openqa.selenium.Alert;


import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;


public class ProductFetePage {

    @FindBy(css = "a>img[class=\"attachment-woocommerce_thumbnail size-woocommerce_thumbnail wp-image-12655\"]")
    private WebElement productName;
    @FindBy(xpath = "(//button[@type=\"submit\"])[2]")
    private WebElement addToCart;

    public void clickOnTheProductButton() {
        productName.click();
    }

    public void addToBasketButton()  {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        addToCart.click();

    }

    public void checkAlertIsDisplayed(String alertMessage) {

        Alert alert = DriverUtil.getDriver().switchTo().alert();

        Assert.assertEquals("The alert message is not correct", alertMessage, alert.getText());

    }

    public void clickingOnTheOkAlert() {


        Alert alert = DriverUtil.getDriver().switchTo().alert();
        alert.accept();

    }
}












