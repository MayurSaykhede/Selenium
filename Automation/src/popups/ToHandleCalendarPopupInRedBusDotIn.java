package popups;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/** 
 *  ** How to handle calendar popup in redbus.in ?
 *  => In DOM go to Event Listeners -> Click on Blur and remove all files -> 
 *     after this If we are not able to inspect date element,then Click on 
 *     Focus and remove all files -> Then try to inspect it 
 */

public class ToHandleCalendarPopupInRedBusDotIn {
	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		int day = ldt.getDayOfMonth();
		String month = ldt.getMonth().toString().toLowerCase();
		month = month.replace(month.charAt(0), (char) (month.charAt(0)-32));
		month = month.substring(0, 2);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("onwardCal")).click();
		String locator = "//div[contains(text(),'"+month+"')]/../..//span[contains(text(),'"+day+"')]";
		driver.findElement(By.xpath(locator)).click();
	}

}
