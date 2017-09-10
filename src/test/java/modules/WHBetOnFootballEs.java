package modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import pageobjects.WhillPageObjectsEsDesktopBetSlip;


public class WHBetOnFootballEs {

    public static void Execute(WebDriver driver, double stakeValue) throws Exception {
        Reporter.log("Trying with a random bet placement in Football section...");

        //waiting max 30 seconds for loading the page
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(WhillPageObjectsEsDesktopBetSlip.slipStakeActiveInput));

        //These object came alive once outcome has been selected, TODO: separate pageobjects as betslip
        //wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class=\"slipStake\"]//input"))));

//		WebElement elements;
//		elements= driver.findElement(By.xpath("//div[@class=\"slipStake\"]//input"));
//		elements.sendKeys("0.05");
        WhillPageObjectsEsDesktopBetSlip.slipStakeActiveInput.sendKeys("" + stakeValue);

        WhillPageObjectsEsDesktopBetSlip.placeBet.click();
//		WebElement element = driver.findElement(By.xpath("//input[@id=\"slipBtnPlaceBet\"]"));
//		element.click();
    }
}
