package automation.pages;

import automation.base.DriverUtil;
import automation.base.WebDriverUtil;
import automation.common.WaitUtils;
import org.junit.Assert;
import org.openqa.selenium.Alert;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static com.google.common.util.concurrent.Futures.withTimeout;
import static org.bouncycastle.crypto.tls.ContentType.alert;

public class ProductFetePage {

    @FindBy(css = "a>img[class=\"attachment-woocommerce_thumbnail size-woocommerce_thumbnail wp-image-12655\"]")
    private WebElement productName;
    @FindBy(xpath = "(//button[@type=\"submit\"])[2]")
    private WebElement addToCart;

    public void clickOnTheProductButton() {
        productName.click();
    }

    public void addToBasketButton() {
        addToCart.click();
//        WebDriverWait wait = new WebDriverWait(DriverUtil.getDriver(), 7);

    }

    public void checkAlertIsDisplayed(String alertMessage) {


        Alert alert = DriverUtil.getDriver().switchTo().alert();

        Assert.assertEquals("The alert message is not correct", alertMessage, alert.getText());
    }

    public void clickingOnTheOkAlert() {

        //WebDriverWait wait = new WebDriverWait(DriverUtil.getDriver(), 10);
        Alert alert = DriverUtil.getDriver().switchTo().alert();
        alert.accept();

    }
//    WebDriverWait wait = new WebDriverWait(DriverUtil.getDriver(), 10);
//    WebElement message = wait.until(ExpectedConditions.visibilityOf(alertMessage));
//    String mesageText = message.getText();

//FluentWait wait = new FluentWait(DriverUtil.getDriver());
//  wait.withTimeout(7000, TimeUnit.MILLISECONDS);
//  wait.pollingEvery(1000, TimeUnit.MILLISECONDS);
//
//   wait.until(ExpectedConditions.visibilityOf(alertMessage));


}


// {

//    FluentWait wait = new FluentWait(DriverUtil.getDriver());
//      wait.withTimeout(5000, TimeUnit.MILLISECONDS);
//      wait.pollingEvery(250, TimeUnit.MILLISECONDS);
//
//
//    if(wait.until(ExpectedConditions.alertIsPresent())==null)
//        System.out.println("Alert not exists");
//    else
//        System.out.println("Alert exists");
//    Alert alert = DriverUtil.getDriver().switchTo().alert();
//
//
////      //get the message which is present on pop-up
//    String message = alert.getText();
//
////      //print the pop-up message
//    System.out.println(message);
//







