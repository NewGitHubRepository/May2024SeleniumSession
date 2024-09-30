package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");//page
		
		//driver.switchTo().frame(2); // index
		//driver.switchTo().frame("main");// string name
		driver.switchTo().frame(driver.findElement(By.name("main")));
		String title = driver.findElement(By.xpath("//h2[text()='Title bar ']")).getText();
		System.out.println(title);
	}

}
