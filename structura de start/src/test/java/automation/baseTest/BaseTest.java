package automation.baseTest;


import automation.pages.*;
import automation.base.DriverUtil;
import automation.pages.RalucaPages.*;
import automation.pages.octavian_pages.BaietiCategoryPage;
import automation.pages.octavian_pages.CartPage;
import automation.pages.octavian_pages.ProductPage;
import automation.pages.octavian_pages.SearchPage;
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

    protected BaietiCategoryPage baietiCategoryPage;

    protected CartPage cartPage;

    protected AccesoriiPage accesoriiPage;

    protected ContactPage contactPage;

    protected CosDeCumparaturiPage cosDeCumparaturiPage;

    protected MagazinPage magazinPage;
    protected SepciPage sepciPage;
    protected ProductFetePage productFetePage;

    protected WishlistPage wishlistPage;
    protected BluzeSiHanoraceFetePage bluzeSiHanoraceFetePage;

    protected CostumeDeBaieFetePage costumeDeBaieFetePage;

    protected CartPageRaluca cartPageRaluca;


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
        baietiCategoryPage = new BaietiCategoryPage();
        PageFactory.initElements(driver, baietiCategoryPage);
        cartPage = new CartPage();
        PageFactory.initElements(driver, cartPage);
        sepciPage= new SepciPage();
        PageFactory.initElements(driver, sepciPage);
        productFetePage= new ProductFetePage();
        PageFactory.initElements(driver, productFetePage);
        wishlistPage = new WishlistPage();
        PageFactory.initElements(driver, wishlistPage);
        bluzeSiHanoraceFetePage = new BluzeSiHanoraceFetePage();
        PageFactory.initElements(driver, bluzeSiHanoraceFetePage);
        costumeDeBaieFetePage = new CostumeDeBaieFetePage();
        PageFactory.initElements(driver, cosDeCumparaturiPage);
        cartPageRaluca = new CartPageRaluca();
        PageFactory.initElements(driver, cartPageRaluca);

    }
}