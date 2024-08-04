package actionsClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformDragAndDropByCoordinates {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.paiinternational.in/shop/categories/furniture-2/");
		WebElement leftSlider = driver.findElement(By.xpath("//span[contains(@class,'irs-slider from')]"));
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(leftSlider, 40, 0).perform();
		actions.dragAndDropBy(leftSlider, -40, 0).perform();
		
	}

}
