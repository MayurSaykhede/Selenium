package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingLocationOfWebElement {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Meesho Logo']"));
		Point loc = logo.getLocation();
		System.out.println("X coordinate : " + loc.getX());
		System.out.println("Y coordinate : " + loc.getY());
	}

}
