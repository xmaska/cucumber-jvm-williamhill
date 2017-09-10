package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WhillPageObjectsEsDesktopFootball extends BaseClass {

    public WhillPageObjectsEsDesktopFootball(WebDriver driver) {
        super(driver);
    }


    @FindBy(how = How.XPATH, xpath = "//a[@id=\"football\"]")
    public static WebElement FootBall;

    //TODO: Only select event if its not suspended!!!
//	@FindBy(how=How.XPATH, xpath = "//td/div[@class=\"eventpriceholder-left\"]/preceding::tr[@class=\"rowLive\"]/td[3]/a")
//@FindBy(how=How.XPATH, xpath = "//div[@class=\"eventpriceholder-left\"]/parent::td/preceding::td[3]")
    @FindBy(how = How.XPATH, xpath = "//td//a[contains(@href,\"betting\")]")
    public static WebElement firstLiveEvent;

    @FindBy(how = How.XPATH, xpath = "//div[@class=\"marketHolderExpanded\"]//tbody[1]/tr/td")
    public static WebElement firstLiveSelection;

    public static class Betslip {

        @FindBy(how = How.XPATH, xpath = "//div[@class=\"slipStake\"]//input")
        public static WebElement slipStakeActiveInput;

        @FindBy(how = How.XPATH, xpath = "//input[@id=\"slipBtnPlaceBet\"]")
        public static WebElement placeBet;
    }


}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	