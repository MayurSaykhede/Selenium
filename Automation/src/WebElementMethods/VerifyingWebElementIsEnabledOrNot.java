package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyingWebElementIsEnabledOrNot {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		WebElement ele = driver.findElement(By.xpath("//b[text()='Become a Subscriber']/../../..//input[@type='text']"));
		System.out.println(ele.isEnabled());
		
		driver.findElement(By.id("navbar-search-input"));
		System.out.println(ele.isEnabled());
	}

}
