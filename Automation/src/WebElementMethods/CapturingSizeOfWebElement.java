package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingSizeOfWebElement {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Meesho Logo']"));
		Dimension size = logo.getSize();
		System.out.println("Height : " + size.getHeight());
		System.out.println("Width : " + size.getWidth());
	}

}
