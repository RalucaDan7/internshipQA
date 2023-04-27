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

    protected SearchPage searchPage;

    protected ProductPage productPage;


    public void initPages(WebDriver driver) {

        homePage = new HomePage();
        PageFactory.initElements(driver, homePage);
        basePage = new BasePage();
        PageFactory.initElements(driver, basePage);
        loginPage = new LoginPage();
        PageFactory.initElements(driver, loginPage);
        searchPage = new SearchPage();
        PageFactory.initElements(driver, searchPage);
        productPage = new ProductPage();
        PageFactory.initElements(driver, productPage);
    }
}