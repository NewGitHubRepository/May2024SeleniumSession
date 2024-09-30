package seleniumsessions;

public class AmazonTest {

	public static void main(String[] args) {
	     
		BrowserUtil brUtil = new BrowserUtil();
		brUtil.lunchBrowser("edge");
		brUtil.lunchURL("http://www.amazon.in/");
	    String title = brUtil.getTitle();
	    System.out.println(title);
	    if (title.contains("Amazon")) {
	    	System.out.println("Title - Pass");
	    }else {
	    	System.out.println("Title - Fail");
	    }
	    
	    System.out.println(brUtil.getCurrentURL());
	    brUtil.quitBrowser();

	}

}
