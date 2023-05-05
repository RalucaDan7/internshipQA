package automation.pages.TecsaPages;

import automation.base.DriverUtil;
import automation.baseTest.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FavoritePage {
    @FindBy(xpath = "(//h1[@class=\"entry-title title\"])[1]")
    private WebElement favoriteTitle;

    @FindBy(css = "a[property=\"v:title\"]")
    private WebElement acasaButton;

    @FindBy(css = "h3[class=\"wd-entities-title\"]")
    private WebElement pantaloniMudSandPentruFeteProduct;

    @FindBy(xpath = "//h3[@class=\"wd-entities-title\"]")
    private List<WebElement> productsList;

    public void checkTitleListadeDorinte() {
        Assert.assertTrue("Title Lista de Dorinte is not displayed", favoriteTitle.isDisplayed());
    }

    public void clickOnAcasabutton(){
        acasaButton.click();
    }

    public void checkTitlePantaloniMudSandPentruFete(String title){
        Assert.assertTrue("Pantaloni Mud Sand product is not displayed", pantaloniMudSandPentruFeteProduct.isDisplayed());
        Assert.assertTrue("Pantaloni Mud Sand product is not displayed", pantaloniMudSandPentruFeteProduct.getText().equals(title));
    }

    public void checkItemsInFavoriteList(List<String> data){
        for (int i=0;i<productsList.size();i++){
            System.out.println(productsList.get(i).getText());
            System.out.println("blabla"+i);
            System.out.println("Produs"+i+" = "+data.get(i));
            Assert.assertTrue("Name of product is not correct", productsList.get(i).getText().equals(data.get(i)));

        }

    }


    }
