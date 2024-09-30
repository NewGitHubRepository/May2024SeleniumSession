package basicTesting;


		import org.jsoup.Jsoup;
		import org.jsoup.nodes.Document;
		import org.jsoup.nodes.Element;
		import org.jsoup.select.Elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

		public class GoogleSearchAutomation {
			 static WebDriver driver;
		    public static void main(String[] args) {
		    	
		    	  driver = new ChromeDriver();
		        //  driver.get("https://www.google.com/");
		        //String query = "site:example.com filetype:pdf"; // Change to your search query
		          String query = "Selenium pdf"; 
		        String url = "https://www.google.com/search?q=" + query.replace(" ", "+");

		        try {
		            // Fetch the HTML content from the URL
		            Document doc = Jsoup.connect(url).userAgent("Mozilla/5.0").get();

		            // Select the search result titles
		            Elements results = doc.select("h3");

		            // Print the titles of the search results
		            for (Element result : results) {
		                System.out.println(result.text());
		            }
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		    }
		}



