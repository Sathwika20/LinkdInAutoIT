package com.bridgelabz.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.pages.DashBoard;
import com.bridgelabz.pages.Login;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest extends Base {
    @Test(priority = 1)
    public static void login() throws IOException, InterruptedException {
        Login login = new Login(driver);
        login.getLogin();
    }
    @Test(priority = 2)
    public static void uploadFile() throws InterruptedException, IOException {
        DashBoard dashBoard = new DashBoard(driver);
        dashBoard.setPhoto();
    }
}
