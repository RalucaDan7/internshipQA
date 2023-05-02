package automation.pages;

import automation.base.DriverUtil;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewsPage {

    @FindBy(xpath = "//*[@id=\"post-10889\"]/div/div/section/div/div/div/div[1]/div/form/div[2]/div[1]/span")
    private WebElement brandFilter;

    @FindBy(css ="a[data-title=\"CALVIN KLEIN JEANS\"]")
    private WebElement calvinKleinOption;

    @FindBy(css ="div[class=\"wd-pf-btn wd-col\"]")
    private WebElement filtreazaButton;


    public void checkPageIsDisplayed(String pageName, String url) {
        Assert.assertTrue("The URL of " + pageName + " is not correct", DriverUtil.getDriver().getCurrentUrl().contains(url));
    }

    public void clickOnBrandFilter(){
        brandFilter.click();
    }

    public void clickOnCalvinKleinJeansOption(){
        calvinKleinOption.click();
    }

    public void clickOnFiltreazaButton(){
        filtreazaButton.click();}
}
