package com.finalMock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Task1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions setting = new ChromeOptions();
		setting.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(setting);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.purplle.com/");
		driver.findElement(By.xpath("//input[@type='search']")).click();
		WebElement searchBox = driver.findElement(By.xpath("//label[.='Search for Products and Brands']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(searchBox).sendKeys("facewash men", Keys.ENTER).perform();
		WebElement ele = driver.findElement(By.xpath("//div[contains(text(),'Mamaearth Ubtan Natural Face Wash For all Skin Type with Turmeric & Saffron for Tan Removal (150 ml) ')]/../../../..//a[contains(text(),' Add to Cart ')]"));	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele);
		
		
		
	}

}
