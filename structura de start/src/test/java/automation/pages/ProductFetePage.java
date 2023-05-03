package automation.pages;

import automation.base.DriverUtil;
import org.junit.Assert;
import org.openqa.selenium.Alert;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.util.concurrent.TimeUnit;

import static com.google.common.util.concurrent.Futures.withTimeout;

public class ProductFetePage {

@FindBy(xpath="(//img[@class=\"attachment-woocommerce_thumbnail size-woocommerce_thumbnail wp-image-12655\"])")
   private WebElement productName;
public void clickOnTheProductButton(){
   productName.click();
}
@FindBy(xpath="(//button[@type=\"submit\"])[2]")
   private WebElement addToCart;
@FindBy (xpath="(//ul[@class=\"woocommerce-error hidden-notice\"])")
private WebElement alertMessage;

public void addToBasket() {
    addToCart.click();

}
public boolean checkAlertIsDisplayed(String message) {
//    FluentWait wait = new FluentWait(DriverUtil.getDriver());
//    wait.withTimeout(5000, TimeUnit.MILLISECONDS);
//    wait.pollingEvery(1000, TimeUnit.MILLISECONDS);
//
//    wait.until(ExpectedConditions.visibilityOf(alertMessage));
//
//
//
 Assert.assertEquals("The alert message bla bla  ",message, alertMessage.isDisplayed());
   System.out.println(alertMessage);
   return true;
}

// {
//
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


}




