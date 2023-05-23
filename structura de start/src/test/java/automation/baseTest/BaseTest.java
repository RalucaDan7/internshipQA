package automation.baseTest;


import automation.pages.*;
import automation.base.DriverUtil;
import automation.pages.Daniel.pages.RezultateRochiePage;
import automation.pages.Daniel.pages.SignInPage;
import automation.pages.LoginPage;
import automation.pages.TecsaPages.*;
import automation.pages.Daniel.pages.NoutatiPage;
import automation.pages.dianapages.NoutatiDianaPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import automation.pages.dianapages.ReduceriPage;
import automation.pages.RalucaPages.*;
import automation.pages.octavian_pages.BaietiCategoryPage;
import automation.pages.octavian_pages.CartPage;
import automation.pages.octavian_pages.ProductOctavianPage;
import automation.pages.octavian_pages.SearchPage;
import automation.pages.adriana_pages.*;



public class BaseTest {

    public BaseTest() {
        initPages(DriverUtil.getDriver());
    }

    protected HomePage homePage;
    protected ReduceriPage reduceriPage;
    protected NoutatiDianaPage noutatiDianaPage;
    protected BasePage basePage;

    protected LoginPage loginPage;

    protected FavoritePage favoritePage;
    protected NoutatiPage noutatiPage;

    protected RezultateRochiePage rezultateRochiePage;

    protected SignInPage signInPage;

    protected ForgotPasswordPage forgotPasswordPage;

    protected GirlsSectionPage girlsSectionPage;


    protected NewsPage newsPage;

    protected SearchPage searchPage;

    protected ProductTecsaPage productTecsaPage;
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

    protected RalucaCartPage ralucaCartPage;

    protected NoutatiFetePage noutatiFetePage;

    protected SearchTheProductPage rochieSunPowerFetePage;

    protected CoreUIReactPage coreUIReactPage;


    public void initPages(WebDriver driver) {

        homePage = new HomePage();
        PageFactory.initElements(driver, homePage);
        noutatiDianaPage = new NoutatiDianaPage();
        PageFactory.initElements(driver, noutatiDianaPage);
        rezultateRochiePage = new RezultateRochiePage();
        PageFactory.initElements(driver, rezultateRochiePage);
        signInPage = new SignInPage();
        PageFactory.initElements(driver, signInPage);
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
        productTecsaPage = new ProductTecsaPage();
        PageFactory.initElements(driver,productTecsaPage);
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
        ralucaCartPage = new RalucaCartPage();
        PageFactory.initElements(driver, ralucaCartPage);
        noutatiFetePage = new NoutatiFetePage();
        PageFactory.initElements(driver, noutatiFetePage);

        noutatiPage = new NoutatiPage();
        PageFactory.initElements(driver, noutatiPage);
        reduceriPage= new ReduceriPage();
        PageFactory.initElements(driver, reduceriPage);

        rochieSunPowerFetePage= new SearchTheProductPage();
        PageFactory.initElements(driver, rochieSunPowerFetePage);

        coreUIReactPage= new CoreUIReactPage();
        PageFactory.initElements(driver, coreUIReactPage);
    }
}