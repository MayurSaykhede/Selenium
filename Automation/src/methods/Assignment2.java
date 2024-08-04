package methods;

import java.util.HashSet;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {

		// Initialize the Chrome driver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Launch the web application
		driver.get("https://www.yamaha-motor-india.com");
		String parentWindowTitle = driver.getTitle();
		System.out.println("Parent Window Title: " + parentWindowTitle);

		// Open a new window and navigate to a different URL
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://cadburygifting.in/");
		String title2 = driver.getTitle();
		System.out.println("New Window Title: " + title2);

		// Open a new tab and navigate to a different URL
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.fb.com/");
		String title3 = driver.getTitle();
		System.out.println("New Tab Title: " + title3);

		// Create a HashSet to store window titles
		Set<String> titles = new HashSet<>();
		titles.add(parentWindowTitle);
		titles.add(title2);
		titles.add(title3);

		// Close the window with the title matching the parent window title
		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
			if (driver.getTitle().equals(parentWindowTitle)) {
				driver.close();
				System.out.println("Closed the window with title: " + parentWindowTitle);
				break;
			}
		}

		// Close the driver
		driver.quit();
	}
}
