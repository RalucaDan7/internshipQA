package automation.pages.RalucaPages;

import automation.base.DriverUtil;
import automation.common.WaitUtils;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchTheProductPage {
    @FindBy(css = "h1[class=\"product_title entry-title wd-entities-title\"]")
    private WebElement productTitle;

    @FindBy(xpath = "(//input[@placeholder='Cauta produse'])[1]")
    private WebElement searchBoxField;

    @FindBy(xpath = "(//span[@class='woocommerce-Price-amount amount']/bdi)[2]")
    private WebElement productPriceText;


    public String takeTheTitleAndReturnTheValue() {
        return productTitle.getText();
    }

    public void typeTheValueInSearchBox(String value) {
        WaitUtils.waitForVisibilityOfElement(DriverUtil.getDriver(), searchBoxField);
        searchBoxField.click();
        searchBoxField.sendKeys(value);
        searchBoxField.sendKeys(Keys.ENTER);
    }

    public void checkTheProductIsDisplayed(String value) {
        Assert.assertTrue("The product is not displayed", productTitle.getText().contains(value));
    }

    public String takeThePriceAndReturnTheValue() {
        return productPriceText.getText();
    }

    public void typeThePriceInSearchBox(String price) {
        WaitUtils.waitForVisibilityOfElement(DriverUtil.getDriver(), searchBoxField);
        searchBoxField.click();
        searchBoxField.sendKeys(price);
    }

    public int takeTheIntegerPriceAndReturnTheValue() {
        String [] priceArray = productPriceText.getText().split("\\.");
        return Integer.parseInt(priceArray[0]);
    }

    public void typeTheIntegerPriceInSearchBox(int integerPrice) {
        WaitUtils.waitForVisibilityOfElement(DriverUtil.getDriver(), searchBoxField);
        searchBoxField.click();
        searchBoxField.clear();
        searchBoxField.sendKeys(Integer.toString(integerPrice));
        System.out.println(integerPrice);
    }

    public float takeTheFloatPriceAndReturnTheValue() {
        String[] priceArray = productPriceText.getText().split("lei");
        return Float.parseFloat(priceArray[0]);
    }

    public void typeTheFloatPriceInSearchBox(float floatPrice) {
        floatPrice=floatPrice/4;
        WaitUtils.waitForVisibilityOfElement(DriverUtil.getDriver(), searchBoxField);
        searchBoxField.click();
        searchBoxField.clear();
        searchBoxField.sendKeys(String.valueOf(floatPrice));
        System.out.println(floatPrice);
    }
}
