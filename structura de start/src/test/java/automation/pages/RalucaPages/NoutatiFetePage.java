package automation.pages.RalucaPages;

import automation.base.DriverUtil;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NoutatiFetePage {


    public void clickOnProduct(String productName) {
        List<WebElement> listaProduse = DriverUtil.getDriver().findElements(By.cssSelector("h3.wd-entities-title a"));
        boolean condition = true;
        while (condition == true) {
            for (int i = 0; i < listaProduse.size(); i++) {
                if (listaProduse.contains(productName)) {
                    listaProduse.get(i).click();
                    condition=false;
                    break;
                }

            }if(condition=true){
                JavascriptExecutor js = (JavascriptExecutor) DriverUtil.getDriver();
                WebElement incarcaMaiMulteProduseButton = (WebElement) js.executeScript("return document.querySelector('a[class=\"btn wd-load-more wd-products-load-more load-on-click\"]')");
                js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
                incarcaMaiMulteProduseButton.click();
            }

        }
    }
}