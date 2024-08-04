package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.Scanner;

public class LaunchBrowser {
	
	static WebDriver driver ; // Global Variable

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name");
        String name = sc.nextLine();
        
        if(name.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (name.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (name.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("The browser name is invalid.");
        }

        // You can add further code here to use the 'driver' variable
        // For example: driver.get("https://www.example.com");

        // Close the scanner and quit the WebDriver
        sc.close();
        if (driver != null) {
            driver.quit();
        }
    }
}
