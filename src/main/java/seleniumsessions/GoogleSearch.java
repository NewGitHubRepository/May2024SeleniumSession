package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
  static WebDriver driver;
  static boolean flag=false;
	public static void main(String[] args) throws InterruptedException {
		
          driver = new ChromeDriver();
          driver.get("https://www.google.com/");
          //driver.findElement(By.name("q")).sendKeys("Selenium");
          By searchField = By.name("q");
          Thread.sleep(3000);
          By suggestionList = By.xpath("//div[@class='OBMEnb']/ul/li");
       // List<WebElement> suggestionList =  driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
        //System.out.println(suggestionList.size());
          getSize(suggestionList);
          doSearch(searchField, suggestionList, "Selenium","testing");
        
       /* for(WebElement e :suggestionList ) {
        	String text =e.getText();
        	System.out.println(text);
        	
        	if(text.contains("training")) {
        		e.click();
        		flag = true;
        		
        		break;
        	}
        }
        System.out.println(flag);
	
	}*/
	
	}
	
	public static void doSearch(By searchField , By suggestionList, String searchKey, String matchText ) throws InterruptedException {
		doSendkeys(searchField,searchKey);
		Thread.sleep(3000);
	    List<WebElement> suggList = getElementslist(suggestionList);
	    int totalSugglist =getSize(suggestionList);
	    System.out.println(totalSugglist);
	    boolean flag = false;
		for(WebElement e :suggList ) {
        	String text =e.getText();
        	System.out.println(text);
        	
        	if(text.contains(matchText)) {
        		e.click();
        		flag = true;
        		
        		break;
        	}
        }
		System.out.println(flag);
      
	}
	
		
	
	public static int getSize(By locator) {
		return getElementslist(locator).size();
	}

	public static List<WebElement> getElementslist(By locator) {
		return driver.findElements(locator);
	}
	public static void doSendkeys(By locator , String value) {
		getElement(locator).sendKeys(value);
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
}
