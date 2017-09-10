package helpers;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import step_definitions.TestFrame;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class BrowserInit {

    public static WebDriver driver;
    //use browserProfile for storing driver capabilities
    public static JsonObject browserProfile;

    public BrowserInit(boolean isMobile) {
        System.out.println("BrowserInit() called");
        if (isMobile) {
            System.out.println("Initializing mobile browsers...");
            JsonArray browserPreferences = new JsonArray();
            //This configuration could come from mongo test database
            JsonObject iPhone7 = new JsonObject();
            JsonObject AndroidResponsive = new JsonObject();
            iPhone7.addProperty("deviceName", "iPhone7");
            iPhone7.addProperty("general.useragent.override", "Mozilla/5.0 (iPhone; CPU iPhone OS 7_0 like Mac OS X) AppleWebKit/537.51.1 (KHTML, like Gecko) Mobile/11A465");
            iPhone7.addProperty("width", 414);
            iPhone7.addProperty("height", 736);
            AndroidResponsive.addProperty("deviceName", "AndroidResponsive");
            AndroidResponsive.addProperty("general.useragent.override", "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36");
            AndroidResponsive.addProperty("width", 360);
            AndroidResponsive.addProperty("height", 640);

            browserPreferences.add(iPhone7);
            browserPreferences.add(AndroidResponsive);

            //select a device randomly for tests
            Random Dice = new Random();
            int n = Dice.nextInt(browserPreferences.size());
            this.browserProfile = browserPreferences.get(n).getAsJsonObject();
            System.out.println("Selected Mobile Device Type:" + browserProfile.get("deviceName"));
        } else {
            System.out.println("Desktop browser has been selected, nothing to initialize yet...");
        }

    }


    public static WebDriver getFireFoxDriver(boolean mobile) {
        //we can specify the path of gecko driver here
        System.setProperty("webdriver.gecko.driver", "/home/vera/workspace/geckodriver");

        DesiredCapabilities dc = DesiredCapabilities.firefox();
        FirefoxProfile profile = new FirefoxProfile();
        //JavaScriptError = new JavaScriptError();
//        try {
//            JavaScriptError.addExtension(profile);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        if (mobile) {
            profile.setPreference("general.useragent.override", browserProfile.get("general.useragent.override").getAsString());
        }
        dc.setCapability(FirefoxDriver.PROFILE, profile);
        driver = new FirefoxDriver(dc);
        if (mobile) {
            driver.manage().window().setSize(new Dimension(browserProfile.get("width").getAsInt(), browserProfile.get("height").getAsInt()));
        }
        return driver;
    }

    public static WebDriver getChromeDriver(boolean mobile) {
        //supporting headless mode
        String headlessSySProperty = System.getProperty("headless", "no");
        //specify path of chromedriver here
        System.setProperty("webdriver.chrome.driver", "/home/vera/workspace/chromedriver");

        if (headlessSySProperty.equals("no")) {
            driver = getChromeDevice(mobile);
        } else {
            driver = getChromeDeviceHeadless();
        }
        return driver;
    }

    private static WebDriver getChromeDevice(boolean mobile) {
        Map<String, Object> chromeOptions = new HashMap<String, Object>();
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();

        // Desktop or Mobile case
        if (mobile) {
            System.out.println("getting chrome driver Mobile");
            Map<String, String> mobileEmulation = new HashMap<String, String>();
            mobileEmulation.put("userAgent",
                    "Mozilla/5.0 (Linux; Android 4.2.1; en-us; Nexus 5 Build/JOP40D) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.166 Mobile Safari/535.19");
            chromeOptions.put("mobileEmulation", mobileEmulation);
        } else {
            System.out.println("chrome driver is for Desktop");
        }


        capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
        driver = new ChromeDriver(capabilities);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        if (TestFrame.isMobilePlatform()) {
            driver.manage().window().maximize();
        }
        return driver;
    }

    private static WebDriver getChromeDeviceHeadless() {
        ChromeOptions chromeOptionsHeadless = new ChromeOptions();
        chromeOptionsHeadless.addArguments("--headless");
        chromeOptionsHeadless.addArguments("--disable-gpu");
        // Desktop or Mobile case
        System.out.println("getting chrome driver Mobile");
        //set user agent to an Iphone 7
        chromeOptionsHeadless.addArguments("--user-agent=Mozilla/5.0 (iPhone; CPU iPhone OS 10_2_1 like Mac OS X) AppleWebKit/602.4.6 (KHTML, like Gecko) Version/10.0 Mobile/14D27 Safari/602.1");
        //TODO: Implement desktop headless mode

        driver = new ChromeDriver(chromeOptionsHeadless);

        return driver;
    }
}
