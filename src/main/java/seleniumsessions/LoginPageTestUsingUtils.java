package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTestUsingUtils {

	public static void main(String[] args) {
		
		BrowserUtil brUtil = new BrowserUtil();
	    WebDriver driver = brUtil.lunchBrowser("chrome");
		brUtil.lunchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println(brUtil.getTitle());
		
		By email = By.id("input-email");
	    By password = By.id("input-password");
	    
	    ElementUtility eleUtil = new ElementUtility(driver);
	    eleUtil.doSendkeys(email, "geetanjali@gmail.com");
	    eleUtil.doSendkeys(password, "Geeta@123");
	    
	    brUtil.quitBrowser();

	}

}
