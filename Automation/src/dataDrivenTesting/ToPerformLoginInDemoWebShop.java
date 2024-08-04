package dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformLoginInDemoWebShop {
	public static void main(String[] args) throws IOException {
		File f = new File(".\\test-data\\demoWebShop.properties"); // With the help of .(dot) we are using relative path 
		FileInputStream fis = new  FileInputStream(f);
		Properties prop = new Properties();
		prop.load(fis);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.id("Password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

}
