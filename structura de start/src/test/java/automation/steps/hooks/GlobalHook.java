package automation.steps.hooks;

import cucumber.api.java.Before;

public class GlobalHook {

    private static boolean dunit = false;

    @Before("@UI")
    public void beforeAll() {
        System.out.println("global hook executed.");
        }
}
