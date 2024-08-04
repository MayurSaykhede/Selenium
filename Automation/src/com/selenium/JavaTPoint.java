package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class JavaTPoint {
	
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
		}else {
			Reporter.log("invalid browser name");
		}
		driver.manage().window().maximize();
		driver.get("https://www.javatpoint.com/");
		driver.quit();

	}
}
