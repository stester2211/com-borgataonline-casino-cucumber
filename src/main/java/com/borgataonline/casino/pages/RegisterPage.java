package com.borgataonline.casino.pages;

import com.borgataonline.casino.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RegisterPage extends Utility
{
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage()
    {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@type='email']")
    WebElement enterEmailId;

    @CacheLookup
    @FindBy(xpath = "//input[@id='focusPassword']")
    WebElement enterPassword;

    @CacheLookup
    @FindBy(xpath = "//div[@class='ui-tab step-one ui-widget-padding current']//div[@class='btn-area no-padding my-1']//div//button[@id='continue']")
    WebElement clickOnContinue;

    @CacheLookup
    @FindBy(xpath = "//div[@id='reg-gender']")
    List<WebElement> clickOnGender;
    @CacheLookup
    @FindBy(xpath = "//input[@name='firstname']")
    WebElement enterFirstName;

    @CacheLookup
    @FindBy(xpath = "//input[@name='lastname']")
    WebElement enterLastName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='idcardsugar']")
    WebElement enterSSNCard;

    @CacheLookup
    @FindBy(xpath = "//select[@name='month']")
    WebElement selectMonth;

    @CacheLookup
    @FindBy(xpath = "//input[@name='day']")
    WebElement selectDay;

    @CacheLookup
    @FindBy(xpath = "//input[@name='year']")
    WebElement selectYear;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Enter address manually']")
    WebElement clickOnEnterAddress;

    @CacheLookup
    @FindBy(xpath = "//input[@name='addressline1']")
    WebElement enterAddress;

    @CacheLookup
    @FindBy(xpath = "//input[@name='addresscity']")
    WebElement enterCity;

    @CacheLookup
    @FindBy(xpath = "//select[@name='addressstate']")
    WebElement selectState;

    @CacheLookup
    @FindBy(xpath = "//input[@name='addresszip']")
    WebElement enterZipCode;

    @CacheLookup
    @FindBy(xpath = "//input[@name='mobilenumber']")
    WebElement enterMobileNumber;

    @CacheLookup
    @FindBy(xpath = "//label[@id='grprTacTrack']")
    WebElement clickOnAgeCheckBox;

    @CacheLookup
    @FindBy(xpath = "//label[@id='usnjSportsTacTrack']")
    WebElement clickOnAcknowledgeCheckBox;

    @CacheLookup
    @FindBy(xpath = "//label[@id='privacyNoticeLink']")
    WebElement clickOnPrivacyCheckBox;

    @CacheLookup
    @FindBy(xpath = "//button[@id='submit']")
    WebElement clickOnCreateMyAccount;

    @CacheLookup
    @FindBy(xpath = "//div[@class='cms-container']")
    WebElement verifyMessage;

    public void enterEmailAddress(String email)
    {
        sendTextToElement(enterEmailId,email);
        log.info("Enter email address"+enterEmailId.toString());
    }
    public void enterPassword(String password)
    {
        sendTextToElement(enterPassword,password);
        log.info("Enter password address"+enterPassword.toString());
    }
    public void clickOnContinueButton()
    {
        clickOnElement(clickOnContinue);
        log.info("Click on continue button"+clickOnContinue.toString());
    }

    public void clickOnGenderButton(String gender)
    {
        for (WebElement genderElement : clickOnGender) {
            if (genderElement.getText().contains(gender)) {
                clickOnElement(genderElement);
                break;
            }
        }
        log.info("select gender"+ clickOnGender.toString());
    }

    public void enterFirstName(String fname)
    {
        sendTextToElement(enterFirstName,fname);
        log.info("Enter firstName"+ enterFirstName.toString());
    }

    public void enterLastName(String lname)
    {
        sendTextToElement(enterLastName,lname);
        log.info("Enter last name"+ enterLastName.toString());
    }

    public void enterSSNCardNumber(String ssn)
    {
        sendTextToElement(enterSSNCard,ssn);
        log.info("Enter SSN digit"+ enterSSNCard.toString());
    }

    public void selectMonth(String month)
    {
        selectByVisibleTextFromDropDown(selectMonth,month);
        log.info("Select month"+ selectMonth.toString());
    }
    public void selectDay(String day)
    {
        sendTextToElement(selectDay,day);
        log.info("Select day"+ selectDay.toString());
    }
    public void selectYear(String year)
    {
        sendTextToElement(selectYear,year);
        log.info("Select year"+ selectYear.toString());
    }

    public void clickOnEnterAddressManually()
    {
        clickOnElement(clickOnEnterAddress);
        log.info("Click on enter address"+ clickOnEnterAddress.toString());
    }
    public void enterStreetAddress(String address)
    {
        sendTextToElement(enterAddress,address);
        log.info("Enter address"+ enterAddress.toString());
    }
    public void enterCity(String city)
    {
        sendTextToElement(enterCity,city);
        log.info("Enter city"+ enterCity.toString());
    }

    public void selectState(String state)
    {
        selectByVisibleTextFromDropDown(selectState,state);
        log.info("select state"+ selectState.toString());
    }
    public void enterZipCode(String zip)
    {
        sendTextToElement(enterZipCode,zip);
        log.info("Enter zipcode"+ enterZipCode.toString());
    }

    public void enterMobileNumber(String number)
    {
        sendTextToElement(enterMobileNumber,number);
        log.info("Enter mobile number"+ enterMobileNumber.toString());
    }

    public void clickOnAgeBox()
    {
        clickOnElement(clickOnAgeCheckBox);
        log.info("Click age checkbox"+ clickOnAgeCheckBox.toString());
    }
    public void clickOnAcknowledgeBox()
    {
        clickOnElement(clickOnAcknowledgeCheckBox);
        log.info("Click acknowledge checkbox"+ clickOnAcknowledgeCheckBox.toString());
    }
    public void clickOnAgreeBox()
    {
        clickOnElement(clickOnPrivacyCheckBox);
        log.info("Click privacy checkbox"+ clickOnPrivacyCheckBox.toString());
    }

    public void clickOnCreateMyAccountButton()
    {
        clickOnElement(clickOnCreateMyAccount);
        log.info("Click create my account button"+ clickOnCreateMyAccount.toString());
    }

    public String verifyMessage()
    {
        String result= getTextFromElement(verifyMessage);
        log.info("Click create my account button"+ clickOnCreateMyAccount.toString());
        return result;
    }
}
