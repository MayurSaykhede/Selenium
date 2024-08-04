package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAnElementWithIdAttribute {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://demowebshop.tricentis.com/login");
		//WebElement emailTextBox = driver.findElement(By.id("Email"));
		//emailTextBox.sendKeys("mayur3nda@gmail.com");
		
		driver.get("https://www.facebook.com/");
		WebElement emailTextBox = driver.findElement(By.id("email"));
		WebElement passwordTextBox = driver.findElement(By.id("pass"));
		emailTextBox.sendKeys("mayur3nda@gmail.com");
		passwordTextBox.sendKeys("Xyz");
	}

}
