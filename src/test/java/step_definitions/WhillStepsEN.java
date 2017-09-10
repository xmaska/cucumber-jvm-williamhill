package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import modules.WHSignInActionEn;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.WhillPageObjectsEnDesktop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;


public class WhillStepsEN {
    public WebDriver driver;
    public static List<HashMap<String, String>> credentialsMap = null;


    //    private Scenario scenario;
//
//    @Before
//    public void before(Scenario scenario){
//        this.scenario = scenario;
//    }

    public WhillStepsEN() {
        driver = TestFrame.driver;
        //initializing credentials, later this could be loaded from mongoDB as part of test data (or csv/xls)
        credentialsMap = new ArrayList<HashMap<String, String>>();
        HashMap<String, String> sampleData = new HashMap<String, String>();
        sampleData.put("username", "WHATA_FOG2");
        sampleData.put("password", "F0gUaTtest");
        System.out.println("Credentials data" + sampleData);
        credentialsMap.add(sampleData);
    }

    @When("^I open whill website$")
    public void i_open_whill_website() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.get("http://sports.williamhill.com/sr-admin-set-white-list-cookie.html");
        //scenario.write("Opened Website, let go to the next step!");
    }

    @Then("^I validate title and URL of whill site$")
    public void i_print_title_and_URL_of_whill() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals("Online Betting from William Hill - The Home of Betting", driver.getTitle());
        assertEquals("http://sports.williamhill.com/betting/en-gb", driver.getCurrentUrl());
    }

    @When("^I sign in to Whill$")
    public void i_sign_intoWhillEn() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        PageFactory.initElements(driver, WhillPageObjectsEnDesktop.class);
        PageFactory.initElements(driver, WhillPageObjectsEnDesktop.LoginForm.class);

        WHSignInActionEn.Execute(driver, credentialsMap.get(0));
    }

}