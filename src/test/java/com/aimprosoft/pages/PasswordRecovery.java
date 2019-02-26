package com.aimprosoft.pages;

import com.aimprosoft.ILocators;
import net.thucydides.core.pages.PageObject;

public class PasswordRecovery extends PageObject {


    public boolean passwordRecoveryPage1IsOpened() {
        return $(ILocators.RECOVERY_PAGE1).isDisplayed();
    }

    public boolean passwordRecoveryPage2IsOpened() {
        return $(ILocators.RECOVERY_PAGE2).isDisplayed();
    }

    public boolean checkThatSENDRESETINSTRUCTIONSButtonIsPresent() {
        return $(ILocators.SRI_BUTT).isDisplayed();
    }

    public boolean checkThatSENDRESETINSTRUCTIONSButtonIsBlocked() {
        return $(ILocators.SRI_BUTT).isVisible();
    }

    public boolean checkThatGeneratedPasswordFieldIsPresent() {
        return $(ILocators.GEN_PASS).isDisplayed();
    }

    public boolean checkThatPassword1FieldIsPresent() {
        return $(ILocators.REC_PASS1).isDisplayed();
    }

    public boolean checkThatPassword2FieldIsPresent() {
        return $(ILocators.REC_PASS2).isDisplayed();
    }

    public boolean checkThatUSEGENERATEDPASSButtonIsPresent() {
        return $(ILocators.USE_GEN_PASS).isDisplayed();
    }

    public boolean checkThatUSECUSTOMPASSButtonIsPresent() {
        return $(ILocators.USE_CUST_PASS).isDisplayed();
    }

    public boolean checkThatUSEGENERATEDPASSButtonIsBlocked() {
        return $(ILocators.USE_GEN_PASS).isCurrentlyEnabled();
    }

    public boolean checkThatUSECUSTOMPASSButtonIsBlocked() {
        return $(ILocators.USE_CUST_PASS).isCurrentlyEnabled();
    }

    public void userEnterDataInTheUSEGENERATEDPASSField(String gPass) {
        $(ILocators.GEN_PASS).clear();
        $(ILocators.GEN_PASS).typeAndTab(gPass);
    }

    public void userEnterDataInThePasswordField(String pass1) {
        $(ILocators.REC_PASS1).clear();
        $(ILocators.REC_PASS1).typeAndTab(pass1);
    }

    public void userEnterDataInThePassword2Field(String pass2) {
        $(ILocators.REC_PASS2).clear();
        $(ILocators.REC_PASS2).typeAndTab(pass2);
    }

    public boolean errorIsDisplayed(String err) {
        return $(ILocators.ERROR.replace("$1", err)).isVisible();
    }

    public void userClicksOnTheUSEGENERATEDPASSButton() {
        $(ILocators.USE_GEN_PASS).click();
    }

    public void userClicksOnTheUSECUSTOMPASSButton() {
        $(ILocators.USE_CUST_PASS).click();
    }
}
