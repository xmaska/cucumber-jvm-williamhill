package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WhillPageObjectsEsDesktop extends BaseClass {

    public WhillPageObjectsEsDesktop(WebDriver driver) {
        super(driver);
    }


    //@FindBy(how=How.CLASS_NAME, className="account-tab__text -login")
    @FindBy(how = How.XPATH, xpath = "//div[@id=\"tmp_username_div\"]")
    public static WebElement sign_in;

    @FindBy(how = How.XPATH, xpath = "//a[@class=\"signOutLink linkable\"]")
    public static WebElement sign_out;

    @FindBy(how = How.XPATH, xpath = "//a[@id=\"football\"]")
    public static WebElement FootBall;


    public static class LoginForm {
        @FindBy(how = How.XPATH, xpath = "//input[@name=\"tmp_username\"]")
        public static WebElement log_in_username;

        @FindBy(how = How.XPATH, xpath = "//input[@id=\"tmp_password\"]")
        public static WebElement log_in_password;

        @FindBy(how = How.XPATH, xpath = "//input[@id=\"signInBtn\"]")
        public static WebElement log_in_button;

    }


}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	