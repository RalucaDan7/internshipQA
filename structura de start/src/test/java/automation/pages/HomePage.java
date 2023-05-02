package automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(css = "a[title=\"Contul meu\"]")
    private WebElement myAccountButton;

    @FindBy(xpath = "(//div[@title=\"Lista mea de dorințe\"])[1]")
    private WebElement favoritesLink;

    @FindBy(xpath = "(//input[@title=\"Cauta produse\"])[1]")
    private WebElement searchBox;

    @FindBy(xpath = "(//button[@type=\"submit\"])[1]")
    private WebElement searchButton;

    @FindBy(css = "input[title=\"Cauta produse\"]:nth-of-type(1)")
    private WebElement searchBoxCSS;

    @FindBy(css = "button[class=\"searchsubmit\"]:nth-of-type(1)")
    private WebElement searchButtonCSS;

    @FindBy(xpath = "//div[@class=\"wd-dropdown-results wd-scroll wd-dropdown wd-opened\"]")
    private WebElement suggestionBox;

    @FindBy(xpath = "//h4[@class=\"wd-entities-title\"]")
    private WebElement suggestionsDropdown;

    @FindBy(xpath = "(//div[@class=\"wrapper-content-banner wd-fill wd-items-bottom wd-justify-center\"])[2]")
    private WebElement baietiCategoryButton;



    public void checkFavoritesLinkIsVisible() {
        Assert.assertTrue("dashboard link is not visible ", favoritesLink.isDisplayed());
    }

    public void clickOnMyAccountButton(){
        myAccountButton.click();
    }

    public void insertKeywordInSearchBox(String pass) {
        searchBox.sendKeys(pass);
    }

    public void clickSearch(){
        searchButton.click();
    }

    public void insertKeywordInSearchBoxCSS(String pass) {
        searchBoxCSS.sendKeys(pass);
    }

    public void clickSearchCSS(){
        searchButtonCSS.click();
    }

    public void checkSugestionBoxIsDisplayed() {
        Assert.assertTrue("suggestion box is not displayed", suggestionBox.isDisplayed());
    }

    public void checkSearchSuggestionIsCorrect(String pass) {
        Assert.assertTrue("Search suggestion doesn't show products related to \"" + pass + "\"", suggestionsDropdown.getText().toLowerCase().contains(pass.toLowerCase()));
    }

    public void clickSuggestion() {
        suggestionsDropdown.click();
    }

    public void clickBaietiCategory() {
        baietiCategoryButton.click();
    }
}
