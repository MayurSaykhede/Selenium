package framesWorking;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformSwitchingToFrameWhenWeHaveMultipleFrames {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.speedtest.net/");
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		driver.switchTo().frame(1);
		driver.findElement(By.id("cbb")).click();
	}

}
