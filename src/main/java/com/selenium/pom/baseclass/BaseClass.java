package com.selenium.pom.baseclass;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BaseClass {

    public static Logger log = Logger.getLogger(BaseClass.class.getName());
    public WebDriver driver;
    public ExtentReports reports;
    public ExtentTest test;

    public void setup(){
        PropertyConfigurator.configure("C:\\Users\\ANIL\\AppData\\Local\\Temp\\PageObjectModel_Selenium\\target\\log4j.properties");
        BasicConfigurator.configure();
        ChromeOptions ops=new ChromeOptions();
        ops.addArguments("--disable-notifications");
        driver=new ChromeDriver(ops);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        log.info("logger has been started logging");
        reports=new ExtentReports("C:\\Users\\ANIL\\AppData\\Local\\Temp\\PageObjectModel_Selenium\\src\\main\\java\\ExtentReport.html");
        test=reports.startTest("Extent reports");
    }
    public void tearDown(){
        driver.close();
        log.info("Browser closed");
        reports.endTest(test);
        reports.flush();
    }
}
