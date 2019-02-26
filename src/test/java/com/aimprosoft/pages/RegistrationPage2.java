package com.aimprosoft.pages;

import com.aimprosoft.ILocators;
import net.thucydides.core.pages.PageObject;


public class RegistrationPage2 extends PageObject {

    public boolean registrationPage2IsOpened() {
        return $(ILocators.CONF_CODE_TXT).isVisible();
    }


    public boolean checkThatBlockedEmailFieldIsPresent() {
        return $(ILocators.EMAIL_BLOCK).isVisible();
    }

    public boolean checkThatSendAgainIsPresent() {
        return $(ILocators.SEND_AGAIN).isVisible();
    }

    public boolean checkThatEmailConfirmationCodeIsPresent() {
        return $(ILocators.CONF_CODE).isVisible();
    }

    public boolean checkThatLoginIsPresent() {
        return $(ILocators.LOGIN).isVisible();
    }

    public boolean checkThatPassword1IsPresent() {
        return $(ILocators.PASS1).isVisible();
    }

    public boolean checkThatPasswordTwoIsPresent() {
        return $(ILocators.PASS2).isVisible();
    }

    public boolean checkThatSUBMITButtonIsPresent() {
        return $(ILocators.SUBMIT_BUTTON).isDisplayed();
    }

    public boolean checkThatBTALinkIsPresent() {
        return $(ILocators.BTA_LINK).isVisible();
    }

    public void userClicksOnTheCancelButtonRP2() {
        $(ILocators.CANCEL_BUTTON).click();
    }


    public void userEnterDataToLoginField(String login) {
        $(ILocators.LOGIN).clear();
        $(ILocators.LOGIN).typeAndTab(login);
    }

    public void userEnterDataToPasswordOneField(String pass1) {
        $(ILocators.PASS1).clear();
        $(ILocators.PASS1).typeAndTab(pass1);
    }

    public void userEnterDataToPasswordTwoField(String pass2) {
        $(ILocators.PASS2).clear();
        $(ILocators.PASS2).typeAndTab(pass2);
    }

    public void userEnterDataInTheEmailConfirmationCodeField(String econf) {
        $(ILocators.CONF_CODE).clear();
        $(ILocators.CONF_CODE).typeAndTab(econf);
    }

    public boolean errorMessagePasswordMustNotBeTheSameAsYourUsernameOrEmailIsDisplayed() {
        return $(ILocators.ERROR2).isDisplayed();
    }
}
