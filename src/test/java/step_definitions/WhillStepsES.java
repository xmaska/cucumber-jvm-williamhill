package step_definitions;

import cucumber.api.java.en.When;
import modules.WHBetOnFootballEs;
import modules.WHBetOnTennisEs;
import modules.WHSignInActionEs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.WhillPageObjectsEsDesktop;
import pageobjects.WhillPageObjectsEsDesktopBetSlip;
import pageobjects.WhillPageObjectsEsDesktopFootball;
import pageobjects.WhillPageObjectsEsDesktopTennis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


public class WhillStepsES {
    public WebDriver driver;
    public static List<HashMap<String, String>> credentialsMap = null;


    public WhillStepsES() {
        driver = TestFrame.driver;
        //initializing credentials, later this could be loaded from mongoDB as part of test data (or csv/xls)
        credentialsMap = new ArrayList<HashMap<String, String>>();
        HashMap<String, String> sampleData = new HashMap<String, String>();
        sampleData.put("username", "jjanej");
        sampleData.put("password", "Password123");
        System.out.println("Credentials data" + sampleData);
        credentialsMap.add(sampleData);
    }

    @When("^I open WilliamHill website in Spanish$")
    public void i_open_WilliamHill_website_in_Spanish() throws Throwable {
        if (TestFrame.isMobilePlatform()) {
            driver.get("https://mobet.williamhill.es");
        } else {
            driver.get("http://sports.williamhill.es/");
        }

    }

    @When("^I validate title and URL of WilliamHill Spanish site$")
    public void i_validate_title_and_URL_of_WilliamHill_Spanish_site() throws Throwable {
        assertEquals("Apuestas deportivas, con bono de hasta €150 en William Hill Online", driver.getTitle());
        assertEquals("http://sports.williamhill.es/bet_esp/es", driver.getCurrentUrl());
    }

    @When("^I sign in to WilliamHill Spanish site")
    public void i_sign_in_to_WilliamHill_Spanish_site() throws Throwable {
        PageFactory.initElements(driver, WhillPageObjectsEsDesktop.class);
        PageFactory.initElements(driver, WhillPageObjectsEsDesktop.LoginForm.class);
        WHSignInActionEs.Execute(driver, credentialsMap.get(0));
    }

    @When("^I go to (.+) page$")
    public void I_go_to_given_sport_page(String sport) throws Throwable {
        if (sport.equals("Football")) {
            PageFactory.initElements(driver, WhillPageObjectsEsDesktopFootball.class);
            WhillPageObjectsEsDesktopFootball.FootBall.click();
        } else if (sport.equals("Tennis")) {
            PageFactory.initElements(driver, WhillPageObjectsEsDesktopTennis.class);
            WhillPageObjectsEsDesktopTennis.Tennis.click();
        }
    }

    @When("^I go to Tennis page manually$")
    public void I_go_to_Tennis_page() throws Throwable {
        PageFactory.initElements(driver, WhillPageObjectsEsDesktopTennis.class);
        WhillPageObjectsEsDesktopTennis.Tennis.click();
    }

    @When("^I place bet on random selection with stake value (.+)$")
    public void I_place_bet_on_random_selection_with_stake_value(double stakeValue) throws Throwable {
        //see if we are on Football or Tennis page
        if (driver.getCurrentUrl().endsWith("Tenis.html")) {
            // We need to place bet on Tenis
            PageFactory.initElements(driver, WhillPageObjectsEsDesktopTennis.class);
            WhillPageObjectsEsDesktopTennis.firstVisibleEvent.click();
            WhillPageObjectsEsDesktopTennis.firstLiveSelection.click();
            PageFactory.initElements(driver, WhillPageObjectsEsDesktopBetSlip.class);
            WHBetOnTennisEs.Execute(driver, stakeValue);
        } else {
            //It's Football
            PageFactory.initElements(driver, WhillPageObjectsEsDesktopFootball.class);
            WhillPageObjectsEsDesktopFootball.firstLiveEvent.click();
            WhillPageObjectsEsDesktopFootball.firstLiveSelection.click();
            PageFactory.initElements(driver, WhillPageObjectsEsDesktopBetSlip.class);
            WHBetOnFootballEs.Execute(driver, stakeValue);
        }
    }

    @When("^I validate bet placement (.+)$")
    public void I_validate_bet_placement(String isSuccess) throws Throwable {
        PageFactory.initElements(driver, WhillPageObjectsEsDesktopBetSlip.class);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        if (isSuccess.equals("true")) {
            assertFalse(WhillPageObjectsEsDesktopBetSlip.errorMessage.isDisplayed());
        }else if (isSuccess.equals("false")) {
            assertTrue(WhillPageObjectsEsDesktopBetSlip.errorMessage.isDisplayed());
        }
    }

}