package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptPopupHandle {

	public static void main(String[] args) throws InterruptedException {
		//JS popup
		//1.ALERT --------------OK
		//2.CONFIRM ---------OK & CANCEL
		//3.PROMPT-----------TEXT FIELD WILL BE THERE
		
		
		//1.Alert
		/*
		 * WebDriver driver = new ChromeDriver();
		 * driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		 * 
		 * driver.findElement(By.xpath("//button[text()= 'Click for JS Alert']")).click(
		 * ); Thread.sleep(3000); Alert alert = driver.switchTo().alert(); String text
		 * =alert.getText(); System.out.println(text); //alert.accept();
		 * //alert.dismiss(); Actions act= new Actions(driver);
		 * act.sendKeys(Keys.ESCAPE); System.out.println(true);
		 */
		
		//2.CONFIRM ---------OK & CANCEL
		
		/*
		 * WebDriver driver = new ChromeDriver();
		 * driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		 * 
		 * driver.findElement(By.xpath("//button[text()= 'Click for JS Confirm']")).
		 * click(); Thread.sleep(3000); Alert alert = driver.switchTo().alert(); String
		 * text =alert.getText(); System.out.println(text); //alert.accept();
		 * //alert.dismiss();
		 * 
		 * Actions act= new Actions(driver); act.sendKeys(Keys.ESCAPE);
		 * System.out.println(true);
		 */
		 
		//3.PROMPT-----------TEXT FIELD WILL BE THERE
		  WebDriver driver  = new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/javascript_alerts");
			 
			driver.findElement(By.xpath("//button[text()= 'Click for JS Prompt']")).click();
			Thread.sleep(3000);
			Alert alert = driver.switchTo().alert();
			String text =alert.getText();
			System.out.println(text);
			alert.sendKeys("NaveenautomationLabs");
			Thread.sleep(3000);
			alert.accept();
			//alert.dismiss();
			
			/*
			 * Actions act= new Actions(driver); act.sendKeys(Keys.ESCAPE);
			 * System.out.println(true);
			 */
	}

}
