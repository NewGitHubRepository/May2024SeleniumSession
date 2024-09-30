package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoScoreCardWebTable {
   static WebDriver driver;
	public static void main(String[] args) {
		 driver = new ChromeDriver();
		 driver.get("https://www.espncricinfo.com/series/the-hundred-men-s-competition-2024-1417778/manchester-originals-men-vs-oval-invincibles-men-18th-match-1417807/full-scorecard");
	   //bat's man xpath
		//span[text() = 'Tom Curran']/ancestor::td/following-sibling::td/span
		 
		 //bowler score
		 // //span[text() = 'Paul Walter']/ancestor::td/following-sibling::td
		 
		 
		 List<WebElement> scoreList = driver.findElements(By.xpath("//span[text() = 'Paul Walter']/ancestor::td/following-sibling::td"));
		 
		 for (WebElement e : scoreList) {
			 String text = e.getText();
			 System.out.println(text);
		 }
	    System.out.println("==============================================");
		 
		 //only bowler score card
		//th[text() = 'BOWLING']/ancestor::thead/following-sibling::tbody//span[text() = 'Paul Walter']/ancestor::td/following-sibling::td
	
	    List<WebElement> bowlerScoreList = driver.findElements(By.xpath("//th[text() = 'BOWLING']/ancestor::thead/following-sibling::tbody//span[text() = 'Paul Walter']/ancestor::td/following-sibling::td"));
		 
		 for (WebElement e : bowlerScoreList) {
			 String text = e.getText();
			 System.out.println(text);
		 }
	    
	    
	}

}
