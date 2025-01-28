package com.lambdatest.test2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testing2 {

    public static void main(String[] args) {
        // Automatically set up ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open a website to verify
        driver.get("https://www.google.com");

        // Close the driver
        driver.quit();
    }
}
