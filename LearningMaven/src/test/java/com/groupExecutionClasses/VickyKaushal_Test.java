package com.groupExecutionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VickyKaushal_Test {
	
	@Test(groups = "Bollywood")
	public void vickyKaushal() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/vickykaushal09/?hl=en");
		Reporter.log("vickyKaushal", true);
		driver.quit();
	}
	

}
