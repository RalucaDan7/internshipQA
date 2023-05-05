package automation.pages.octavian_pages;

import automation.baseTest.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BaietiCategoryPage {

    @FindBy(xpath = "(//div[@class=\"product-element-top wd-quick-shop\"])[1]")
    private WebElement firstProductElement;

    @FindBy(xpath = "(//div[@class=\"product-element-top wd-quick-shop\"])[2]")
    private WebElement secondProductElement;


    public void clickFirstProduct() {
        firstProductElement.click();
    }

    public void clickSecondProduct() {
        secondProductElement.click();
    }
}
