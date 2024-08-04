package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToAutomatePromptAlertPopupInOmayo {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.id("prompt")).click();
		Alert alert = driver.switchTo().alert();
		String info = alert.getText();
		System.out.println(info);
		alert.sendKeys("Mayur");
		Thread.sleep(3000);
		alert.accept();
		//alert.dismiss();
		Thread.sleep(3000);
		driver.quit();
	}

}
