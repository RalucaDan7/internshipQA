package automation.pages.TecsaPages;

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

    @FindBy(css = "img[data-src=\"https://qa-training.co.in/wp-content/uploads/2023/03/IB0IB010920LJ_1-300x300.jpg\"]")
    private WebElement secondProduct;

    @FindBy(css = "img[data-src=\"https://qa-training.co.in/wp-content/uploads/2023/02/46335-00-0941Backe-commerce.jpg\"]")
    private WebElement firstProduct;


    public void checkPageIsDisplayed(String url) {
        Assert.assertTrue("The URL of Noutati-fete page is not correct", DriverUtil.getDriver().getCurrentUrl().contains(url));
    }

    public void clickOnBrandFilter(){
        brandFilter.click();
    }

    public void selectCalvinKleinJeansOption(){
        calvinKleinOption.click();
    }

    public void clickOnFiltreazaButton(){
        filtreazaButton.click();}

    public void clickOnSecondProduct(){
        secondProduct.click();
    }

    public void clickFirstProduct(){
        firstProduct.click();
    }


}
