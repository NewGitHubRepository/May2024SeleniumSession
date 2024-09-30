package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class SVGElementsHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		Thread.sleep(3000);
		
		//svg element : Everything is SVG element under SVG tag - like g->graph , path
		//Specific Xpath for SVG element : //*[local-name()='svg']
	    // child SVG element : name() function , we have to use
		
		//xpath for each state: //*[local-name()='svg' and @id='map-svg' ]//*[name()='g' and @class='region']//*[name()='path']		
		// iframe : //iframe[contains(@id,'map-instance')]
		
	    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
		List<WebElement>stateList = driver.findElements(By.xpath("//*[local-name()='svg' and @id='map-svg' ]//*[name()='g' and @class='region']//*[name()='path']"));  
	    System.out.println(stateList.size());
	    //get the name attribute of california and click action perform
		/*
		 * for(WebElement e : stateList) { String nameAttr = e.getAttribute("name");
		 * 
		 * if(nameAttr.contains("California")) { System.out.println(nameAttr);
		 * e.click(); break; }
		 * 
		 * }
		 */
		
		//Using Actions class , fetch the all country names
		Actions act = new Actions(driver);
		for(WebElement e : stateList) {
			Thread.sleep(2000);
			act.moveToElement(e).perform();//exception : MoveTargetOutOfBoundsException
			System.out.println(e.getAttribute("name"));
			Thread.sleep(1000);
			
		}
	
	}

}
