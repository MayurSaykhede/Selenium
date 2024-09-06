package Waits;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FluentWait {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		//FluentWait fluentwait = new FluentWait(driver);
		//fluentwait.withTimeout(Duration.ofSeconds(15));
		//fluentwait.pollingEvery(Duration.ofMillis(250));
		//fluentwait.ignoring(NoSuchElementException.class);
		
		//fluentwait.until(ExceptedConditions.elementToBeClickable(By.id("id")));
		
		
		
		

	}

}
