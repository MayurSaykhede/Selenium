package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {

	public static void main(String[] args) {
		
		// to launch the browser 
				WebDriver driver = new ChromeDriver();
				
				// to maximize the window
				driver.manage().window().maximize();
				
				// to lauch the web application 
				driver.get("https://www.flipkart.com");
				
				// to fetch the source code
				String sourceCode = driver.getPageSource();
				System.out.println(sourceCode);
	}
}
