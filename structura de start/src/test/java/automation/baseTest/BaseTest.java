package automation.baseTest;


import automation.pages.*;
import automation.base.DriverUtil;
import automation.pages.dianapages.NoutatiPage;
import automation.pages.dianapages.ReduceriPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class BaseTest {

    public BaseTest() {
        initPages(DriverUtil.getDriver());
    }

    protected HomePage homePage;
    protected ReduceriPage reduceriPage;
    protected NoutatiPage noutatiPage;
    protected BasePage basePage;

    protected LoginPage loginPage;

    protected AccesoriiPage accesoriiPage;

    protected ContactPage contactPage;

    protected CosDeCumparaturiPage cosDeCumparaturiPage;

    protected MagazinPage magazinPage;


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
        noutatiPage = new NoutatiPage();
        PageFactory.initElements(driver, noutatiPage);
        reduceriPage= new ReduceriPage();
        PageFactory.initElements(driver, reduceriPage);

    }
}