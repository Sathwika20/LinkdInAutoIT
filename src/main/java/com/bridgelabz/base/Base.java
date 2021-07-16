package com.bridgelabz.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Base {
    public static WebDriver driver;
    @BeforeTest
    public void setUp() throws InterruptedException, IOException {
        //launches the chromedriver using Webdriver interface
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //Used to maximise the window
        driver.manage().window().maximize();
        //Enter the URL of Application
        driver.get("https://www.linkedin.com/");
        Thread.sleep(2000);
        try {
            URL url = new URL(driver.getCurrentUrl());
            Thread.sleep(1000);
            URLConnection connection = url.openConnection();
            connection.connect();
            System.out.println("Internet connected");
        } catch (MalformedURLException e) {
            System.out.println("Internet not connected");
        } catch (IOException e) {
            System.out.println("Internet not connected");
        } catch (InterruptedException e) {
            System.out.println("Internet not connected");
        }
    }
    //After execution
    @AfterTest
    public void tearDown() {
        //used to close the current window
        driver.quit();
    }

}
