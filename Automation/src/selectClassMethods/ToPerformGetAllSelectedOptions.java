package selectClassMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToPerformGetAllSelectedOptions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapp.skillrary.com/");
		WebElement carsPriceDropDown = driver.findElement(By.id("cars"));

		Select select = new Select(carsPriceDropDown);
		List<WebElement> options = select.getOptions();

		for (WebElement option : options) {
			select.selectByValue(option.getAttribute("value"));
		}

		select.deselectByIndex(0);
		select.deselectByVisibleText("INR 100 - INR 199 ( 16 )");
		select.deselectByValue("399");

		List<WebElement> selectedOptions = select.getAllSelectedOptions();

		for (WebElement selectedOption : selectedOptions) {
			System.out.println(selectedOption.getText());
		}

	}

}
