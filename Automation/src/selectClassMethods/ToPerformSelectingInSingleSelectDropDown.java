package selectClassMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToPerformSelectingInSingleSelectDropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://ww.facebook.com/signup");
		WebElement monthDropDown = driver.findElement(By.id("month"));
		
		Select select = new Select(monthDropDown);
		List<WebElement> options = select.getOptions();
		
		// It will give a total objects present inside a list<WebElement>
		System.out.println(options.size()); 
		
		for(WebElement option : options) {
			//select.selectByVisibleText(option.getText());
			//System.out.println(option.getAttribute("value"));
			select.selectByValue(option.getAttribute("value"));
		}
		
	}

}
