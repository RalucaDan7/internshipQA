package automation.baseTest;


import automation.pages.*;
import automation.base.DriverUtil;
import automation.pages.adriana_pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class BaseTest {

    public BaseTest() {
        initPages(DriverUtil.getDriver());
    }

    protected HomePage homePage;
    protected BasePage basePage;

    protected LoginPage loginPage;

    protected SearchPage searchPage;

    protected ProductPage productPage;

    protected CategoryPage categoryPage;

    protected CartPage cartPage;

    protected AccesoriiPage accesoriiPage;

    protected ContactPage contactPage;

    protected CosDeCumparaturiPage cosDeCumparaturiPage;

    protected MagazinPage magazinPage;
    protected SepciPage sepciPage;
    protected ProductFetePage productFetePage;

    protected WishlistPage wishlistPage;

    public void initPages(WebDriver driver) {

        homePage = new HomePage();
        PageFactory.initElements(driver, homePage);
        basePage = new BasePage();
        PageFactory.initElements(driver, basePage);
        loginPage = new LoginPage();
        PageFactory.initElements(driver, loginPage);
        accesoriiPage = new AccesoriiPage();
        PageFactory.initElements(driver, accesoriiPage);
        contactPage = new ContactPage();
        PageFactory.initElements(driver, contactPage);
        cosDeCumparaturiPage = new CosDeCumparaturiPage();
        PageFactory.initElements(driver, cosDeCumparaturiPage);
        magazinPage = new MagazinPage();
        PageFactory.initElements(driver, magazinPage);
        searchPage = new SearchPage();
        PageFactory.initElements(driver, searchPage);
        productPage = new ProductPage();
        PageFactory.initElements(driver, productPage);
        categoryPage = new CategoryPage();
        PageFactory.initElements(driver, categoryPage);
        cartPage = new CartPage();
        PageFactory.initElements(driver, cartPage);
        sepciPage= new SepciPage();
        PageFactory.initElements(driver, sepciPage);
        productFetePage= new ProductFetePage();
        PageFactory.initElements(driver, productFetePage);
        wishlistPage = new WishlistPage();
        PageFactory.initElements(driver, wishlistPage);
    }
}