package automation.steps.hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import automation.base.ConfigManager;
import automation.base.DriverUtil;
import automation.base.WebDriverUtil;


public class Hook {

    @Before("@UI")
    public void InitializeTest(Scenario scenario){

        String scenarioId = scenario.getId();
        String featureFileName = scenarioId.split(";")[0];

        WebDriverUtil WebDriverUtil = new WebDriverUtil();
        WebDriverUtil.initWebDriver(scenario);

        System.out.println("Starting Scenario UI: " + scenario.getName());
        System.out.println("Execution: " + ConfigManager.getExecution());
        System.out.println("Platform: " + ConfigManager.getPlatform());
        System.out.println("Browser_ver: " + ConfigManager.getBrowser().toUpperCase() + "_ver" + DriverUtil.getRunningBrowserVersion());
        System.out.println("featureFileName: " + featureFileName);
    }



    @After
    public void TearDownTest(Scenario scenario) {

        if (scenario.isFailed()) {
            System.out.println("Failed scenario: " + scenario.getName());
        }

        DriverUtil.closeDriver(DriverUtil.getDriver());
    }
}