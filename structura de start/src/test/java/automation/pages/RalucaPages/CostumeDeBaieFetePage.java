package automation.pages.RalucaPages;


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

    public void checkDisplayedCostumeDeBaieAndClickOnIt(String costumeDeBaieNume) {
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

        if (raluca == false) {
            System.out.println(costumeDeBaieNume + "is not in this page");
        }
    }

    public void checkProductTitle(String productName) {
        WebElement individualPageProductTitle = DriverUtil.getDriver().findElement(By.xpath("(//h1[@class='product_title entry-title wd-entities-title'])"));
        WaitUtils.waitForVisibilityOfElement(DriverUtil.getDriver(), individualPageProductTitle);
        Assert.assertEquals("The title from" + productName + "is not displayed ", productName, individualPageProductTitle.getText());
    }

    public void selectTheSize(String size) {
        WebElement selectBox = DriverUtil.getDriver().findElement(By.xpath("(//select[@id='pa_marime'])"));
        selectBox.click();
        boolean desiredSize = false;
        List<WebElement> listaMarimi = DriverUtil.getDriver().findElements(By.cssSelector("table.variations option"));
        for (WebElement marime : listaMarimi) {
            if (marime.getText().contains(size)) {
                marime.click();
                desiredSize = true;
                break;
            }
        }
        if (desiredSize == false) {
            System.out.println(size + " is not in stock. Please select another size.");
        }

    }

    public void clickOnAdaugaInCosButton() {
        WebElement adaugaInCosButton = DriverUtil.getDriver().findElement(By.xpath("(//button[@type='submit'])[2]"));
        adaugaInCosButton.click();
    }
}
