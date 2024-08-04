//Print the non selected options in multi select dropdown

package Assesments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDownTask {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		WebElement multiDropDown = driver.findElement(By.id("cars"));

		Select select = new Select(multiDropDown);
		List<WebElement> options = select.getOptions();

		for (WebElement option : options) {
			select.selectByValue(option.getAttribute("value"));
			System.out.println("All Options : " + option.getText());
		}

		Thread.sleep(3000);
		select.deselectByValue("90");
		Thread.sleep(3000);
		select.deselectByIndex(2);
		Thread.sleep(3000);
		select.deselectByVisibleText("INR 300 - INR 399 ( 1 )");

		List<WebElement> selectedOptions = select.getAllSelectedOptions();
		for (WebElement selectedOption : selectedOptions) {
			System.out.println("Selected Options : " + selectedOption.getText());
		}

		options.removeAll(selectedOptions); // to remove same type of objects 

		for (WebElement option : options) {
			System.out.println("Not selected options : " + option.getText());

		}

	}

}
