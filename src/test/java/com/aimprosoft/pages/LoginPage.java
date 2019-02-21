package com.aimprosoft.pages;

import com.aimprosoft.ILocators;
import net.thucydides.core.pages.PageObject;

public class LoginPage extends PageObject {

    public void userClicksOnTheRegisterLink() {
        $(ILocators.LOGIN_FORM_REGISTER_LINK).click();
    }

    public boolean registrationFormTitleIsPresent() {
        return $(ILocators.REG_FORM_TITLE).isVisible();
    }

    public void userPerformLoginWithEmailAndPassword(String arg0, String arg1, String arg2, String arg3) {
        $(ILocators.LOGIN_FORM_INPUT_FIELDS.replace("$1", arg2)).clear();
        $(ILocators.LOGIN_FORM_INPUT_FIELDS.replace("$1", arg2)).sendKeys(arg0);
        $(ILocators.LOGIN_FORM_INPUT_FIELDS.replace("$1", arg3)).clear();
        $(ILocators.LOGIN_FORM_INPUT_FIELDS.replace("$1", arg3)).sendKeys(arg1);
    }

    public void userClicksOnTheSIGNINButton() {
        $(ILocators.SIGN_IN).click();

    }

    public boolean teamNameChatIsPresent() {
        return $(ILocators.TEAM_NAME).isVisible();
    }

    public boolean authorizationPageIsOpened() {
        return $(ILocators.LOG_PAGE).isDisplayed();
    }

    public boolean checkThatPasswordIsPresent() {
        return $(ILocators.PASS).isDisplayed();
    }

    public boolean checkThatRememberMeIsPresent() {
        return $(ILocators.REM_ME).isDisplayed();
    }

    public boolean checkThatForgotYourPasswordIsPresent() {
        return $(ILocators.FORGOT).isDisplayed();
    }

    public boolean checkThatSIGNINIsPresent() {
        return $(ILocators.SIGN_IN).isDisplayed();
    }

    public boolean checkThatREGISTERIsPresent() {
        return $(ILocators.LOGIN_FORM_REGISTER_LINK).isDisplayed();
    }

    public boolean checkThatSIGNINButtonIsBlocked() {
        return $(ILocators.SIGN_IN).isCurrentlyEnabled();
    }

    public void userClicksOnTheRememberMeLink() {
        $(ILocators.LOGIN_FORM_REGISTER_LINK).click();
    }

    public void userClicksOnTheForgotYourPasswordLink() {
        $(ILocators.FORGOT).click();
    }

    public void userClicksOnTheREGISTERLink() {
        $(ILocators.LOGIN_FORM_REGISTER_LINK).click();
    }

    public boolean checkThatSIGNINButtonIsDisabled() {
        return $(ILocators.SIGN_IN).isCurrentlyEnabled();
    }

    public void userEnterDataToPasswordField(String arg0) {
        $(ILocators.PASS).clear();
        $(ILocators.PASS).typeAndTab(arg0);
    }

    public boolean messageUnauthorizedIsDisplayed() {
        return $(ILocators.ERR_UNAUT).isDisplayed();
    }

    public boolean messageOfErrorIsDisplayed() {
        return $(ILocators.ERR_LOGIN).isDisplayed();
    }

    public boolean checkThatCheckCircleIsNotDisplayed() {
        return $(ILocators.CHECK_CIRKLE).isVisible();
    }

    public void userClicksOnTheShowPasswordButton() {
        $(ILocators.SHOW_PASS).click();
    }
}
