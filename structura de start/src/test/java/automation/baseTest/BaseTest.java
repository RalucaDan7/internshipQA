package automation.baseTest;


import automation.pages.BasePage;
import automation.pages.Daniel.pages.RezultateRochiePage;
import automation.pages.Daniel.pages.SignInPage;
import automation.pages.HomePage;
import automation.base.DriverUtil;
import automation.pages.LoginPage;
import automation.pages.Daniel.pages.NoutatiPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class BaseTest {

    public BaseTest() {
        initPages(DriverUtil.getDriver());
    }

    protected HomePage homePage;
    protected BasePage basePage;

    protected LoginPage loginPage;

    protected NoutatiPage noutatiPage;

    protected RezultateRochiePage rezultateRochiePage;

    protected SignInPage signInPage;

    public void initPages(WebDriver driver) {

        homePage = new HomePage();
        PageFactory.initElements(driver, homePage);
        basePage = new BasePage();
        PageFactory.initElements(driver, basePage);
        loginPage = new LoginPage();
        PageFactory.initElements(driver, loginPage);
        noutatiPage = new NoutatiPage();
        PageFactory.initElements(driver, noutatiPage);
        rezultateRochiePage = new RezultateRochiePage();
        PageFactory.initElements(driver, rezultateRochiePage);
        signInPage = new SignInPage();
        PageFactory.initElements(driver, signInPage);
    }
}