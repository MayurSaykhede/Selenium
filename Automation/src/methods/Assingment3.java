package methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		org.openqa.selenium.chrome.ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// to launch the web application
		driver.get("https://www.yamaha-motor-india.com/");
		
		// to open new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://cadburygifting.in/");
		
	    // to change the size of current window
		driver.manage().window().setSize(new Dimension(100,500));
		
	    // to change the position of current window
		driver.manage().window().setPosition(new Point(150,300));
		
		Thread.sleep(5000);
		driver.quit();

		
		
		
		
		
		
		
		
	}

}
