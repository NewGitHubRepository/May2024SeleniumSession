package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtility {
	private WebDriver driver;

	public ElementUtility(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public String doGetElementText(By locator) {
		String eleText = getElement(locator).getText();
		if (eleText != null) {
			return eleText;
		} else {
			System.out.println("Element text is null : " + eleText);
			return null;
		}

	}

	public List<WebElement> getElementslist(By locator) {
		return driver.findElements(locator);
	}

	public int getSize(By locator) {
		return getElementslist(locator).size();
	}

	public void doSendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public void doSearch(By searchField, By suggestionList, String searchKey, String matchText)
			throws InterruptedException {
		doSendkeys(searchField, searchKey);
		Thread.sleep(3000);
		List<WebElement> suggList = getElementslist(suggestionList);
		int totalSugglist = getSize(suggestionList);
		System.out.println(totalSugglist);
		boolean flag = false;
		for (WebElement e : suggList) {
			String text = e.getText();
			System.out.println(text);

			if (text.contains(matchText)) {
				e.click();
				flag = true;

				break;
			}
		}
		System.out.println(flag);

	}

}
