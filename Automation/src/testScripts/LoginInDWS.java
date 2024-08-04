package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class LoginInDWS {

	@Test
	public void loginScenario() {
		String expectedTitle = "Demo Web Shop:";
		String expectedLoginPageTitle = "Demo Web Shop. Login:";
		SoftAssert softassert = new SoftAssert();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		String actualTitle = driver.getTitle();
		softassert.assertEquals(actualTitle, expectedTitle, "title verification at Welcome Page");
		driver.findElement(By.partialLinkText("Log in")).click();
		String actualLoginPageTitle = driver.getTitle();
		softassert.assertEquals(actualLoginPageTitle, expectedLoginPageTitle, "titile verification at Login Page");
		driver.findElement(By.id("Email")).sendKeys("mayur3nda@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Mayur3nda@738");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		softassert.assertAll();
		
	}

}
