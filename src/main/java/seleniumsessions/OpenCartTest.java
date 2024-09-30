package seleniumsessions;

public class OpenCartTest {

	public static void main(String[] args) {
		BrowserUtil brUtil = new BrowserUtil();
		brUtil.lunchBrowser("chrome");
		brUtil.lunchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	    String title = brUtil.getTitle();
	    System.out.println(title);
	    if (title.contains("Login")) {
	    	System.out.println("Title - Pass");
	    }else {
	    	System.out.println("Title - Fail");
	    }
	    
	    System.out.println(brUtil.getCurrentURL());
	    brUtil.quitBrowser();

	}

}
