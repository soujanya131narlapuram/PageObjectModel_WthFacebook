package com.selenium.pageobjectmodel.test;
import  com.selenium.pom.baseclass.BaseClass;
import com.selenium.pom.pages.*;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class FacebookPomTest extends BaseClass{
    LoginScreen loginScreen;
    //SignUpClass signup;
    DashBoardScreen dashBoardScreen;

    @BeforeTest
    public void init() {
        setup();
        loginScreen=new LoginScreen(driver);
        //signup=new SignUpClass(driver);
        dashBoardScreen=new DashBoardScreen(driver);

    }
    @Test
    @Epic("Facebook Application:log in")
    @Story("Login in to facebook")
    @Severity(SeverityLevel.CRITICAL)
    public void faceBkLoginTest_Success() throws InterruptedException, IOException {
        loginScreen.loginInToTheFacebook();
        //signup.signUpPerforming();
        Actions action=new Actions(driver);
        action.sendKeys(Keys.ESCAPE).build().perform();
        dashBoardScreen.photoUploading();


    }

@AfterTest
    public void clearBrowser(){
        tearDown();
}
    }
