package batchExecutionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HarleyDavidson {
	
	@Test
	public void harleyDavidson() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.harley-davidson.com/in/en/index.html");
		Reporter.log("harleyDavidson", true);
		driver.quit();
	}
	
	@Test
	public void jawa() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jawamotorcycles.com/");
		Reporter.log("jawa", true);
		driver.quit();
	}

}
