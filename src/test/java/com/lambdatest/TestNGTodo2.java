package com.lambdatest;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class TestNGTodo2 {

   // WebDriver driver;
    //private String Status = "failed";

    //@BeforeMethod
    //public void setup(Method m, ITestContext ctx) throws MalformedURLException {
        //System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Downloads/chromedriver_win32(1)");
        //WebDriver driver = new ChromeDriver();

    private WebDriver driver;

    @BeforeMethod
    public void setup(Method m, ITestContext ctx) throws MalformedURLException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    //}

    @Test
    public void basicTest() throws InterruptedException {
       // String spanText;
        System.out.println("Loading Url");

        driver.get("https://lambdatest.github.io/sample-todo-app/");

        System.out.println("Checking Box");
        driver.findElement(By.name("li1")).click();

        System.out.println("Checking Another Box");
        driver.findElement(By.name("li2")).click();

        System.out.println("Checking Box");
        driver.findElement(By.name("li3")).click();

        System.out.println("Checking Another Box");
        driver.findElement(By.name("li4")).click();

        driver.findElement(By.id("sampletodotext")).sendKeys(" List Item 6");
        driver.findElement(By.id("addbutton")).click();

        driver.findElement(By.id("sampletodotext")).sendKeys(" List Item 7");
        driver.findElement(By.id("addbutton")).click();

        driver.findElement(By.id("sampletodotext")).sendKeys(" List Item 8");
        driver.findElement(By.id("addbutton")).click();

        System.out.println("Checking Another Box");
        driver.findElement(By.name("li1")).click();

        System.out.println("Checking Another Box");
        driver.findElement(By.name("li3")).click();

        System.out.println("Checking Another Box");
        driver.findElement(By.name("li7")).click();

        System.out.println("Checking Another Box");
        driver.findElement(By.name("li8")).click();

        System.out.println("Entering Text");
        driver.findElement(By.id("sampletodotext")).sendKeys("Get Taste of Lambda and Stick to It");

        driver.findElement(By.id("addbutton")).click();

        System.out.println("Checking Another Box");
        driver.findElement(By.name("li9")).click();

        //Let's also assert that the todo we added is present in the list.

        String spanText = driver.findElement(By.xpath("//span[contains(text(),'Get Taste of Lambda and Stick to It')]")).getText();
        Assert.assertEquals("Get Taste of Lambda and Stick to It", spanText);
        String Status = "passed";
        System.out.println(Status);
        Thread.sleep(3000);

        System.out.println("TestFinished");

    }

    @AfterMethod
    public void tearDown() {
       // driver.quit();
    }

}