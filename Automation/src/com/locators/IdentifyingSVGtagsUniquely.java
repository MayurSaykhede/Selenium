package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyingSVGtagsUniquely {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.partialLinkText("Mobiles")).click();
		
		//Clicking on wishlist symbol/icon in flipkart
		driver.findElement(By.xpath("//a[text()='POCO M6 Pro 5G (Forest Green, 128 GB)']/../../..//*[name()='svg']")).click();
		
	}

}
