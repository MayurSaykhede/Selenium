package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingPriceInAmazon {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.name("field-keywords")).sendKeys("Iphone 15", Keys.ENTER);
		String text = driver.findElement(By.xpath("//span[text()='iPhone 15 (128 GB) - Pink']/../../../..//span[@class='a-price-whole']")).getText();
		System.out.println(text);                  //tagname[text()=tagtext]
	}

}
