package automation.steps.TecsaSteps;

import automation.baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class ProductSteps extends BaseTest {

    @And("Click on Heart button from product page")
    public void clickOnHeartButton() {
        productPage.clickOnHeartButton();
    }

    @Then("Check Heart Button is changed")
    public void checkHeartButton(){
        productPage.checkHeartButton();
    }



    @And("Select 152 option from measure dropdown")
    public void select152Option(){productPage.select152Option();}

    @And("Click on Adauga in Cos Button")
    public void clickOnAdaugaInCosButton(){productPage.clickOnAdaugaInCosButton();}

    @And("Click on Inchide Button from product popup")
    public void clickOnInchdeButton(){productPage.clickOnInchideButton();}

    @And("Click on Amount Button from product page")
    public void clickOnAmountButton(){productPage.clickOnAmountButton();}

    @And("Click on Vezi Cosul button from product popup")
    public void clickOnVeziCosulBUtton(){productPage.clickOnVeziCosulButton();}



}

