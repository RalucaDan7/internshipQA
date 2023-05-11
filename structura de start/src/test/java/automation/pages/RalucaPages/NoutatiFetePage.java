package automation.pages.RalucaPages;

import automation.base.DriverUtil;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


import java.util.List;

public class NoutatiFetePage {


    public void clickOnProductRaluca(String productName) {
        boolean butonInvizibil = false;
        boolean condition = true;
        JavascriptExecutor js = (JavascriptExecutor) DriverUtil.getDriver();
        while (condition == true) {
            List<WebElement> listaProduse = DriverUtil.getDriver().findElements(By.cssSelector("h3.wd-entities-title a"));
            for (int i = 0; i < listaProduse.size(); i++) {
                if (listaProduse.get(i).getText().contains(productName)) {
                    Actions action = new Actions(DriverUtil.getDriver());
                    js.executeScript("arguments[0].scrollIntoView(); window.scrollBy(0, -250);", listaProduse.get(i));
                    action.moveToElement(listaProduse.get(i)).perform();
                    listaProduse.get(i).click();
                    condition = false;
                    break;
                }
            }
            if (condition) {
                WebElement abuton = DriverUtil.getDriver().findElement(By.xpath("//a[@class=\"btn wd-load-more wd-products-load-more load-on-click\"]"));
                if (!abuton.getAttribute("style").contains("display")) {
                    WebElement incarcaMaiMulteProduseButton = DriverUtil.getDriver().findElement(By.xpath("//span[@class=\"load-more-label\"]"));
                    js.executeScript("arguments[0].scrollIntoView(); window.scrollBy(0, -250);", incarcaMaiMulteProduseButton);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    Actions action = new Actions(DriverUtil.getDriver());
                    action.moveToElement(incarcaMaiMulteProduseButton).perform();
                    incarcaMaiMulteProduseButton.click();
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        Assert.assertTrue("The product was not on the page", DriverUtil.getDriver().findElement(By.xpath("//h1[@class='product_title entry-title wd-entities-title']")).isDisplayed());
        WebElement productTitle = DriverUtil.getDriver().findElement(By.xpath("//h1[@class='product_title entry-title wd-entities-title']"));
        Assert.assertTrue("The product title is not visible", productTitle.getText().contains(productName));
    }
}
