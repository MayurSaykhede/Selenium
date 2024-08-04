package actionsClassMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformClickHoldRelease {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement capital = driver.findElement(By.id("box5"));
		WebElement country = driver.findElement(By.id("box105")); 
		Actions actions = new Actions(driver);
		actions.clickAndHold(capital).release(country).perform();
		//actions.moveToElement(capital).clickAndHold().release(country).perform();
		//actions.clickAndHold(capital).moveToElement(country).release().perform();
		//actions.moveToElement(capital).clickAndHold().release(country).perform();
		
	}

}
