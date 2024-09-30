package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementTextTest {
   static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By header = By.tagName("h2");
		By para = By.xpath("//*[@id=\"content\"]/div/div[1]/div/p[2]");
		By forgotPwdLink = By.linkText("Forgotten Password");
		By footerHeader = By.tagName("h5");
		//By name  = By.className("naveen");
		
		String m1 = doGetElementText(header);
		String m2 = doGetElementText(para);
		String m3 = doGetElementText(forgotPwdLink);
		String m4 = doGetElementText(footerHeader);
		//String m5 = doGetElementText(name);
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		//System.out.println(m5);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	public static String doGetElementText(By locator) {
		String eleText = getElement(locator).getText();
		if (eleText != null) {
			return eleText;
		}
		else {
			System.out.println("Element text is null : "+ eleText);
			//throw new CustomException("Element text ix null ---- Not FOUND");
			return null;
			
		}
		
	}

}
