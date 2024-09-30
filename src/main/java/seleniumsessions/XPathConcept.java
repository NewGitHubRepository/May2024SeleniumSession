package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathConcept {
    static WebDriver driver;
	public static void main(String[] args) {
		/// contains() with normalize-space() ,text() function and . dot
		//----> //a[contains(normalize-space(),'A course with complex scenarios like')]
        //----> //a[contains(text(),'A course with complex scenarios like')]
		//----> //a[contains(.,'A course with complex scenarios like')]
		
		
		driver  = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		String text = driver.findElement(By.xpath("//a[contains(normalize-space(),'A course with complex scenarios like')]")).getText();
		//String text = driver.findElement(By.xpath("//a[contains(normalize-space(),'A course with complex scenarios like')]")).getText();)
		System.out.println("with normalize-space(),Text 2: " + text);
		System.out.println("========================================");
		String text2 = driver.findElement(By.xpath("//a[contains(text(),'A course with complex scenarios like')]")).getText();
		System.out.println("with text(),Text 2: "+text2);
		System.out.println("========================================");
		String text3 = driver.findElement(By.xpath("//a[contains(.,'A course with complex scenarios like')]")).getText();
		System.out.println("with .dot() ,Text 3: "+text3);
		
		System.out.println("========================================");
		String childtxt = driver.findElement(By.xpath("//a[contains(normalize-space(),'Shadow DOM,')]")).getText();
		System.out.println("with normalize-space(),: "+childtxt);
		System.out.println("========================================");
		//String childTxt1 = driver.findElement(By.xpath("//a[contains(text(),'Shadow DOM,')]")).getText();
		//System.out.println("with text(),: "+childTxt1);
		System.out.println("========================================");
		String childTxt2 = driver.findElement(By.xpath("//a[contains(.,'Shadow DOM,')]")).getText();
		System.out.println("with .dot() ,: "+childTxt2);
		
	}

}
