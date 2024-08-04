package methods;

import java.util.Set;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
    
    public static void main(String[] args) {
        
        // Initialize the Chrome driver
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        // Launch the web application
        driver.get("https://www.yamaha-motor-india.com");
        
        // Get the parent window id
        String parentWindowId = driver.getWindowHandle();
        System.out.println("Parent Window ID: " + parentWindowId);
        
        // Open a new window and navigate to a different URL
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://cadburygifting.in/");
        String newWindowId = driver.getWindowHandle();
        System.out.println("New Window ID: " + newWindowId);
        
        // Open a new tab and navigate to a different URL
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.nestle.in/");
        String newTabId = driver.getWindowHandle();
        System.out.println("New Tab ID: " + newTabId);
        
        // Get IDs of all open tabs/windows
        Set<String> allWindowIds = driver.getWindowHandles();
        System.out.println("All Window IDs: " + allWindowIds);
        
        // Iterate through the window IDs
        for (String windowId : allWindowIds) {
            try {
                // Wait for 5 seconds
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            driver.switchTo().window(windowId);
            // If it's the parent window, continue to the next window ID
            if (windowId.equals(parentWindowId)) {
                continue;
            } else {
                // Close the current window
                driver.close();
            }
        }
        
        // Quit the driver
        driver.quit();
    }
}
