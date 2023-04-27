package automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage {

        @FindBy(xpath ="(//h1[@class='entry-title title'])")
        private WebElement ContactTitle;


        public void checkContactTitle(String nume)
        {
            Assert.assertEquals("The title of the page is not correct ", nume, ContactTitle.getText());
        }




    }



