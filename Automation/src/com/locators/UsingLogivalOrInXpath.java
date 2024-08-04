package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLogivalOrInXpath {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		
		//Using 'OR' logical operator with the help of attribute
		driver.findElement(By.xpath("//input[@id='gender-male' or @id='gender-female']")).click();
	}

}
