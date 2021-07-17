package com.bridgelabz.pages;

import com.bridgelabz.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Login extends Base {
    public static WebDriver driver;

    @FindBy(xpath = "/html/body/nav/div/a[2]")
    public static WebElement signIn;

    @FindBy(xpath = "//input[@id = 'username']")
    public static WebElement userName;

    @FindBy(xpath = "//input[@id = 'password']")
    public static WebElement password;

    @FindBy(xpath = "//button[@class = 'btn__primary--large from__button--floating']")
    public static WebElement loginButton;

    public Login(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    public static void getLogin() throws IOException, InterruptedException {
        signIn.click();
        userName.sendKeys("gopirajsathwika1999@gmail.com");
        password.sendKeys("sathWIKA@20");
        loginButton.click();
    }
}
