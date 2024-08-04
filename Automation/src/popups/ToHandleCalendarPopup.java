/**
 * In this program we are working with calendar popup. In this we date and 
 * month and year is dynamic that's why we are taking the help of LocalDateTime 
 * class and with the help of that we are getting current date and month 
 * and we are concatinating that with xpath at line number 29.           
 */

package popups;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleCalendarPopup {
	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		int date = ldt.getDayOfMonth();
		String month = ldt.getMonth().toString().toLowerCase();
		month = month.replace(month.charAt(0), (char)(month.charAt(0)-32));
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.redbus.com/");
		driver.findElement(By.xpath("//button[text()='Okay']")).click();
		driver.findElement(By.id("date-box")).click();
		String locator = "//div[text()='"+month+"']/../..//span[text()='"+date+"']";
		//System.out.println(locator);
		driver.findElement(By.xpath(locator)).click();
	}

}
