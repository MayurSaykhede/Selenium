package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://demowebshop.tricentis.com/");
		//driver.findElement(By.id("small-searchterms")).sendKeys("Bottle",Keys.ENTER);
		
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("Dosa",Keys.ENTER);
	}

}
