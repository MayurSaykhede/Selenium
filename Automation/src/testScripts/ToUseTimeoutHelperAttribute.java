package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToUseTimeoutHelperAttribute {
	
	@Test(timeOut = 8000)
	public void continentalGT650() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.royalenfield.com/in/en/motorcycles/continental-gt/");
		driver.quit();
	}
}
