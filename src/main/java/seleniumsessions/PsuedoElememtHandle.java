package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PsuedoElememtHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		String script= "return window.getComputedStyle(document.querySelector('label[for=\"input-firstname\"]'),'::before').getPropertyValue('content');";
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String content = js.executeScript(script).toString();
		System.out.println(content);
	
		if( content.contains("*")) {
			System.out.println("FN is manadatory field");
		}
		
		String script2 = "return window.getComputedStyle(document.querySelector('label[for=\"input-lastname\"]'),'::before').getPropertyValue('color');";
		
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		String color =js2.executeScript(script2).toString();
		
		System.out.println(color);
		if (color.contains("r")) {
			System.out.println("LN is manadatory field");
		}
		
		
		String emailScript ="return window.getComputedStyle(document.querySelector('label[for=\"input-email\"]'),'::before').getPropertyValue('content');";
		JavascriptExecutor js3= (JavascriptExecutor)driver;
		String emailContent =js3.executeScript(emailScript).toString();
		System.out.println(emailContent);
		if (emailContent.contains("*")) {
			System.out.println("Email is manadatory field");
		}
		
		
	}

}
