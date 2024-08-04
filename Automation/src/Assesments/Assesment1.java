//Questions :- Navigate to flipkart.com, in the search box, search any of 
//the mobile brand and click on enter using sendKeys(), Select the third 
//or forth product it will open in new tab and fill the pin code text field, click 
//on check button and it will change into change button.  
package Assesments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assesment1 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		// Get the parent window id
		String parentWindowId = driver.getWindowHandle();

		WebElement searchTextField = driver.findElement(By.name("q"));
		searchTextField.sendKeys("iphone 15", Keys.ENTER);

		driver.findElement(By.partialLinkText("Apple iPhone 15 (Green, 256 GB")).click();

		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(parentWindowId);

		for (String windowId : allWindowIds) {
				driver.switchTo().window(windowId);
		}

		driver.findElement(By.id("pincodeInputId")).sendKeys("411002",Keys.ENTER);

	}
}
