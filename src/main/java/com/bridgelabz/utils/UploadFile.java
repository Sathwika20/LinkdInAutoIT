package com.bridgelabz.utils;

import com.bridgelabz.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class UploadFile extends Base {

    @FindBy(xpath = "//*[@id=\"global-nav\"]/div/nav/ul/li[3]")
    public static WebElement jobs;

    @FindBy(xpath = "//*[@id=\"careers\"]/div[3]/div/div/div/div/div/div[1]/nav/div[1]/ul/li[6]")
    public static WebElement resumeBuilder;

    @FindBy(xpath = "//label[@class = 'artdeco-button m0 resume-builder-resume-list-modal__upload-label']")
    public static WebElement uploadFile;

    public UploadFile(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public static void uploadFile() throws AWTException, InterruptedException {
        jobs.click();
        Thread.sleep(5000);
        resumeBuilder.click();
        Thread.sleep(5000);
        uploadFile.click();
        Thread.sleep(5000);

        Robot robot = new Robot();
        StringSelection string = new StringSelection("C:\\Users\\gopir\\SathwikaResume.docx");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(string,null);

        robot.setAutoDelay(2000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }
}

