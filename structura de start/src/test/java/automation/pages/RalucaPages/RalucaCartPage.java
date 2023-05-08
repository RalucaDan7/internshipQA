package automation.pages.RalucaPages;

import automation.base.DriverUtil;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RalucaCartPage {

    @FindBy(xpath = "(//span[@class='woocommerce-Price-amount amount'])[3]")
    private WebElement subtotalText;

    public void clickOnVeziCosul() {
        WebElement veziCosulButton = DriverUtil.getDriver().findElement(By.xpath("(//a[contains(text(), 'Vezi coșul')])[2]"));
        veziCosulButton.click();
    }

    public void incrementTheQuantity() {
        WebElement incrementButton = DriverUtil.getDriver().findElement(By.xpath("(//input[@class='plus'])"));
        incrementButton.click();
    }

    public void checkTheQuantityBySubtotalText() {
        Assert.assertTrue("The quantity was not increased", subtotalText.getText().contains("458.00"));
    }

    public void checkTheQuantityByQuantityValue() {
        WebElement quantityValue = DriverUtil.getDriver().findElement(By.xpath("//input[@id='quantity_6458f973e3659']"));
        Assert.assertTrue("", quantityValue.getAttribute("value").contains("2"));
    }
}
