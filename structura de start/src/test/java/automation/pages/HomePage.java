package automation.pages;

import org.aspectj.bridge.IMessage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.w3c.dom.html.HTMLInputElement;

public class HomePage {

    @FindBy(css = "a[title=\"Contul meu\"]")
    private WebElement myAccountButton;

    @FindBy(xpath = "(//div[@title=\"Lista mea de dorințe\"])[1]")
    private WebElement favoritesLink;

    @FindBy(xpath = "//*[@id=\"post-3228\"]/div/div/section[4]/div/div/div/div/div/div/div/h2")
    private WebElement exploreazaCategoriiTitle;

    @FindBy(css = "a[href=\"https://qa-training.co.in/contul-meu/lost-password/\"]")
    private WebElement forgotPasswordLink;


    public void checkFavoritesLinkIsVisible() {
        Assert.assertTrue("dashboard link is not visible ", favoritesLink.isDisplayed());
    }

    public void clickOnMyAccountButton() {
        myAccountButton.click();
    }

    public void clickOnFavoriteButton() {

        favoritesLink.click();
    }

    public void checkTitleExploreazacategorii(String title,String bogdan, String ionut) {
        Assert.assertTrue("Exploreaza categorii title is not visible ", exploreazaCategoriiTitle.isDisplayed());
        Assert.assertTrue("Exploreaza categorii title is not visible ", exploreazaCategoriiTitle.getText().equals(title));
    }
    public void clickOnForgotPasswordLink(){
        forgotPasswordLink.click();
    }
}
