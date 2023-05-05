package automation.steps.adriana_steps;

import automation.baseTest.BaseTest;
import cucumber.api.java.en.Then;

public class WishlistSteps extends BaseTest {
    @Then("A page with the entry title {string} is displayed")
    public void checkWishlistPageIsDisplayed(String name) {
        wishlistPage.checkWishlistName(name);
    }
    @Then("The Wishlist contains {string} product")
    public void checkSapcaBaseballIsDisplayed(String name) {
        wishlistPage.checkIfSapcaBaseballIsDisplayed(name);
    }
}

