package dataDrivenTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import framework.ExcelUtility;

public class ToRegisterInDemoWebShop {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		String sheetName = "RegisterCredentials";
		String firstName = ExcelUtility.readDataFromExcel(sheetName, 1, 0);
		String lastName = ExcelUtility.readDataFromExcel(sheetName, 1, 1);
		String email = ExcelUtility.readDataFromExcel(sheetName, 1, 2);
		String password = ExcelUtility.readDataFromExcel(sheetName, 1, 3);
		String confirmPassword = ExcelUtility.readDataFromExcel(sheetName, 1, 3);
		
		driver.findElement(By.partialLinkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(firstName);
		driver.findElement(By.id("LastName")).sendKeys(lastName);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmPassword);
		driver.findElement(By.id("register-button")).click();
	}

}
