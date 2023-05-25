package automation.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class ConfigManager {


    public static final long DEFAULT_WAIT = 20;
    private static final String path;
    private static String browser;
    private static String baseUrl;

    private static String baseCoreUIUrl;
    private static final String execution;
    private static String confFile;
    private static final String platform;

    static {
        path = loadSystemProperties();
        baseUrl = System.getProperty("testautomation.baseUrl");
        platform = System.getProperty("testautomation.platform");;
        browser = System.getProperty("testautomation.browser");
        execution = System.getProperty("testautomation.execution");
        baseCoreUIUrl = System.getProperty("testautomation.baseCoreUIUrl");
    }

    private static String loadSystemProperties() {
        String path = "";
        String confFileName;

        try {
            File file;
            path = "src/test/resources/";
            confFileName = "testautomationLocal.properties";
            confFile = path + confFileName;
            file = new File(confFile);

            if (!file.exists()) {
                path = "functional-test/src/test/resources/";
                confFile = path + confFileName;
                file = new File(confFile);
            }
            FileInputStream fileInput = new FileInputStream(file);
            Properties sysProperties = new Properties();
            sysProperties.load(fileInput);
            @SuppressWarnings("rawtypes") Enumeration keys = sysProperties.keys();
            while (keys.hasMoreElements()) {
                String key = (String) keys.nextElement();
                String value = sysProperties.getProperty(key);
                System.setProperty(key, value);
            }

        } catch (IOException io) {
            io.printStackTrace();
        }
        return path;
    }

    public static String getBrowser() {
        if (browser == null || browser.isEmpty()) {
            System.out.println("The browser was not specified in " + confFile);
            System.exit(0);
        }
        return browser;
    }

    public static String getPath(){
        return path;
    }

    public static String getBaseUrl() {
        if (baseUrl == null || baseUrl.isEmpty()) {
            System.out.println("The base url of the target test application was not specified or is empty in " + confFile);
            System.exit(0);
        }
        return baseUrl;
    }
    public static String getBaseCoreUIUrl() {
        if (baseCoreUIUrl == null || baseCoreUIUrl.isEmpty()) {
            System.out.println("The base url of the target test application was not specified or is empty in " + confFile);
            System.exit(0);
        }
        return baseCoreUIUrl;
    }
    public static String getExecution() {
        if (execution == null || execution.isEmpty()) {
            System.out.println("Execution is not provided in " + confFile);
            System.exit(0);
        }
        return execution;
    }

    public static String getPlatform() {
        if (platform == null || platform.isEmpty()) {
            System.out.println("Execution is not provided in " + confFile);
            System.exit(0);
        }
        return platform;
    }


}
