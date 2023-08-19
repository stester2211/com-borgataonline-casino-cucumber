package com.borgataonline.casino.steps;

import com.borgataonline.casino.pages.HomePage;
import com.borgataonline.casino.pages.RegisterPage;
import com.borgataonline.casino.utility.Utility;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class RegisterSteps extends Utility
{
    @Given("^I am on homepage$")
    public void iAmOnHomepage()
    {

    }

    @And("^I click on close button of advertisement$")
    public void iClickOnCloseButtonOfAdvertisement()
    {
        new HomePage().clickOnCloseAdvertisementButton();
    }

    @When("^I click on register button$")
    public void iClickOnRegisterButton()
    {
        new HomePage().clickOnRegisterButtonLink();
    }


    @Then("^I am on register page$")
    public void iAmOnRegisterPage() {
    }

    @And("^I enter the email address \"([^\"]*)\"$")
    public void iEnterTheEmailAddress(String email)
    {
        new RegisterPage().enterEmailAddress(email);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password)
    {
        new RegisterPage().enterPassword(password);
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton()
    {
        new RegisterPage().clickOnContinueButton();
    }

    @Then("^I select gender \"([^\"]*)\"$")
    public void iSelectGender(String gender)
    {
        new RegisterPage().clickOnGenderButton(gender);
    }


    @And("^I enter firstName \"([^\"]*)\"$")
    public void iEnterFirstName(String fname)
    {
        new RegisterPage().enterFirstName(fname);
    }

    @And("^I enter lastName \"([^\"]*)\"$")
    public void iEnterLastName(String lname)
    {
        new RegisterPage().enterLastName(lname);
    }

    @And("^I enter SSN number \"([^\"]*)\"$")
    public void iEnterSSNNumber(String ssnNumber)
    {
        new RegisterPage().enterSSNCardNumber(ssnNumber);
    }

    @And("^I select day \"([^\"]*)\"$")
    public void iSelectDay(String day)
    {
        new RegisterPage().selectDay(day);
    }

    @And("^I select month \"([^\"]*)\"$")
    public void iSelectMonth(String month)
    {
        new RegisterPage().selectMonth(month);
    }

    @And("^I select year \"([^\"]*)\"$")
    public void iSelectYear(String year)
    {
        new RegisterPage().selectYear(year);
    }

    @And("^I click on Enter address manually$")
    public void iClickOnEnterAddressManually()
    {
        new RegisterPage().clickOnEnterAddressManually();
    }

    @And("^I enter street address \"([^\"]*)\"$")
    public void iEnterStreetAddress(String address)
    {
        new RegisterPage().enterStreetAddress(address);
    }

    @And("^I enter city \"([^\"]*)\"$")
    public void iEnterCity(String city)
    {
        new RegisterPage().enterCity(city);
    }

    @And("^I select state \"([^\"]*)\"$")
    public void iSelectState(String state)
    {
        new RegisterPage().selectState(state);
    }

    @And("^I enter zipcode \"([^\"]*)\"$")
    public void iEnterZipcode(String zipcode)
    {
        new RegisterPage().enterZipCode(zipcode);
    }

    @And("^I enter Mobile number \"([^\"]*)\"$")
    public void iEnterMobileNumber(String mobile)
    {
        new RegisterPage().enterMobileNumber(mobile);
    }

    @And("^I select age verification box$")
    public void iSelectAgeVerificationBox()
    {
        new RegisterPage().clickOnAgeBox();
    }

    @And("^I select I acknowledge box$")
    public void iSelectIAcknowledgeBox()
    {
        new RegisterPage().clickOnAcknowledgeBox();
    }

    @And("^I select agreement box$")
    public void iSelectAgreementBox()
    {
        new RegisterPage().clickOnAgreeBox();
    }

    @And("^I click on create my account button$")
    public void iClickOnCreateMyAccountButton()
    {
        new RegisterPage().clickOnCreateMyAccountButton();
    }


    @Then("^verify message \"([^\"]*)\"$")
    public void verifyMessage(String message)
    {
        Assert.assertEquals("Message not found",message,new RegisterPage().verifyMessage());
    }
}
