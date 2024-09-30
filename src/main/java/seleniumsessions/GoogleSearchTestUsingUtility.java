package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchTestUsingUtility {
     
	public static void main(String[] args) throws InterruptedException {
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.lunchBrowser("chrome");
		brUtil.lunchURL("https://www.google.com/");
		
		String title =brUtil.getTitle();
	    System.out.println("Title of the page : "+ title);
	    
	    ElementUtility eleUtil = new ElementUtility(driver);
	    By searchField = By.name("q");
        Thread.sleep(3000);
        By suggestionList = By.xpath("//div[@class='OBMEnb']/ul/li");
        eleUtil.getSize(suggestionList);
	    eleUtil.doSearch(searchField, suggestionList , "naveen automationlabs", "selenium");
	    
	    
	    brUtil.closeBrowser();
	
	
	}
	

}
