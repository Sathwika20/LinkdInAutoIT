package com.bridgelabz.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.pages.Login;
import com.bridgelabz.utils.UploadFile;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class UploadFileTest extends Base {
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
    @Test(priority = 2)
    public void upload_file_using_robot_class() throws AWTException, InterruptedException {
        UploadFile file = new UploadFile(driver);
        file.uploadFile();
        System.out.println(driver.getTitle());
        String actualTitle = driver.getTitle();
        String expectedTitle = "Jobs | LinkedIn";
        Assert.assertEquals(actualTitle,expectedTitle);
        System.out.println("Test is Passed");
    }
}
