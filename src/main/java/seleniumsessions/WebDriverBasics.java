package seleniumsessions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		//Open a chrome browser
		//ChromeDriver driver = new ChromeDriver();
		EdgeDriver driver = new EdgeDriver();
		//enter a URL
		driver.get("http://www.google.com");
		//get the title 
		String title = driver.getTitle();
		System.out.println(title);
		// act vs exp : validation /check points
		if(title.equalsIgnoreCase("Google")) {
			System.out.println("Correct title===pass");
		}
		else {
			System.out.println("InCorrect title===fail");
		}
        // close browser
		driver.close();
		
		
	}

}
