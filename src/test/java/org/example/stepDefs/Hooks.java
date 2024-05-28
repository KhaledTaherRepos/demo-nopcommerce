package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    // declare to the WebDriver object on the level of the class

    public static WebDriver driver;

    @Before
    public static void openBrowser()
    {
        // 1-Bridge Between your code and browser using WebdriverManager dependency
        //WebDriverManager.chromedriver().setup();

        // 2 Create new object from chromeDriver
        driver = new ChromeDriver();

        // 3 Configuration to the browser
        //3.1 maximize
        driver.manage().window().maximize();

        //3.2 set implicit wait
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        //4 Navigate to the website
        driver.navigate().to("https://demo.nopcommerce.com/");

    }

    @After
    public static void quitDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();

    }



}
