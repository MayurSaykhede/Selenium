/***Assesment 3 : -
 * sbi.com
 * continue login ->
 * forgot usernam/LoginPassword (child window will open)->
 * click on next ->
 * Try to fill all the details and click on submit button 
 */
package Assesments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class SBIWebsiteTask {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		String parentWindowId = driver.getWindowHandle();
		driver.findElement(By.partialLinkText("CONTINUE TO LOGIN")).click();
		driver.findElement(By.partialLinkText("Forgot Username")).click();
		
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(parentWindowId);
		
		for(String windowId : allWindowIds) {
			driver.switchTo().window(windowId);
		}
		
		driver.findElement(By.id("nextStep")).click();
		
		driver.findElement(By.name("userName")).sendKeys("SaykhedeMayur", Keys.ENTER);
		driver.findElement(By.name("accountNo")).sendKeys("6061626364", Keys.ENTER);
		driver.findElement(By.name("mobileNo")).sendKeys("7387985221", Keys.ENTER);
		driver.findElement(By.name("dob")).sendKeys("19/12/1997",Keys.ENTER);
		driver.findElement(By.name("Submit")).click();
	}

}
