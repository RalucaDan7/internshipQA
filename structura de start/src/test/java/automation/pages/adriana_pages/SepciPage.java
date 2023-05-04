package automation.pages.adriana_pages;


import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SepciPage {
    @FindBy(css = "nav>a[class=\"breadcrumb-link\"]:nth-child(1)")
    private WebElement primaPaginaLink;

    @FindBy(css = "nav>a[class=\"breadcrumb-link\"]:nth-child(2)")
    private WebElement feteLink;

    @FindBy(css = "div[class=\"wd-pf-checkboxes wd-pf-attributes wd-col wd-event-click\"]")
    private WebElement marimeDropdown;

    @FindBy(xpath = ("//span[@class='wd-filter-lable layer-term-lable']"))
    private WebElement marimeFilter;

    @FindBy(xpath = ("//div[@class=\"wd-clear-filters wd-action-btn wd-style-text wd-cross-icon\"]"))
    private WebElement resetareFiltreLink;

    @FindBy(css = "a>img[class=\"attachment-woocommerce_thumbnail size-woocommerce_thumbnail wp-image-13940\"]")
    private WebElement sepciProductLink;

    @FindBy(xpath = ("//div[@class='wd-wishlist-btn wd-action-btn wd-style-text wd-wishlist-icon']//a"))
    private WebElement wishlistButton;

    public void clickOnThePrimaPaginaLink() {
        primaPaginaLink.click();
    }

    public void clickOnTheFeteLink() {
        feteLink.click();
    }

    public void clickOnTheMarimeButton() {
        marimeDropdown.click();
    }

    public void clickOnMarimeFilter() {
        marimeFilter.click();
    }

    public void clickOnResetareFiltre() {
        resetareFiltreLink.click();
    }

    public void checkIfTheFiltersAreCleared() {
        Assert.assertFalse("Filter element was not cleared", resetareFiltreLink.isSelected());

    }
    public void clickOnSapcaDeBasebal(){
        sepciProductLink.click();
    }
    public void clicksOnWishlistButton(){

        wishlistButton.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
