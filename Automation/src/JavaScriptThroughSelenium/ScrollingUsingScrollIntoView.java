package JavaScriptThroughSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingUsingScrollIntoView {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.naukri.com/"); 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement logo = driver.findElement(By.className("logo"));
		js.executeScript("arguments[0].scrollIntoView(true)", logo);
	}

}
