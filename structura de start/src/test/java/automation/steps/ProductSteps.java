package automation.steps;

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

    @And("Click on Selecteaza o marime filter from product page")
    public void clickOnSelecteazaOMarimeFilter(){productPage.clickOnSelecteazaOMarimeFilter();}

    @And("Click on 152 option from dropdown")
    public void clickOn152Option(){productPage.clickOn152Option();}

    @And("Click on Adauga in Cos Button")
    public void clickOnAdaugaInCosButton(){productPage.clickOnAdaugaInCosButton();}



}

