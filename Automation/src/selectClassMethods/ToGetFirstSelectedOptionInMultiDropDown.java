package selectClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToGetFirstSelectedOptionInMultiDropDown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapp.skillrary.com/");
		WebElement multiDropDown = driver.findElement(By.id("cars"));
		
		Select select = new Select(multiDropDown);
		select.selectByIndex(2);
		select.selectByIndex(4);
		select.selectByIndex(0);
		System.out.println(select.getFirstSelectedOption().getText());
		
		/* getFirstSelectedOption() : WebElement
		 * getFirstSelectedOption() will take a dropdown and search from 
		 * top to bottom and which one selected option comes first, 
		 * it will give that option as an output.*/
		
	}

}
