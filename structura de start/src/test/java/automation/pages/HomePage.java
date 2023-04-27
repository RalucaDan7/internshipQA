package automation.pages;

import automation.baseTest.BaseTest;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;


public class HomePage {

    @FindBy(css = "a[title=\"Contul meu\"]")
    private WebElement myAccountButton;

    @FindBy(xpath = "(//div[@title=\"Lista mea de dorințe\"])[1]")
    private WebElement favoritesLink;

    @FindBy(css = "a[title=\"Cos de cumparaturi\"]")
    private WebElement cosDeCumparaturiLink;


    public void checkFavoritesLinkIsVisible() {
        Assert.assertTrue("dashboard link is not visible ", favoritesLink.isDisplayed());
    }

    public void clickOnMyAccountButton() {
        myAccountButton.click();
    }

    public void clickOnCosDeCumparaturi() {
        cosDeCumparaturiLink.click();
    }

    @FindBy(css = "div[class=\"wd-opened\"]")
    private WebElement cosDeCumparaturiSidebar;

//    @FindBy(css = "body[class="home page-template-default page page-id-3228 theme-woodmart user-registration-page
//    woocommerce-js wrapper-full-width categories-accordion-on woodmart-ajax-shop-on offcanvas-sidebar-mobile
//   offcanvas-sidebar-tablet sticky-toolbar-on elementor-default elementor-kit-5 elementor-page elementor-page-3228 e--ua-blink e--ua-chrome e--ua-webkit"]")
//    private WebElement homePage;

    public void checkTheSidebarIsNotDisplayed() {
//        Assert.assertFalse("The cos de cumparaturi sidebar is displayed",
//               homePage.findElement(By.className("cart-widget-side wd-side-hidden wd-right wd-opened\"]")).isDisplayed());
//        Assert.assertEquals("The cos de cumparaturi sidebar is displayed and it should not be",
               homePage.getAttribute(""));
    }
}
