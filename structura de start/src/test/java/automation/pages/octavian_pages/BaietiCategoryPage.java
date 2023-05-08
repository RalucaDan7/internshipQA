package automation.pages.octavian_pages;

import automation.base.DriverUtil;
import automation.common.WaitUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
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

    @FindBy(xpath = "//span[@class=\"load-more-label\"]")
    private WebElement loadMoreButton;


    public void clickFirstProduct() {
        firstProductElement.click();
    }

    public void clickSecondProduct() {
        secondProductElement.click();
    }

    public void clickOnGivenProduct(String pass) {
        JavascriptExecutor js = (JavascriptExecutor) DriverUtil.getDriver();

        boolean exists = false;
        for (WebElement element: productsTitleList) {
            js.executeScript("arguments[0].scrollIntoView(); window.scrollBy(0, -250);", element);
            if (element.getText().contains(pass)){
                element.click();
                exists = true;
                break;
            }
        }
        if (!exists){
            System.out.println("Product: \"" + pass + "\" was not found.");
        }
    }

    public void checkPrice(String pass) {
        for (WebElement element : productsDivList){
            if (element.getText().contains(pass)){
                System.out.println("\nPrice of \"" + pass + "\" is: " + element.findElement(By.xpath(".//span[@class='price']")).getText());
            }
        }
    }

    public void checkPriceLoadMore(String pass) {
        JavascriptExecutor js = (JavascriptExecutor) DriverUtil.getDriver();

        boolean exists = false;
        for (WebElement element : productsDivList) {
            if (element.getText().contains(pass)) {
                System.out.println("\nPrice of \"" + pass + "\" is: " + element.findElement(By.xpath(".//span[@class='price']")).getText());
                exists = true;
                break;
            }
        }
        if (!exists) {
            try {
                if (loadMoreButton.isDisplayed()) {
                    js.executeScript("arguments[0].scrollIntoView(); window.scrollBy(0, -250);", loadMoreButton);
                    loadMoreButton.click();

                    WebElement productToBeDisplayed = DriverUtil.getDriver().findElement(By.xpath("(//h3[@class='wd-entities-title'])[" + (productsDivList.size() + 1 + "]")));
                    WaitUtils.waitForVisibilityOfElement(DriverUtil.getDriver(), productToBeDisplayed);
                    productsDivList = DriverUtil.getDriver().findElements(By.xpath("//div[@class='product-element-bottom']"));
                    for (WebElement element : productsDivList) {
                        if (element.getText().contains(pass)) {
                            System.out.println("\nPrice of \"" + pass + "\" is: " + element.findElement(By.xpath(".//span[@class='price']")).getText());
                            exists = true;
                            break;
                        }
                    }
                    if (!exists) {
                        checkPriceLoadMore(pass);
                    }
                }
            } catch (NoSuchElementException e) {
                System.out.println("\nProduct \"" + pass + "\" was not found.");
            }
        }
    }
}
