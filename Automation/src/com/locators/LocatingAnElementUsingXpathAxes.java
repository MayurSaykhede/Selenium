package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAnElementUsingXpathAxes {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Mayur/Desktop/Selenium/HTML%20Codes/Axes.html");
		
		//parent 
		//String textParent = driver.findElement(By.xpath("//div[@class='Mammals']/parent::div").getText();
		//System.out.println("Parents : " + textParent);
		
		//child
		//String textChild = driver.findElement(By.xpath("//div[@class='Mammals']/child::div[@class='Carnivore']")).getText();
		//System.out.println("Childs : " + textChild);
		
		//ancestor
		//String textAncestor = driver.findElement(By.xpath("//div[@class='Mammals']/ancestor::div[@class='Animal']").getText();
		//System.out.println("Ancestor : " + textAncestor);
		
		//descendant
		//String textDescendant = driver.findElement(By.xpath("//div[@class='Mammals']/descendant::div[@class='Tiger']").getText();
		//System.out.println("Descendant : " + textDescendant);
		
		//preceding sibling 
		String textPrecedingSibling = driver.findElement(By.xpath("//div[@class='Mammals']/preceding-sibling::div[@class='Fish']")).getText();
		System.out.println("preceding sibling : " + textPrecedingSibling); 
		
		
		
		
		
		
	}

}
