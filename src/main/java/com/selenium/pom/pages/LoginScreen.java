package com.selenium.pom.pages;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginScreen {
    WebDriver driver;

    @CacheLookup
    @FindBy(name = "email")
    WebElement Email;

    @CacheLookup
    @FindBy(name = "pass")
    WebElement password;

    @CacheLookup
    @FindBy(name = "login")
    WebElement loginButton;

    public LoginScreen(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void loginInToTheFacebook() throws InterruptedException {
        Thread.sleep(1000);
        Email.sendKeys("testingtestdatablz@gmail.com");
        Thread.sleep(500);
        password.sendKeys("testing123");
        Thread.sleep(2000);
        loginButton.click();
        Thread.sleep(6000);
    }
}
