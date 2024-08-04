package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingColourAndTextOfErrorMsg {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("Admin", Keys.TAB);
		WebElement errormsg = driver.findElement(By.xpath("//span[@data-valmsg-for='Email']"));
		System.out.println(errormsg.getText());
		System.out.println(errormsg.getCssValue("color"));  
		
	}
}
