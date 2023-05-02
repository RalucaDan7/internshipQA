package automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryPage {

    @FindBy(xpath = "(//div[@class=\"product-element-top wd-quick-shop\"])[1]")
    private WebElement firstProduct;

    public void clickFirstProduct() {
        firstProduct.click();
    }
}
