package actionsClassMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToUseSendKeysOfActions {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement textBox= driver.findElement(By.name("q"));
	    Actions actions = new Actions(driver);
	    //actions.sendKeys(textBox, "Dosa").perform();
	    actions.moveToElement(textBox).sendKeys("Idli").perform();
	    actions.keyDown(Keys.ENTER).perform();
	    actions.keyUp(Keys.ENTER).perform();
	}

}
