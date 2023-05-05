package automation.baseTest;


import automation.pages.*;
import automation.base.DriverUtil;
import automation.pages.RalucaPage.BluzeSiHanoraceFetePage;
import automation.pages.RalucaPage.CostumeDeBaieFetePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class BaseTest {

    public BaseTest() {
        initPages(DriverUtil.getDriver());
    }

    protected HomePage homePage;
    protected BasePage basePage;

    protected LoginPage loginPage;

    protected AccesoriiPage accesoriiPage;

    protected ContactPage contactPage;

    protected CosDeCumparaturiPage cosDeCumparaturiPage;

    protected MagazinPage magazinPage;

    protected BluzeSiHanoraceFetePage bluzeSiHanoraceFetePage;

    protected CostumeDeBaieFetePage costumeDeBaieFetePage;


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
        bluzeSiHanoraceFetePage = new BluzeSiHanoraceFetePage();
        PageFactory.initElements(driver, bluzeSiHanoraceFetePage);
        costumeDeBaieFetePage = new CostumeDeBaieFetePage();
        PageFactory.initElements(driver, cosDeCumparaturiPage);

    }
}