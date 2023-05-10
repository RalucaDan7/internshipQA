package automation.pages.RalucaPage;


import automation.base.DriverUtil;
import automation.common.WaitUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class CostumeDeBaieFetePage {


    public void checkDisplayedCostumeDeBaie(String costumeDeBaieNume) {
        boolean raluca = false;
        WebElement title = DriverUtil.getDriver().findElement(By.cssSelector(".entry-title.title"));
        WaitUtils.waitForVisibilityOfElement(DriverUtil.getDriver(), title);
        List<WebElement> listaProduse = DriverUtil.getDriver().findElements(By.cssSelector("h3.wd-entities-title a"));

        JavascriptExecutor js = (JavascriptExecutor) DriverUtil.getDriver();
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        for (WebElement element : listaProduse) {
            if (element.getText().contains(costumeDeBaieNume)) {
                Actions action = new Actions(DriverUtil.getDriver());
                action.moveToElement(element).perform();
                element.click();
                raluca = true;
                break;
            }


        }
        if (raluca == true) {
            System.out.println(costumeDeBaieNume + "is not in this page");
        }
    }
}
