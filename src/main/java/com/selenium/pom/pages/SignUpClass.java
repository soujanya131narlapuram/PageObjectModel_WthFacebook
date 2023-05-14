package com.selenium.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpClass {
   WebDriver driver;
    @CacheLookup
    @FindBy(linkText = "Create new account")
    WebElement newAccount;

    @CacheLookup
    @FindBy(name = "firstname")
    WebElement name;

    @CacheLookup
    @FindBy(name="lastname")
    WebElement lastName;
    @CacheLookup
    @FindBy(name= "reg_email__")
    WebElement mobileNumber;

    @CacheLookup
    @FindBy(id = "password_step_input")
    WebElement newPassword;

    @CacheLookup
    @FindBy(id = "day")
    WebElement dayDob;

    @CacheLookup
    @FindBy(id = "month")
    WebElement monthDob;

    @CacheLookup
    @FindBy(id = "year")
    WebElement yearDob;

    @CacheLookup
    @FindBy(xpath= "//label[contains(text(),'Female')]")
    WebElement femaleRadioBtn;

    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Male')]")
    WebElement maleRadioBtn;

    @CacheLookup
    @FindBy(xpath= "//label[contains(text(),'Custom')]")
    WebElement customRadioBtn;

    @CacheLookup
    @FindBy(xpath="//select[@id='js_er']")
    WebElement selectPronoun;

    @CacheLookup
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[8]/div[3]/div[1]/input[1]")
    WebElement gender;

    @CacheLookup
    @FindBy(name = "websubmit")
    WebElement signUpBtn;


    public SignUpClass(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void signUpPerforming() throws InterruptedException {
        Thread.sleep(500);
        newAccount.click();
        Thread.sleep(1000);
        name.sendKeys("mikal");
        lastName.sendKeys("tester");
        mobileNumber.sendKeys("9872971895");
        newPassword.sendKeys("testing123");
        Thread.sleep(2000);
        Select selectDay = new Select(dayDob);
        selectDay.selectByValue("1");
        Select selectMonth = new Select(monthDob);
        selectMonth.selectByValue("3");
        Select selectYear = new Select(yearDob);
        selectYear.selectByVisibleText("2001");
        Thread.sleep(1000);
       boolean sel = femaleRadioBtn.isDisplayed();

       // performing click operation if element is displayed
        if (sel == true) {
        femaleRadioBtn.click();
        }
        boolean select =customRadioBtn.isSelected();
        System.out.print(select);
        // performing click operation if element is not already selected
        if (select == false) {
         customRadioBtn.click();
        }

        boolean selectNo = maleRadioBtn.isDisplayed();

        // performing click operation if element is enabled
        if (selectNo == true) {
        maleRadioBtn.click();
        }
        Thread.sleep(3000);
//        Select se = new Select(selectPronoun);
//        selectDay.selectByValue("0");
//
//        gender.sendKeys("male");
//        Thread.sleep(3000);
        signUpBtn.click();
        Thread.sleep(5000);

    }
}

