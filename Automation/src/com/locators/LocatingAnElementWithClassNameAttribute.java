package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAnElementWithClassNameAttribute {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
	    driver.findElement(By.name("Email")).sendKeys("mayur3nda@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Mayur3nda@738"); 
		
		//finding elements using className()
		driver.findElement(By.className("login-button")).click();	
		
	}

}
