package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// to launch the web application
		driver.get("https://www.swiggy.com/");

		String actualTitle = driver.getTitle();
		// System.out.println(actualTitle);

		String expectedTitle = "Order Food Online from India's Best Food Delivery Service | Swiggy";

		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title is correct");
		} else {
			System.out.println("Title is wrong");
		}

	}

}
