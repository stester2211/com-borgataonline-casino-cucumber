package com.borgataonline.casino.pages;

import com.borgataonline.casino.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility
{
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage()
    {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[@class='ui-icon theme-ex']")
    WebElement clickOnCloseAdvertisement;

    @CacheLookup
    @FindBy(xpath = "//a[@title=\"NOT Request.AbsolutePath MATCHES 'en/p/disabled-affiliate'\"]")
    WebElement clickOnRegisterButton;


    public void clickOnCloseAdvertisementButton()
    {
        clickOnElement(clickOnCloseAdvertisement);
        log.info("Click On close advertisement button"+clickOnCloseAdvertisement.toString());
    }
    public void clickOnRegisterButtonLink()
    {
        clickOnElement(clickOnRegisterButton);
        log.info("Click On register button"+clickOnRegisterButton.toString());
    }

}
