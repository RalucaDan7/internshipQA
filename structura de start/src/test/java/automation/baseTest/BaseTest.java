package automation.baseTest;


import automation.pages.*;
import automation.base.DriverUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


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

    protected MagazinePage magazinePage;


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

    }
}