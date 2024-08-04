package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close {
	
	public static void main(String[] args) {
		
		// to launch the browser 
		WebDriver driver = new ChromeDriver();
				
		// to maximize the window
		driver.manage().window().maximize();
				
		// to lauch the web application 
		driver.get("https://www.flipkart.com");
		
		// to close the browser (Parent Window)
		driver.close();
	}
}
