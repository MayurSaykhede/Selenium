package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToAutomateSimpleAlertPopupInSBI {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		Actions actions = new Actions(driver);
		actions.contextClick().perform();
	    Alert alert = driver.switchTo().alert();
	    String info = alert.getText(); //Capturing msg/info present in alert
	    System.out.println(info);
	    Thread.sleep(5000);
	    //alert.accept(); //Press on Ok
	    alert.dismiss(); //Press on Ok
	    
	}

}

