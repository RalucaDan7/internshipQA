package automation.pages.octavian_pages;

import automation.base.DriverUtil;
import org.openqa.selenium.By;
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
    private List<WebElement> productsTitleList;

    @FindBy(xpath = "//div[@class=\"product-element-bottom\"]")
    private List<WebElement> productsDivList;


    public void clickFirstProduct() {
        firstProductElement.click();
    }

    public void clickSecondProduct() {
        secondProductElement.click();
    }

    public void clickOnGivenProduct(String pass) {
        JavascriptExecutor js = (JavascriptExecutor) DriverUtil.getDriver();

        boolean exists = true;
        for (WebElement element: productsTitleList) {
            js.executeScript("arguments[0].scrollIntoView(); window.scrollBy(0, -250);", element);
            if (element.getText().contains(pass)){
                element.click();
                exists = false;
                break;
            }
        }
        if (exists){
            System.out.println("Product: \"" + pass + "\" was not found.");
        }
    }

    public void checkPrice(String pass) {

        for (WebElement element : productsDivList){
            if (element.getText().contains(pass)){
                System.out.println("Price of: \"" + pass + "\" is: " + element.findElement(By.xpath(".//span[@class='price']")).getText());
//                System.out.println(element.findElement(By.xpath(".//span[@class='woocommerce-Price-amount amount']")).getText());
            }
//            System.out.println(element.findElement(By.xpath(".//span[@class='price']")).getText());
        }
    }
}
