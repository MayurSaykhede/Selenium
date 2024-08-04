package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToAutomateSimpleAlertPopupInDemoWebShop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    Alert alert = driver.switchTo().alert();
	    String msg = alert.getText();
	    System.out.println(msg);
	    Thread.sleep(5000);
	    alert.accept();
	}

}
