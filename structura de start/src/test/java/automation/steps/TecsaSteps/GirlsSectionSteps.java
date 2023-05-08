package automation.steps.TecsaSteps;

import automation.baseTest.BaseTest;
import cucumber.api.java.en.And;

public class GirlsSectionSteps extends BaseTest {

    @And("Click on Incarca mai multe produse button from girls section")
    public void clickOnIncarcaMaiMulteProduseButton(){
        girlsSectionPage.clickOnIncarcaMaiMulteProduseButton();
    }

    @And("Click on Pantaloni Mud Sand image from girls section")
    public void clickOnPantaloniMudSandImage(){
        girlsSectionPage.clickOnPantaloniMudSandImage();
    }

}
