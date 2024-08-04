package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LaunchBrowserWithoutScanner {
	
	@Parameters("bname")
	@Test
	public void bmw(@Optional("chrome") String browsername) {
		WebDriver driver = null;
		if (browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}else if(browsername.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver(); 
		}
		driver.manage().window().maximize();
		driver.get("https://www.bmw.com/en/index.html");
		driver.quit();

	}

}
