/**
 * Go to w3schools website switch to frame where try it button present, 
 * click on it -> will get one prompt popup -> Enter info in popup and click
 * on Ok button -> then print a msg which is getting on child frame 
 */


package Assesments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssesmentForw3schools {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		WebElement ele = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(ele);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Mayur Saykhede");
		alert.accept();
		String msg = driver.findElement(By.id("demo")).getText();
		System.out.println(msg);

	}

}
