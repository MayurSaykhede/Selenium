package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleChildWindowInSBI {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		String parentWindowId = driver.getWindowHandle();
		driver.findElement(By.partialLinkText("CONTINUE TO LOGIN")).click();
		driver.findElement(By.partialLinkText("Forgot Username / Login Password")).click();	
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(parentWindowId);
		for(String windowId : allWindowIds) {
			driver.switchTo().window(windowId);
		}
		
		driver.manage().window().maximize();
		driver.findElement(By.name("nextStep")).click();
		driver.findElement(By.name("userName")).sendKeys("SaykhedeMayur");
		driver.findElement(By.name("accountNo")).sendKeys("123456");
		
		WebElement countryDropDown = driver.findElement(By.name("countryCode"));
		Select select = new Select(countryDropDown);
		select.selectByVisibleText("India");
		
		driver.findElement(By.name("mobileNo")).sendKeys("7387985221");
		driver.findElement(By.id("datepicker5")).sendKeys("19/12/1997");
		
		
		
	}

}
