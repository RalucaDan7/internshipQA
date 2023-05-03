package automation.steps.octavian_steps;

import automation.baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en_scouse.An;
import io.cucumber.datatable.DataTable;

import java.util.List;

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

    @Then("The following products should be in the cart")
    public void checkProductsInCart(DataTable dataTable){
        List<String> data = dataTable.asList(String.class);
        cartPage.checkProductsInCart(data);
    }

    @Then("The following products should be in the cart by looping list of WebElements")
    public void checkProductsInCartByLoopingWebElements(DataTable dataTable){
        List<String> data = dataTable.asList(String.class);
        cartPage.checkProductsInCartByLoopingWebElements(data);
    }
}
