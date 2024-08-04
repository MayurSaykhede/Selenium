package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutLocatingLoginIntoDemoWebShop {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).
		sendKeys("mayur3nda@gmail.com", Keys.TAB, "Mayur3nda@738", Keys.ENTER);
	}

}
