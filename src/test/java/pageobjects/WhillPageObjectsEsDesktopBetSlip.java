package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WhillPageObjectsEsDesktopBetSlip extends BaseClass{

	public WhillPageObjectsEsDesktopBetSlip(WebDriver driver){
		super(driver);
	}


	@FindBy(how=How.XPATH, xpath = "//div[@class=\"slipStake\"]//input")
	public static WebElement slipStakeActiveInput;

	@FindBy(how=How.XPATH, xpath = "//input[@id=\"slipBtnPlaceBet\"]")
	public static WebElement placeBet;

	@FindBy(how=How.XPATH, xpath = "//div[@class=\"slipErrorBox\"]")
	public static WebElement errorMessage;
	
}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	