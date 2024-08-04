package roughWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class BasketballScraperTest {
	private WebDriver driver;
	private String rootWindowHandle;
	private Set<String> windowHandlesBefore;

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	private String waitForNewWindow() {
		Set<String> windowHandlesAfter;
		do {
			windowHandlesAfter = driver.getWindowHandles();
		} while (windowHandlesAfter.size() <= windowHandlesBefore.size());
		windowHandlesAfter.removeAll(windowHandlesBefore);
		return windowHandlesAfter.iterator().next();
	}

	@Test
	public void testScrapeBasketballSite() {
		driver.get(
				"https://basketball.exposureevents.com/widgets/intermediate?url=https%3A%2F%2Fbasketball.exposureevents.com%2Fwidgets%2Fv1%2Fgames%3Feventid%3D222375%26responsive%3Dtrue&xdm_e=https%3A%2F%2F3ssbcircuit.info&xdm_c=default5274&xdm_p=1");
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector(".bg-dark:nth-child(1) > .fa")).click();

		Actions actions = new Actions(driver);
		WebElement element = driver
				.findElement(By.cssSelector(".row:nth-child(2) > .col-12:nth-child(1) .btn:nth-child(2) > .fa"));
		actions.moveToElement(element).perform();
		actions.moveToElement(driver.findElement(By.cssSelector("body")), 0, 0).perform();

		element = driver
				.findElement(By.cssSelector(".row:nth-child(2) > .col-12:nth-child(1) .btn:nth-child(3) > .fa"));
		actions.moveToElement(element).perform();
		actions.moveToElement(driver.findElement(By.cssSelector("body")), 0, 0).perform();

		element = driver
				.findElement(By.cssSelector(".row:nth-child(2) > .col-12:nth-child(1) .btn:nth-child(4) > span"));
		actions.moveToElement(element).perform();
		actions.moveToElement(driver.findElement(By.cssSelector("body")), 0, 0).perform();

		element = driver.findElement(By.cssSelector(".row:nth-child(2) > .col-12:nth-child(2) .btn:nth-child(4)"));
		actions.moveToElement(element).perform();
		actions.moveToElement(driver.findElement(By.cssSelector("body")), 0, 0).perform();

		windowHandlesBefore = driver.getWindowHandles();
		driver.findElement(By.cssSelector(".row:nth-child(2) > .col-12:nth-child(2) .btn:nth-child(4) > span")).click();
		String newWindowHandle = waitForNewWindow();

		rootWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(newWindowHandle);
		driver.switchTo().window(rootWindowHandle);
		driver.switchTo().frame(0);

		element = driver.findElement(By.cssSelector(".row:nth-child(2) > .col-12:nth-child(2) .btn:nth-child(2)"));
		actions.moveToElement(element).perform();
		actions.moveToElement(driver.findElement(By.cssSelector("body")), 0, 0).perform();

		driver.findElement(By.id("Criteria_DivisionId")).click();
		driver.findElement(By.id("Criteria_SortBy")).click();
		WebElement dropdown = driver.findElement(By.id("Criteria_SortBy"));
		dropdown.findElement(By.xpath("//option[. = 'Location']")).click();

		driver.findElement(By.id("Criteria_VenueCourtId")).click();
		dropdown = driver.findElement(By.id("Criteria_VenueCourtId"));
		dropdown.findElement(By.xpath("//option[. = 'Legends Event Center (3)']")).click();

		element = driver.findElement(By.linkText("PDF"));
		actions.moveToElement(element).perform();
		actions.moveToElement(driver.findElement(By.cssSelector("body")), 0, 0).perform();

		windowHandlesBefore = driver.getWindowHandles();
		driver.findElement(By.cssSelector(".tooltip-init > span")).click();
		newWindowHandle = waitForNewWindow();

		driver.switchTo().window(newWindowHandle);
		driver.switchTo().window(rootWindowHandle);
		driver.switchTo().frame(0);

		element = driver.findElement(By.cssSelector(".row:nth-child(2) > .col-12:nth-child(5) .btn:nth-child(2)"));
		actions.moveToElement(element).perform();
		actions.moveToElement(driver.findElement(By.cssSelector("body")), 0, 0).perform();
	}
}