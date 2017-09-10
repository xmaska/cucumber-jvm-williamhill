package modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import pageobjects.WhillPageObjectsEsDesktopBetSlip;


public class WHBetOnTennisEs {

    public static void Execute(WebDriver driver, double stakeValue) throws Exception {
        Reporter.log("Trying with a random bet placement in Tennis section...");
        //waiting max 30 seconds for loading the page
        WebDriverWait wait = new WebDriverWait(driver, 30);

        wait.until(ExpectedConditions.elementToBeClickable(WhillPageObjectsEsDesktopBetSlip.slipStakeActiveInput));

        WhillPageObjectsEsDesktopBetSlip.slipStakeActiveInput.sendKeys("" + stakeValue);

        WhillPageObjectsEsDesktopBetSlip.placeBet.click();

    }
}
