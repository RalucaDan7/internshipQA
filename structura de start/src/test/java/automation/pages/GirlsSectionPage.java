package automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GirlsSectionPage {

    @FindBy(css = "span[class=\"load-more-label\"]")
    private WebElement incarcaMaiMulteProduseButton;

    @FindBy(css = "img[class=\"attachment-woocommerce_thumbnail size-woocommerce_thumbnail wp-image-14193\"]")
    private WebElement pantaloniMudSandImage;

    public void clickOnIncarcaMaiMulteProduseButton(){incarcaMaiMulteProduseButton.click();}

    public void clickOnPantaloniMudSandImage(){pantaloniMudSandImage.click();}
}
