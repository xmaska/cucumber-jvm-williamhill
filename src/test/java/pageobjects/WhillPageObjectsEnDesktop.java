package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WhillPageObjectsEnDesktop extends BaseClass {

    public WhillPageObjectsEnDesktop(WebDriver driver) {
        super(driver);
    }


    //@FindBy(how=How.CLASS_NAME, className="account-tab__text -login")
    @FindBy(how = How.XPATH, xpath = "//span[@class='account-tab__text -login']")
    public static WebElement sign_in;

    @FindBy(how = How.XPATH, xpath = "//input[@id=\"loginUsernameInput\"]")
    public static WebElement log_in_username;

    @FindBy(how = How.XPATH, xpath = "//div[@class=\"modal__spinner\"]")
    public static WebElement modal_spinner;

    public static class LoginForm {
        @FindBy(how = How.XPATH, xpath = "//input[@id=\"loginUsernameInput\"]")
        public static WebElement log_in_username;

        @FindBy(how = How.XPATH, xpath = "//input[@id=\"loginPasswordInput\"]")
        public static WebElement log_in_password;

        @FindBy(how = How.XPATH, xpath = "//button[@id=\"loginButton\"]")
        public static WebElement log_in_button;

    }


}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	