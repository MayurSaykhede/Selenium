package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAnElementWithcssSelector {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("mayur3nda@gmail.com", Keys.ENTER);
		driver.findElement(By.name("pass")).sendKeys("Xyz", Keys.ENTER);
		driver.findElement(By.cssSelector("button[data-testid='royal_login_button']")).click();
	}

}
