package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAnElementUsingContains {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.amazon.in/b?node=1389401031");
		
		//Using contains with the help of attribute
		//driver.findElement(By.xpath("//img[contains(@alt,'Redmi')]")).click();
			
		driver.get("https://demowebshop.tricentis.com/register");
		//Using contains with the help of text()
		driver.findElement(By.xpath("//a[contains(text(),'Electro')]")).click();
	}

}

