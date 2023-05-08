package automation.baseTest;


import automation.pages.*;
import automation.base.DriverUtil;
import automation.pages.TecsaPages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import automation.pages.octavian_pages.BaietiCategoryPage;
import automation.pages.octavian_pages.CartPage;
import automation.pages.octavian_pages.ProductOctavianPage;
import automation.pages.octavian_pages.SearchPage;
import automation.pages.adriana_pages.*;
import automation.pages.RalucaPage.BluzeSiHanoraceFetePage;
import automation.pages.RalucaPage.CostumeDeBaieFetePage;


public class BaseTest {

    public BaseTest() {
        initPages(DriverUtil.getDriver());
    }

    protected HomePage homePage;
    protected BasePage basePage;

    protected LoginPage loginPage;

    protected FavoritePage favoritePage;

    protected ForgotPasswordPage forgotPasswordPage;

    protected GirlsSectionPage girlsSectionPage;

    protected ProductPage productPage;

    protected NewsPage newsPage;

    protected SearchPage searchPage;

    protected ProductOctavianPage productOctavianPage;

    protected BaietiCategoryPage baietiCategoryPage;

    protected CartPage cartPage;


    protected MagazinePage magazinePage;

    protected AccesoriiPage accesoriiPage;

    protected ContactPage contactPage;

    protected CosDeCumparaturiPage cosDeCumparaturiPage;

    protected MagazinPage magazinPage;

    protected BasketPage basketPage;

    protected SepciPage sepciPage;
    protected ProductFetePage productFetePage;

    protected WishlistPage wishlistPage;
    protected BluzeSiHanoraceFetePage bluzeSiHanoraceFetePage;

    protected CostumeDeBaieFetePage costumeDeBaieFetePage;



    public void initPages(WebDriver driver) {

        homePage = new HomePage();
        PageFactory.initElements(driver, homePage);
        basePage = new BasePage();
        PageFactory.initElements(driver, basePage);
        loginPage = new LoginPage();
        PageFactory.initElements(driver, loginPage);
        favoritePage = new FavoritePage();
        PageFactory.initElements(driver, favoritePage);
        forgotPasswordPage = new ForgotPasswordPage();
        PageFactory.initElements(driver, forgotPasswordPage);
        girlsSectionPage = new GirlsSectionPage();
        PageFactory.initElements(driver, girlsSectionPage);
        productPage = new ProductPage();
        PageFactory.initElements(driver,productPage);
        newsPage = new NewsPage();
        PageFactory.initElements(driver,newsPage);
        magazinePage = new MagazinePage();
        PageFactory.initElements(driver,magazinePage);
        accesoriiPage = new AccesoriiPage();
        PageFactory.initElements(driver, accesoriiPage);
        contactPage = new ContactPage();
        PageFactory.initElements(driver, contactPage);
        cosDeCumparaturiPage = new CosDeCumparaturiPage();
        PageFactory.initElements(driver, cosDeCumparaturiPage);
        magazinPage = new MagazinPage();
        PageFactory.initElements(driver, magazinPage);
        basketPage = new BasketPage();
        PageFactory.initElements(driver, basketPage);
        searchPage = new SearchPage();
        PageFactory.initElements(driver, searchPage);
        productOctavianPage = new ProductOctavianPage();
        PageFactory.initElements(driver, productOctavianPage);
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

    }
}