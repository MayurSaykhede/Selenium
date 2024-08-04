package selectClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectByIndex {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/signup");
		WebElement monthDropDown = driver.findElement(By.id("month"));

		Select select = new Select(monthDropDown);

		select.selectByIndex(11);// selectByIndex()
		select.selectByValue("1"); // selectByValue()
		select.selectByVisibleText("Apr"); // selectByVisibleText()

		System.out.println(select.isMultiple());

	}

}
