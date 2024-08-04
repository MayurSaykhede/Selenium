package FirstMock;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstQuestion {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Mayur/Downloads/Assessment1.html");
		driver.findElement(By.xpath("//button[text()=' Click Me !!!']")).click();
		
		
		Set<String> allWindowIds = driver.getWindowHandles();
		System.out.println(allWindowIds);
		
		for(String windowId : allWindowIds) {
			
			driver.switchTo().window(windowId);
			
			String title = driver.getTitle();
			System.out.println(title);		
			
			if(title.equals("BurgerKing India | Online ordering"))
			{
				driver.close();
				break;
			}
		}
		
	}

}
