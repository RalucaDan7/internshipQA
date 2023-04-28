

package automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccesoriiPage {

    @FindBy(xpath ="(//a[@class=\"woodmart-nav-link\"])[20]")
    private WebElement accesoriiLink;
    @FindBy(xpath ="(//h1[@class=\"entry-title title\"])")
    private WebElement accesoriiTitle;


    @FindBy(css = "a[class=\"woodmart-nav-link\"):nth-child(21)")
    private WebElement caciuliTitle;

    @FindBy(css = "a[class=\"woodmart-nav-link\"):nth-child(22)")
    private WebElement gentiRucsacuriTitle;

    @FindBy(css = "a[class=\"woodmart-nav-link\"):nth-child(23)")
    private WebElement manusiTitle;



    public void checkAccesoriiTitle(String nume)
    {
        Assert.assertEquals("The title from Accesorii page  is not correct ", nume, accesoriiTitle.getText());
    }



    public  void checkAccesoriiElements(String data) {
       Assert.assertTrue("The URL of " + pageName + " is not correct", DriverUtil.getDriver().getCurrentUrl().contains(url));
        System.out.println(data);
    }
}

