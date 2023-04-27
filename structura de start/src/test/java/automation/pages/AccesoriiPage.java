

package automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccesoriiPage {

    @FindBy(xpath ="(//a[@class=\"woodmart-nav-link\"])[20]")
    private WebElement accesoriiLink;
    @FindBy(xpath ="(//h1[@class=\"entry-title title\"])")
    private WebElement accesoriiTitle;


    public void checkAccesoriiTitle(String nume)
    {
        Assert.assertEquals("The title from Accesorii page  is not correct ", nume, accesoriiTitle.getText());
    }




}

