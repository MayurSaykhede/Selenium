package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAnElementWithTagName {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("mayur3nda@gmail.com",Keys.ENTER);
		driver.findElement(By.id("passContainer")).sendKeys("Xyz",Keys.ENTER);
		
		//Locating an element with the help of tag name 
		driver.findElement(By.tagName("button")).click();
	}
	
}
