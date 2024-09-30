package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {
	//	https://cgi-lib.berkeley.edu/ex/perl5/fup.html
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/perl5/fup.html");
		WebElement chooseFile = driver.findElement(By.name("upfile")); // type="file"should be there
		chooseFile.sendKeys("E:\\TestDATA\\Test.txt");
	}

}
