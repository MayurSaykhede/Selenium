package com.locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAnElementUsingXPath {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");

}
}
