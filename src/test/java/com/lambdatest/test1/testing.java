package com.lambdatest.test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testing {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open a website to verify it works
        driver.get("https://www.google.com");

        // Close the driver
        driver.quit();
    }
}
