package automation.pages.RalucaPages;

import automation.base.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPageRaluca {

    public void clickOnVeziCosul() {
        WebElement veziCosulButton = DriverUtil.getDriver().findElement(By.xpath("(//a[@class='button btn-cart wc-forward'])[1]"));
        veziCosulButton.click();
    }

    public void incrementTheQuantity() {
        WebElement incrementButton = DriverUtil.getDriver().findElement(By.xpath("(//input[@class='plus'])"));
        incrementButton.click();
    }
}
