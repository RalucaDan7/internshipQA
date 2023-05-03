package automation.pages.adriana_pages;


import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.List;
public class SepciPage {
    @FindBy (css= "nav>a[class=\"breadcrumb-link\"]:nth-child(1)")
    private WebElement primaPaginaLink;
    public void clickOnThePrimaPaginaLink(){
        primaPaginaLink.click();
    }

    @FindBy (css= "nav>a[class=\"breadcrumb-link\"]:nth-child(2)")
    private WebElement feteLink;
    public void clickOnTheFeteLink() {
        feteLink.click();
    }

}
