package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthPopup {

	public static void main(String[] args) throws InterruptedException {
	
		// Its not a JS popup , its a basic authentication popup
		// within the URL , we need to pass the values
		WebDriver driver = new ChromeDriver();
	//	Thread.sleep(2000);
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

		String username = "admin";
		String password = "admin";
	
		driver.get("https://"+username+":"+password+"@" + "the-internet.herokuapp.com/basic_auth");
	
	}
	

}
