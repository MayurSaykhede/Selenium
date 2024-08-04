package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToUseDependencyMethodOnBike {
	
	@Test
	public void continentalGT650() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.royalenfield.com/in/en/motorcycles/continental-gt/");
		driver.quit();
	}
	
	@Test(dependsOnMethods = {"continentalGT650", "hayabusa"})
	public void harleyDavidson() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.harley-davidson.com/in/en/index.html");
		driver.quit();
	}

	@Test
	public void hayabusa() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.suzukimotorcycle.co.in/product-details/hayabusa");
		driver.quit();
	}

}
