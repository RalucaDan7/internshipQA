package automation.pages.TecsaPages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProductTecsaPage {

    @FindBy(css = "a[data-added-text=\"Navigați în lista de dorințe\"]")
    private WebElement heartButton;

    @FindBy(css = "a.added")
    private WebElement heartAddedButton;

    @FindBy(xpath = "//*[@data-attribute_name=\"attribute_pa_marime\"]")
    private WebElement selecteazaOMarimeFilter;


    @FindBy(xpath = "//button[contains(text(),\"Adaugă în coș\")]")
    private WebElement adaugaInCosButton;

    @FindBy(css = "div[class=\"close-side-widget wd-action-btn wd-style-text wd-cross-icon\"]")
    private WebElement inchideButton;

    @FindBy(css = "span[class=\"woocommerce-Price-amount amount\"]")
    private WebElement amountButton;

    @FindBy(xpath = "//*[@class=\"button btn-cart wc-forward\"]")
    private WebElement veziCosulButton;




    public void clickOnHeartButton() {
        heartButton.click();
    }

    public void checkHeartButton() {
        Assert.assertTrue("Heart button added is not visible ", heartAddedButton.isDisplayed());
    }


    public void select152Option() {
        Select select = new Select(selecteazaOMarimeFilter);
        select.selectByIndex(3);
    }

    public void clickOnAdaugaInCosButton(){
        adaugaInCosButton.click();
    }

    public void clickOnInchideButton(){ inchideButton.click();}

    public void clickOnAmountButton(){ amountButton.click();}

    public void clickOnVeziCosulButton(){veziCosulButton.click();}

}

