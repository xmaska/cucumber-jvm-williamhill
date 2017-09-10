package step_definitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import helpers.BrowserInit;
import helpers.Tools;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public class TestFrame {
    public static WebDriver driver;

    private Scenario scenario;

    private enum DriverPlatform {
        Desktop, Mobile,
    }
    private enum Browser {
        Chrome, FireFox
    }

    ;

    // get platform (Mobile or Desktop) from mvn start attributes, default is Mobile
    private static String DRIVER_PLATFORM = System.getProperty("target", DriverPlatform.Desktop.toString());
    private static String BROWSER = System.getProperty("browser", Browser.FireFox.toString());

    public static DriverPlatform getDriverPlatform() {
        return DriverPlatform.valueOf(DRIVER_PLATFORM);
    }

    public static Boolean isMobilePlatform() {
        return getDriverPlatform().equals(DriverPlatform.Mobile);
    }



    @Before
    public void openBrowser(Scenario scenario) throws MalformedURLException {
        this.scenario = scenario;
        //       scenario.write("Initializing browser...");
        System.out.println("Called openBrowser, isMobile:" + isMobilePlatform());
        BrowserInit browserInit = new BrowserInit(isMobilePlatform());
        if (BROWSER.equals("FireFox")) {
            driver = browserInit.getFireFoxDriver(isMobilePlatform());
        }else if(BROWSER.equals("Chrome")){
            driver = browserInit.getChromeDriver(isMobilePlatform());
        }
    }

    @Then("^I take a screenshot$")
    public void takeScreenshot() throws Throwable{
        scenario.write("Screenshot Taken to show this step!");
        Tools.embedScreenshot(scenario,driver);
    }

    @After
    public void postActions(Scenario scenario) {
//        final List<JavaScriptError> jsErrors = JavaScriptError.readErrors(driver);
//        for (JavaScriptError jsError : jsErrors) {
//            scenario.write("JavaScript Error found: " + jsError.getErrorMessage());
//        }
//        scenario.write("postActions called isfailed: "+scenario.isFailed() );
        if (scenario.isFailed()) {
            scenario.write("Failed Case - Current Page URL is " + driver.getCurrentUrl());
            Tools.embedScreenshot(scenario, driver);

        } else {
            scenario.write("Passed test scenario");
            Tools.embedScreenshot(scenario, driver);
            System.out.println("Test passed!");
        }
        driver.quit();

    }

}