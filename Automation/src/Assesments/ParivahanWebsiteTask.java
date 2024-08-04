/**Assesment 2 :- 
 * parivahan.gov.in ->
 * site map -> 
 * NR services link -> 
 * contact us ->
 * new tab -> login
 */

package Assesments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParivahanWebsiteTask {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://parivahan.gov.in/parivahan/");
		String parentWindowId = driver.getWindowHandle();

		driver.findElement(By.linkText("Sitemap")).click();
		driver.findElement(By.linkText("NR Services")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
		}
		
		driver.findElement(By.xpath("//a[@id='contact']")).click();

		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(parentWindowId);

		for (String windowId : allWindowIds) {
			driver.switchTo().window(windowId);
		}

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
		}
		driver.findElement(By.linkText("Login")).click();

	}

}
