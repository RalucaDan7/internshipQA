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

    }
}