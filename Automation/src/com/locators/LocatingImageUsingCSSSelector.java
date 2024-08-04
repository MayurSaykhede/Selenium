package com.locators;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingImageUsingCSSSelector {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// We are using this method because elements are taking time to load
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone 15", Keys.ENTER);
		//driver.findElement(By.partialLinkText("Mobiles"));
		//Thread.sleep(5000);
		driver.findElement(By.cssSelector("img[alt='Apple iPhone 15 (Black, 128 GB)']")).click();
		
	}
}
