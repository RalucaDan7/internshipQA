package automation.pages.TecsaPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MagazinePage {

    @FindBy(css ="img[class=\"attachment-woocommerce_thumbnail size-woocommerce_thumbnail wp-image-13768\"]")
    private WebElement puloverDinBumbacPentruCopiiCK;

    public void clickOnPuloverDinBumbacPentruCopiiItem(){
        puloverDinBumbacPentruCopiiCK.click();
    }
}
