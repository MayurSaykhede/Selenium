package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// used to launch zomato
		driver.navigate().to("https://www.zomato.com");
		// used to launch swiggy
		driver.get("https://www.swiggy.com"); 
		
		// back
		driver.navigate().back();
		Thread.sleep(2000);
		
		// forward
		driver.navigate().forward();
		Thread.sleep(2000);
		
		// refresh
		driver.navigate().refresh();
		
		// close the browser
		driver.close();
	}

}
