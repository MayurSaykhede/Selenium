package FirstMock;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondQuestion
{
	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.name("field-keywords")).sendKeys("IPhone 15");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath(
				"//span[contains(text(),'iPhone 15 (128 GB) - Blue')]/../../../..//button[@id='a-autoid-4-announce']"))
				.click();
		String priceText = driver.findElement(By.xpath(
				"//span[contains(text(),'iPhone 15 (128 GB) - Blue')]/../../../..//span[@class='a-price-whole']"))
				.getText();
		System.out.println(priceText);
	}
}