package automation.steps;

import automation.baseTest.BaseTest;
import cucumber.api.java.en.And;

public class MagazineSteps extends BaseTest {

    @And("Click on Pulover din bumbac pentru copii item from magazine page")
    public void clickOnPuloverDinBumbacPentruCopiiItem(){
        magazinePage.clickOnPuloverDinBumbacPentruCopiiItem();
    }
}
