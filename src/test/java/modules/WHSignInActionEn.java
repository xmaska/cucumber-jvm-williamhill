package modules;

import helpers.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import pageobjects.WhillPageObjectsEnDesktop;

import java.util.HashMap;


public class WHSignInActionEn {

    public static void Execute(WebDriver driver, HashMap<String, String> credentialsMap) throws Exception {
        Reporter.log("Trying to Log Into WilliamHills English Web Page");
        //waiting max 30 seconds for loading the page
        WebDriverWait wait = new WebDriverWait(driver, 30);

        wait.until(ExpectedConditions.elementToBeClickable(WhillPageObjectsEnDesktop.sign_in));

        WhillPageObjectsEnDesktop.sign_in.click();
        Log.info("Click action is perfromed Login");

        WhillPageObjectsEnDesktop.LoginForm.log_in_username.sendKeys(credentialsMap.get("username"));
        WhillPageObjectsEnDesktop.LoginForm.log_in_password.sendKeys(credentialsMap.get("password"));
        WhillPageObjectsEnDesktop.LoginForm.log_in_button.click();
        Reporter.log("SignIn Action has been performed");

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class=\"modal__spinner\"]")));
    }
}
