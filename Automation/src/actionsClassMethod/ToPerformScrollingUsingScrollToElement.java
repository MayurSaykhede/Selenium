package actionsClassMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformScrollingUsingScrollToElement {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Actions actions = new Actions(driver);
		WebElement resumeWritingLink = driver.findElement(By.xpath("//span[text()='Resume writing']"));
		actions.scrollToElement(resumeWritingLink).perform();
		
	}

}
