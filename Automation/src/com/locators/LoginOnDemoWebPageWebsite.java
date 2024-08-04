package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginOnDemoWebPageWebsite {
	
	public static void main(String[] args) {
		
		// I am Log in on "Demo Web Shop" website  
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		
		WebElement emailTextField = driver.findElement(By.name("Email"));
		emailTextField.sendKeys("mayur3nda@gmail.com");
		
		WebElement passwordTextField = driver.findElement(By.name("Password"));
		passwordTextField.sendKeys("Mayur3nda@738");
		
		// With the help of cssSelector() we can find & click on Log in button 
		WebElement loginButton = driver.findElement(By.cssSelector("input[value='Log in']"));
		loginButton.click();
		
	}

}
