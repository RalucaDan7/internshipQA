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

    protected AccesoriiPage accesoriiPage;

    protected ContactPage  contactPage;

//    protected AccesoriiDropdPage accesoriiDropdPage;

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
//        accesoriiDropdPage = new AccesoriiDropdPage();
//        PageFactory.initElements(driver, accesoriiDropdPage);
    }
}