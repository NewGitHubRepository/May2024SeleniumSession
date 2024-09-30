package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandling {

	public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");//page

		// click on img
		driver.findElement(By.cssSelector("div#imageTemplateContainer")).click();
		
		Thread.sleep(3000);
		//how many iframe inside the page
		int frameCount = driver.findElements(By.tagName("iframe")).size();
		System.out.println(frameCount);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id, 'frame-one')]")));
		
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("W3School.com");
		
		driver.switchTo().defaultContent();// come out of the frame
		String header = driver.findElement(By.cssSelector("h3.details__form-preview-title")).getText();
		System.out.println(header);
		
		
		
	}

}
