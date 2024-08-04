package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyingRadioButtonIsSelectedOrNot {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		WebElement maleRadioButton = driver.findElement(By.id("gender-male"));
		if (maleRadioButton.isSelected()) {
			System.out.println("It is selected");
		}else {
			System.out.println("Now selecting");
			maleRadioButton.click();
		}
		
		driver.findElement(By.partialLinkText("Log in")).click();
		WebElement rememberMeCheckBox = driver.findElement(By.id("RememberMe"));
		
		System.out.println(rememberMeCheckBox.isSelected());
	}

}
