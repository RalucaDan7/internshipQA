package automation.pages;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage {

    @FindBy(css = "a[data-added-text=\"Navigați în lista de dorințe\"]")
    private WebElement heartButton;

    @FindBy(css = "a.added")
    private WebElement heartAddedButton;

    @FindBy(css = "select[data-attribute_name=\"attribute_pa_marime\"]")
    private WebElement selecteazaOMarimeFilter;

    @FindBy(css = "option[value=\"152-11-12-ani\"]")
    private WebElement option152;


    public void clickOnHeartButton() {
        heartButton.click();
    }

    public void checkHeartButton() {
        Assert.assertTrue("Heart button added is not visible ", heartAddedButton.isDisplayed());
    }

    public void clickOnSelecteazaOMarimeFilter(){
        selecteazaOMarimeFilter.click();
    }
    public void clickOn152Option(){
        option152.click();
    }
}

