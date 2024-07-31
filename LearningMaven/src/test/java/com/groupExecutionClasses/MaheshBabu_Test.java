package com.groupExecutionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MaheshBabu_Test {
	
	@Test(groups = "TFI")
	public void maheshBabu() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/urstrulymahesh/?hl=en");
		Reporter.log("maheshBabu", true);
		driver.quit();
	}

}
