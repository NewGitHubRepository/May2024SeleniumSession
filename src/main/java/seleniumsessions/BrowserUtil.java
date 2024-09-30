package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {

	
	WebDriver driver;
	
	public WebDriver lunchBrowser(String browserName) {
		
		System.out.println("Browser name : "+ browserName);
		
		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
			
		case "firefox":
			driver = new FirefoxDriver();
			break;
			
		case "edge":
			driver = new EdgeDriver();
			break;
			
		case "safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("Plz pass the right browser name");
			throw new CustomException("-----INVALID BROWSER----------");
			
		}
		
		return driver;
	}
	
	public void lunchURL(String url) {
		if (url.indexOf("http")!=0) {
			throw new CustomException("http protocol is missing in the URL");
		}
		
		 driver.get(url);
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public String getCurrentURL() {
		return driver.getCurrentUrl();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	
	
	
}
