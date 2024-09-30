package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationFormTestUsingUtils {

	public static void main(String[] args) {
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.lunchBrowser("chrome");
		brUtil.lunchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		System.out.println(brUtil.getTitle());
		
	   By firstName = By.id("input-firstname");
	   By lastName = By.id("input-lastname");
	   By email = By.id("input-email");
	   By telephone = By.id("input-telephone");
	   By password = By.id("input-password");
	   By pwdConfirm = By.id("input-confirm");
	   
	   ElementUtility eleUtil = new ElementUtility(driver);
	   eleUtil.doSendkeys(firstName, "Geetanjali");
	   eleUtil.doSendkeys(lastName, "Bevara");
	   eleUtil.doSendkeys(email, "geetanjali@gmail.com");
	   eleUtil.doSendkeys(telephone, "9999988880");
	   eleUtil.doSendkeys(password, "Geeta@123");
	   eleUtil.doSendkeys(pwdConfirm, "Geeta@123");
	   
	   brUtil.quitBrowser();
	}

}
