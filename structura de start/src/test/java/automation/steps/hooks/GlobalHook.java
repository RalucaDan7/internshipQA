package automation.steps.hooks;

import cucumber.api.java.Before;

public class GlobalHook {

    private static boolean dunit = false;

    @Before("@Raluca1")
    public void beforeRaluca() {
        String message = System.getProperty("message");
        System.out.println(message);
    }

    @Before("@UI")
    public void beforeAll() {
        System.out.println("global hook executed.");
        }
}
