package batchExecutionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Continental {
	
	@Test
	public void continentalGT650() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.royalenfield.com/in/en/motorcycles/continental-gt/");
		Reporter.log("continentalGT650", true);
		driver.quit();
		
	}

}
