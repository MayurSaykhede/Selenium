package framesWorking;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformSwitchingToFrameInDream11 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.dream11.com/"); 
		WebElement frame = driver.findElement(By.id("send-sms-iframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("regEmail")).sendKeys("7387985221", Keys.ENTER);
		
	}

}
