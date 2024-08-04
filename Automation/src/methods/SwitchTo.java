package methods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo {

		public static void main(String[] args) {
			
			// to launch the browser 
			WebDriver driver = new ChromeDriver();
			
			// to maximize the window
			driver.manage().window().maximize();
			
			// to lauch the web application 
			driver.get("https://www.google.com");
			
			// to switch on active element
			driver.switchTo().activeElement().sendKeys("dosa",Keys.ENTER);
			
			
		}
}
