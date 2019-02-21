package com.aimprosoft.pages;

import com.aimprosoft.ILocators;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class RegistrationPage2 extends PageObject {

    public boolean secondRegistrationPageIsOpened() {
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

    public boolean checkThatPasswordOneIsPresent() {
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


    public void userEnterDataToLoginField(String arg0) {
        $(ILocators.LOGIN).clear();
        $(ILocators.LOGIN).typeAndTab(arg0);
    }

    public void userEnterDataToPasswordOneField(String arg0) {
        $(ILocators.PASS1).clear();
        $(ILocators.PASS1).typeAndTab(arg0);
    }

    public void userEnterDataToPasswordTwoField(String arg0) {
        $(ILocators.PASS2).clear();
        $(ILocators.PASS2).typeAndTab(arg0);
    }

    public void userClicksOnTheSubmitButton() {
        $(ILocators.SUBMIT_BUTTON).click();
    }

    public void userEnterDataInTheEmailConfirmationCodeField(String arg0) {
        $(ILocators.CONF_CODE).clear();
        $(ILocators.CONF_CODE).typeAndTab(arg0);
    }

    public boolean errorMessagePasswordMustNotBeTheSameAsYourUsernameOrEmailIsDisplayed() {
        return $(ILocators.ERROR2).isDisplayed();
    }
}
