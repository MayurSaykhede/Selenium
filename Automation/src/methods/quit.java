package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class quit {
	
	public static void main(String[] args) {
		
		// to launch the browser 
		WebDriver driver = new ChromeDriver();
				
		// to maximize the window
		driver.manage().window().maximize();
				
		// to lauch the web application 
		driver.get("https://omayo.blogspost.com/");
		
		// to check on window popup
		driver.findElement(By.linkText("Open a popup window")).click();

		
		// use close method 
		// driver.close();
		
		// use quit method
		driver.quit();
		
		 
	}

}
