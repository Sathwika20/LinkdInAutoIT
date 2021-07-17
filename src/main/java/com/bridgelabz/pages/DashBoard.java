package com.bridgelabz.pages;

import com.bridgelabz.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;

public class DashBoard extends Base {
    @FindBy(xpath = "//*[@id=\"global-nav\"]/div/nav/ul/li[3]")
    WebElement jobs;

    @FindBy(xpath = "//*[@id=\"careers\"]/div[3]/div/div/div/div/div/div[1]/nav/div[1]/ul/li[6]")
    WebElement resumeBuilder;

    @FindBy(xpath = "//label[@class = 'artdeco-button m0 resume-builder-resume-list-modal__upload-label']")
    WebElement uploadFile;

    public DashBoard(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void setUploadFile() throws InterruptedException, IOException {
        jobs.click();
        Thread.sleep(5000);
        resumeBuilder.click();
        Thread.sleep(5000);
        uploadFile.click();
        Thread.sleep(5000);
        Runtime.getRuntime().exec("C:\\Users\\gopir\\OneDrive\\Desktop\\FileUploadScript.exe");
        Thread.sleep(5000);
    }
}



