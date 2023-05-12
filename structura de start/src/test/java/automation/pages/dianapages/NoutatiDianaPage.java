package automation.pages.dianapages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class NoutatiDianaPage {


    @FindBy(xpath = "//h1[@class=\"entry-title title\"]")
    private WebElement noutatiTitle;
    @FindBy(css = "div[class=\"wd-pf-btn wd-col\"] button")
    private WebElement filtreazaButton;

  @FindBy(xpath = "//h1[@class=\"entry-title title\"]")
  private WebElement reduceriTitle;





    public void checkNoutatiTitle(String gica) {
        Assert.assertEquals("Nu apare noutati",gica, noutatiTitle.getText());
    }

    public void filtreazaButtonIsPresent() {
        Assert.assertEquals("NU apare filtreaza","FILTREAZA",  filtreazaButton.getText());
    }
}

