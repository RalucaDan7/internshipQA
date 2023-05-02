package automation.steps;

import automation.baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en_scouse.An;

public class CartSteps extends BaseTest {

    @And("The user clicks on Vezi cosul")
    public void goToCart(){
        cartPage.goToCart();
    }

    @And("The user decrements product quantity and clicks on Actualizeaza cosul")
    public void decrementProductQuantity(){
        cartPage.decrementProductQuantity();
    }

    @Then("Cart is empty")
    public void cartEmpty(){
        cartPage.cartEmpty();
    }

    @And("The user increments product quantity and clicks on Actualizeaza cosul")
    public void incrementProductQuantity(){
        cartPage.incrementProductQuantity();
    }

    @Then("Product quantity is {string}")
    public void checkProductQuantity(String pass){

        cartPage.checkProductQuantity(pass);
    }
}
