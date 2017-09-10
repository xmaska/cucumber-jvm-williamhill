package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WhillPageObjectsEsDesktopTennis extends BaseClass {

    public WhillPageObjectsEsDesktopTennis(WebDriver driver) {
        super(driver);
    }


    @FindBy(how = How.XPATH, xpath = "//a[@id=\"tennis\"]")
    public static WebElement Tennis;

    @FindBy(how = How.XPATH, xpath = "//td[@class=\"CentrePad\"]")
    public static WebElement firstVisibleEvent;

    @FindBy(how = How.XPATH, xpath = "//div[@class=\"eventprice\"]")
    public static WebElement firstLiveSelection;


}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	