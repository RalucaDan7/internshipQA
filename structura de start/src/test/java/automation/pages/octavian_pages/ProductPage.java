package automation.pages.octavian_pages;

import automation.common.WaitUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage {

    @FindBy(xpath = "//h1[@class=\"product_title entry-title wd-entities-title\"]")
    private WebElement productTitle;

    @FindBy(xpath = "//select[@id=\"pa_marime\"]")
    private WebElement sizeBox;

    @FindBy(xpath = "(//option[@class=\"attached enabled\"])[1]")
    private WebElement selectSizeDropdown;

    @FindBy(xpath = "//option[@class=\"attached enabled\"]")
    private List<WebElement> selectSizeDropdownList;

    @FindBy(xpath = "(//button[@type=\"submit\"])[2]")
    private WebElement addToCartButton;


    public void checkProperProductPageIsDisplayed(String pass) {
        Assert.assertTrue("The product page title does not contain the search string", productTitle.getText().toLowerCase().contains(pass.toLowerCase()));
    }

    public void selectFirstSize() {
        sizeBox.click();
        selectSizeDropdown.click();
    }

    public void addToCart() {
        addToCartButton.click();
    }

    public void selectSize(String pass) {
        sizeBox.click();
        int count = 0;
        for (WebElement element: selectSizeDropdownList) {
            count++;
            if (element.getText().contains(pass)){
                element.click();
                break;
            }
        }
        if (count == selectSizeDropdownList.size()){
            System.out.println("Desired size is not a valid option for product: \"" + productTitle.getText() + "\".");
        }
    }
}
