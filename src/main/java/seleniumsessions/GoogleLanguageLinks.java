package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguageLinks {
  static WebDriver driver;
	public static void main(String[] args) {
		driver  = new ChromeDriver();
		driver.get("https://www.google.com/");
		boolean flag = false;
		By langList = By.xpath("//div[@id='SIvCob']/a");
		
		  List<WebElement> langListOptions = driver.findElements(langList);
		  
		  System.out.println("Total number of languages : "+ langListOptions.size());
		  
		  for(WebElement e : langListOptions) {
			 String text = e.getText();
			 System.out.println(text);
			  if(text.contains("తెలుగు")) {
				  e.click();
				  flag = true;
				  break;
			  }
			 
		  }
		  System.out.println(flag);

	}

}
