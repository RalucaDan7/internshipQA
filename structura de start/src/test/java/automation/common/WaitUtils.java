package automation.common;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import automation.base.DriverUtil;

import java.time.Duration;
import java.util.List;

import static java.lang.Thread.sleep;

public class WaitUtils {

    public static void waitForPageToLoad() {
        ExpectedCondition<Boolean> expectation = driver -> {
            assert driver != null;
            return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
        };
        try {
            sleep(1000);
            WebDriverWait wait = new WebDriverWait(DriverUtil.getDriver(), 30);
            wait.until(expectation);
        } catch (Throwable error) {
            Assert.fail("Timeout waiting for Page Load Request to complete.");
        }
    }
}
