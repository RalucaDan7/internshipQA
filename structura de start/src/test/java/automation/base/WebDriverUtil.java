package automation.base;

import cucumber.api.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class WebDriverUtil extends DriverUtil {

    public WebDriver initWebDriver(Scenario scenario)  {
        MutableCapabilities options = setupMutableCapabilities(scenario, getBuildNumber());
        switch (ConfigManager.getBrowser().toLowerCase()) {
            case "chrome":
                switch (ConfigManager.getExecution().toLowerCase()) {
                    case "jenkins":
                        break;
                    case "local":
                        System.setProperty("webdriver.chrome.silentOutput", "true");
                        WebDriverManager.chromedriver().setup();
                        tlDriver.set(new ChromeDriver((ChromeOptions) options));
                        break;
                    default: {
                        System.out.println("No info for driver.");
                        break;
                    }
                }
                break;
            case "safari":
                WebDriverManager.safaridriver().setup();
                tlDriver.set(new SafariDriver((SafariOptions) options));
                break;
            default:
                WebDriverManager.firefoxdriver().setup();
                tlDriver.set(new FirefoxDriver((FirefoxOptions) options));
                break;
           }
            tlDriver.get().manage().timeouts().setScriptTimeout(ConfigManager.DEFAULT_WAIT, TimeUnit.SECONDS);
            tlDriver.get().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            tlDriver.get().manage().window().maximize();
            return tlDriver.get();
    }

    private MutableCapabilities setupMutableCapabilities(Scenario scenario, String buildnr) {
        MutableCapabilities options;
        ChromeOptions optionsChrome = new ChromeOptions();

        Map<String, Object> prefs = new HashMap<>();
        Map<String, Object> profile = new HashMap<>();

        prefs.put("profile", profile);
        optionsChrome.setExperimentalOption("prefs", prefs);

        optionsChrome.setCapability(ChromeOptions.CAPABILITY, optionsChrome);
        options = setWebDriverOptions(optionsChrome, scenario, buildnr);   //set the aws_proxy_muc
        return options;
    }

    private MutableCapabilities setWebDriverOptions(MutableCapabilities options, Scenario scenario, String buildnr) {
        options.setCapability("takesScreenshot", true);
        options.setCapability("browserName", ConfigManager.getBrowser());
        options.setCapability("build", "Build-" + buildnr);
        options.setCapability("acceptSslCerts", true);
        return options;
    }
}