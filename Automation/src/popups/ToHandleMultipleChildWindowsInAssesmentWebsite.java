package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleMultipleChildWindowsInAssesmentWebsite {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/Mayur/Downloads/Assessment1%20(1).html");
		driver.findElement(By.xpath("//button[text()=' Click Me !!!']")).click();
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String windowId : allWindowIds) {
			driver.switchTo().window(windowId);
			if(driver.getTitle().contains("BurgerKing")) {
				break;
			}
		}
		driver.manage().window().maximize();
		
	}

}
