package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToAutomateConfirmationAlertPopupInOmayo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.id("confirm")).click();
		Alert alert = driver.switchTo().alert();
		String info = alert.getText();
		System.out.println(info);
		Thread.sleep(5000);
		//alert.accept();
		alert.dismiss();
	}

}
