package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLogicalOrInXpathFlipkart {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		//Using 'OR' logical operator with the help text()/sub tag text
		driver.findElement(By.xpath("//span[text()='grocery' or text()='Mobiles']")).click();
	}

}
