package automation.steps.adriana_steps;

import automation.baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class SepciSteps extends BaseTest {
    @And("User clicks on the Prima pagina item")
    public void clickOnPrimaPaginaLink() {
        sepciPage.clickOnThePrimaPaginaLink();
    }

    @And("User clicks on Fete item")
    public void clickOnFeteLink() {
        sepciPage.clickOnTheFeteLink();

    }

    @And("User clicks on Marime dropdown button")
    public void clickOnMarimeFilterDropdwon() {
        sepciPage.clickOnTheMarimeButton();
    }

    @And("User choses the SM option from to dropdown list")
    public void selectSizeFromDropdownList() {
        sepciPage.clickOnMarimeFilter();
    }

    @And("The user clicks the Resetare filtre option")
    public void selectResetareFiltre() {
        sepciPage.clickOnResetareFiltre();
    }

    @Then("The filters are cleared")
    public void checkTheFiltersAreCleared() {
        sepciPage.checkIfTheFiltersAreCleared();
    }
    @And("User clicks on Sapca de baseball pentru copii product")
    public void clickOnSapcaDeBaseballItem() {
        sepciPage.clickOnSapcaDeBasebal();
    }
    @And("User clicks on Wishlist icon")
    public void clickOnWishlistButton(){
        sepciPage.clicksOnWishlistButton();
    }
    @And ("User navigates to Wishlist page to see added products")
    public void clickOnWishlistLink() {
        sepciPage.clicksOnWishListLink();
    }
}

