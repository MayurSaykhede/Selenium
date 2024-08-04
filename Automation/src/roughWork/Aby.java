package roughWork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aby {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://basketball.exposureevents.com/widgets/intermediate?url=https%3A%2F%2Fbasketball.exposureevents.com%2Fwidgets%2Fv1%2Fgames%3Feventid%3D222375%26responsive%3Dtrue&xdm_e=https%3A%2F%2F3ssbcircuit.info&xdm_c=default5274&xdm_p=1");
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector(".bg-dark:nth-child(1) > .fa")).click();
	}

}
