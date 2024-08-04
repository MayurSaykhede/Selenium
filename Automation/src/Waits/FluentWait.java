package Waits;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FluentWait {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		//FluentWait fulentwait = new FluentWait(driver);
		//fluentwait.pollingEvery(Duration.ofMillis(250));
		//fluentwait.ignoring(NoSuchElementException.class);
		//fluentwait.withTimeout(Duration.ofSeconds(15));
		
		
		

	}

}
