package modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import pageobjects.WhillPageObjectsEsDesktop;

import java.util.HashMap;


public class WHSignInActionEs {

    public static void Execute(WebDriver driver, HashMap<String, String> credentialsMap) throws Exception {
        Reporter.log("Trying to Log Into WilliamHills Spanish Web Page");
        //waiting max 30 seconds for loading the page
        WebDriverWait wait = new WebDriverWait(driver, 30);

        wait.until(ExpectedConditions.elementToBeClickable(WhillPageObjectsEsDesktop.sign_in));
//TODO: workodund for Chromeium, 32 bit ubuntu, sendkey does not work -- https://github.com/xmaska/cucumber-jvm-williamhill
//        wait.until(ExpectedConditions.visibilityOf(WhillPageObjectsEsDesktop.LoginForm.log_in_username));
//        WhillPageObjectsEsDesktop.LoginForm.log_in_username.click();
//        Actions actions = new Actions(driver);
//        actions.moveToElement(WhillPageObjectsEsDesktop.LoginForm.log_in_username);
//        actions.click();
//        actions.sendKeys("Some Name");
//        actions.build().perform();
        WhillPageObjectsEsDesktop.LoginForm.log_in_username.sendKeys(credentialsMap.get("username"));
        WhillPageObjectsEsDesktop.LoginForm.log_in_password.sendKeys(credentialsMap.get("password"));
        WhillPageObjectsEsDesktop.LoginForm.log_in_button.click();
        Reporter.log("SignIn Action has been performed");

        wait.until(ExpectedConditions.elementToBeClickable(WhillPageObjectsEsDesktop.sign_out));
    }
}
