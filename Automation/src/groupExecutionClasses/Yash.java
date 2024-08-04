package groupExecutionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Yash {
	
	
	@Test(groups = {"KFI", "Pan India"})
	public void yash() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/thenameisyash/?hl=en");
		Reporter.log("yash", true);
		driver.quit();
	}

}
