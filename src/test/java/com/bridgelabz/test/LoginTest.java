package com.bridgelabz.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.pages.DashBoard;
import com.bridgelabz.pages.Login;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;

public class LoginTest extends Base {
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login Test for LinkedIn with valid credentials")
    @Test(priority = 1)
    public static void login() throws IOException, InterruptedException {
        Login login = new Login(driver);
        login.getLogin();
        System.out.println(driver.getTitle());
        String actualTitle = driver.getTitle();
        String expectedTitle = "Feed | LinkedIn";
        Assert.assertEquals(actualTitle,expectedTitle);
        System.out.println("Test is Passed");
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Uploaded file using AutoIT")
    @Test(priority = 2)
    public static void uploadFile() throws InterruptedException, IOException {
        DashBoard dashBoard = new DashBoard(driver);
        dashBoard.setUploadFile();
        System.out.println(driver.getTitle());
        String actualTitle = driver.getTitle();
        String expectedTitle = "Jobs | LinkedIn";
        System.out.println("Test is passed");
    }
}
