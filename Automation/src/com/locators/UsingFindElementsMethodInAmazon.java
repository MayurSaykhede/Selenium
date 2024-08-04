package com.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingFindElementsMethodInAmazon {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 15");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		List<WebElement> allPricesElements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		for(WebElement priceEle : allPricesElements) {
			System.out.println(priceEle.getText());
		}
		}
	}

