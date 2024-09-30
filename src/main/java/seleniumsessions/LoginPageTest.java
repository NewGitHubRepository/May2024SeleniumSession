package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTest {
 static WebDriver driver;
	public static void main(String[] args) {
	    driver = new ChromeDriver();
	    driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	     
	    By email = By.id("input-email");
	    By password = By.id("input-password");
	    
	    doSendkeys(email , "Geetanjali@gmail.com");
	    doSendkeys(password , "Geeta@123");
	}
	
	public static WebElement getElement(By locator) {
	return driver.findElement(locator);
	}
	
	public static void doSendkeys(By locator , String value) {
		getElement(locator).sendKeys(value);
	}

}
