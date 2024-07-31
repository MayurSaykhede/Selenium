package com.groupExecutionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AlluArjun_Test {
	
	@Test(groups = {"TFI", "Pan India"})
	public void alluArjun() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/alluarjunonline/?hl=en");
		Reporter.log("alluArjun", true);
		driver.quit();
	}

}
