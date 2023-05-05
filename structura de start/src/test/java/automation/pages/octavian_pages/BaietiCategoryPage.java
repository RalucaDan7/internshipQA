package automation.pages.octavian_pages;

import automation.base.DriverUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BaietiCategoryPage {

    @FindBy(xpath = "(//div[@class=\"product-element-top wd-quick-shop\"])[1]")
    private WebElement firstProductElement;

    @FindBy(xpath = "(//div[@class=\"product-element-top wd-quick-shop\"])[2]")
    private WebElement secondProductElement;

    @FindBy(xpath = "//h3[@class=\"wd-entities-title\"]")
    private List<WebElement> productsList;


    public void clickFirstProduct() {
        firstProductElement.click();
    }

    public void clickSecondProduct() {
        secondProductElement.click();
    }

    public void clickOnGivenProduct(String pass) {
        JavascriptExecutor js = (JavascriptExecutor) DriverUtil.getDriver();

        int count = 0;
        for (WebElement element: productsList) {
            js.executeScript("arguments[0].scrollIntoView(); window.scrollBy(0, -250);", element);
            if (element.getText().contains(pass)){
                element.click();
                break;
            }
            count++;
        }
        if (count == productsList.size()){
            System.out.println("Product: \"" + pass + "\" was not found.");
        }
    }
}
