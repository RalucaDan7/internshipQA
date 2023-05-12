package automation.steps.TecsaSteps;

import automation.baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class ProductTecsaSteps extends BaseTest {

    @And("Click on Heart button from product page")
    public void clickOnHeartButton() {
        productTecsaPage.clickOnHeartButton();
    }

    @Then("Check Heart Button is changed")
    public void checkHeartButton(){
        productTecsaPage.checkHeartButton();
    }



    @And("Select 152 option from measure dropdown")
    public void select152Option(){productTecsaPage.select152Option();}

    @And("Click on Adauga in Cos Button")
    public void clickOnAdaugaInCosButton(){productTecsaPage.clickOnAdaugaInCosButton();}

    @And("Click on Inchide Button from product popup")
    public void clickOnInchdeButton(){productTecsaPage.clickOnInchideButton();}

    @And("Click on Amount Button from product page")
    public void clickOnAmountButton(){productTecsaPage.clickOnAmountButton();}

    @And("Click on Vezi Cosul button from product popup")
    public void clickOnVeziCosulBUtton(){productTecsaPage.clickOnVeziCosulButton();}



}

