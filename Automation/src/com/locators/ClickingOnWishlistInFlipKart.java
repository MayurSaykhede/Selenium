package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickingOnWishlistInFlipKart {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("Iphone 15", Keys.ENTER);
		
		//Clicking on wishlist icon/symbol (i.e. svg tag)
		//driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']/../../..//*[name()='svg']")).click();
		
		//Clicking on price tagtext 
		String priceText = driver.findElement(By.xpath("(//div[text()='Apple iPhone 15 (Black, 128 GB)']/../..//div[contains(text(),'₹')])[1]")).getText();
		System.out.println("Price is : " + priceText);
	}

}
