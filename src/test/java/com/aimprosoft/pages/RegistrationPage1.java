package com.aimprosoft.pages;

import com.aimprosoft.ILocators;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegistrationPage1 extends PageObject {
    public void openRegistrationPage(String url) {
        getDriver().get(url);
    }

    public boolean checkTitlePresence() {
        return getDriver().findElement(By.xpath("//input[@placeholder='Email']")).isDisplayed();
    }

    public void userClicksOnTheSubmitButton() {
        $(ILocators.SUBMIT_BUTTON).click();
    }

    public void openFirstRegistrationPage(String arg0) {
        getDriver().get(arg0);
    }

    public boolean firstRegistrationPageIsOpened() {
        return $(ILocators.TITTLE_RP).isDisplayed();
        //!!!!!
    }

    public boolean checkThatEmailFieldIsPresent() {
        return $(ILocators.EMAIL_FIELD).isDisplayed();
    }

    public boolean submitButtonIsPresent() {
        return $(ILocators.SUBMIT_BUTTON).isCurrentlyEnabled();

    }

    public boolean cancelButtonIsPresent() {
        return $(ILocators.CANCEL_BUTTON).isVisible();
    }

    public boolean backToAuthorizationLinkIsPresent() {
        return $(ILocators.BTA_LINK).isVisible();
    }

    public boolean checkThatSUBMITButtonIsAvailable() {
        return $(ILocators.SUBMIT_BUTTON).isCurrentlyEnabled();
    }

    public void userClicksOnTheCancelButton() {
        $(ILocators.CANCEL_BUTTON).click();
    }

    public void userClicksOnTheBackToAuthorizationLink() {
        $(ILocators.BTA_LINK).click();
    }

    public void userClicksInTheEmailFieldAndClickOutside() {
        $(ILocators.EMAIL_FIELD).typeAndTab("");

    }

    public boolean errorMessageIsDisplayed(String arg0) {
        return $(ILocators.ERROR_MESS.replace("$1", arg0)).isVisible();
    }

    public void userEnterDataInTheEmailField(String arg0) {
        $(ILocators.EMAIL_FIELD).clear();
        $(ILocators.EMAIL_FIELD).typeAndTab(arg0);
    }

    public boolean checkThatSUBMITButtonIsNotClickable() {
        $(ILocators.SUBMIT_BUTTON).click();
        return $(ILocators.TITTLE_RP).isVisible();
    }
}
