package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAnElementUsingDependentAndIndependentElement {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Computers")).click();
		driver.findElement(By.partialLinkText("Desktops")).click();
		
		// in below xpath first we are identifying the independent element
		// and then we are moving toward Add to cart button (Dependent Element)
		driver.findElement(By.xpath("//a[text()='Simple Computer']/../..//input")).click();
	}

}
