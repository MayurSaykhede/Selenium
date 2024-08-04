package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAnElementWithNameAttribute {
	
	public static void main(String[] args) throws InterruptedException {
		
		// I am creating/registering a account on "Demo Web Shop" website  
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		WebElement maleRadioButton = driver.findElement(By.name("Gender"));
		maleRadioButton.click();
		//Thread.sleep(5000);
		//WebElement femaleRadioButton = driver.findElement(By.name("Gender"));
		//femaleRadioButton.click();
		WebElement firstName = driver.findElement(By.name("FirstName"));
		firstName.sendKeys("Mayur");
		WebElement lastName = driver.findElement(By.name("LastName"));
		lastName.sendKeys("Saykhede");
		WebElement emailTextField = driver.findElement(By.name("Email"));
		emailTextField.sendKeys("mayur3nda@gmail.com");
		WebElement passwordTextField = driver.findElement(By.name("Password"));
		passwordTextField.sendKeys("Mayur3nda@738");
		WebElement confirmPasswordTextField = driver.findElement(By.name("ConfirmPassword"));
		confirmPasswordTextField.sendKeys("Mayur3nda@738");
		WebElement registerButton = driver.findElement(By.name("register-button"));
		registerButton.click();
		
	}

}
