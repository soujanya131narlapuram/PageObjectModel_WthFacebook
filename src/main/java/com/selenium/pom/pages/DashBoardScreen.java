package com.selenium.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class DashBoardScreen {
    public  WebDriver driver;
    @FindBy(xpath="//span[contains(text(),'Photo/video')]")
    WebElement photoRvedio;
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
    WebElement addPhoto;

    public DashBoardScreen(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void photoUploading() throws InterruptedException, IOException {
        Thread.sleep(1000);
        photoRvedio.click();
        Thread.sleep(3000);
        addPhoto.click();
        Thread.sleep(6000);
        System.out.println("adding photos");
        Thread.sleep(1000);
        Runtime.getRuntime().exec("E:\\FileUploadingSelenium\\FacebookImageScipt.exe");
        System.out.println(" uploading the image successfully");
        Thread.sleep(2000);


    }


}
