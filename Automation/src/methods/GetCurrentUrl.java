package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {
	
	public static void main(String[] args) {
		
		// to launch the browser 
		WebDriver driver = new ChromeDriver();
		
		// to maximize the window
		driver.manage().window().maximize();
		
		// to lauch the web application 
		driver.get("https://www.flipkart.com");
		
		// to fetch the url 
		String url = driver.getCurrentUrl();
		System.out.println("Url is : " + url);
	
		
	}

}
