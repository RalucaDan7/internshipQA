

package automation.pages.adriana_pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class AccesoriiPage {


    @FindBy(xpath = "(//h1[@class=\"entry-title title\"])")
    private WebElement accesoriiEntryTitle;

    @FindBy(xpath = "(//a[@class=\"woodmart-nav-link\"])[21]")
    private WebElement caciuliEntryTitle;

    @FindBy(xpath = "(//a[@class=\"woodmart-nav-link\"])[22]")
    private WebElement gentiRucsacuriEntryTitle;

    @FindBy(xpath = "(//a[@class=\"woodmart-nav-link\"])[23]")
    private WebElement manusiTitle;


    @FindBy(css = "h1[class='entry-title title']")
    private WebElement SepciPageTitle;


    public void checkAccesoriiTitle(String nume) {
        Assert.assertEquals("The title from Accesorii page  is not correct ", nume, accesoriiEntryTitle.getText());
    }


    public void checkAccesoriiElements(String menuElement) {


        List<String> elementAccesorii = new ArrayList<>();

        elementAccesorii.add(caciuliEntryTitle.getText());
        elementAccesorii.add(gentiRucsacuriEntryTitle.getText());
        elementAccesorii.add(manusiTitle.getText());


        Assert.assertTrue("The menu element " + menuElement + " was not found in accesorii dropdown menu", elementAccesorii.contains(menuElement));

    }

    public void checkDropdownItemTitle(String nume) {
        Assert.assertEquals("The title from Sepci si palarii items page  is not correct ", nume, SepciPageTitle.getText());
    }
}

