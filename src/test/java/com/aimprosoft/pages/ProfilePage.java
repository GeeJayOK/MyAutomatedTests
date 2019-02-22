package com.aimprosoft.pages;

import net.thucydides.core.pages.PageObject;
import com.aimprosoft.ILocators;

public class ProfilePage extends PageObject {
    public void userClicksOnTheProfileButton() {
        $(ILocators.UM_PROFILE).click();
    }

    public boolean profilePageIsOpened() {
        return $(ILocators.PROFILE_PAGE).isDisplayed();
    }

    public boolean checkThatProfileIsPresent() {
        return $(ILocators.PROFILE_SET).isDisplayed();
    }

    public boolean checkThatAccountSettingsIsPresent() {
        return $(ILocators.ACC_SET).isDisplayed();
    }

    public boolean checkThatNotificationSettingsIsPresent() {
        return $(ILocators.NOTIF_SET).isDisplayed();
    }

    public boolean checkThatFirstNameIsPresent() {
        return $(ILocators.PRF_FIRST_NAME).isDisplayed();
    }

    public boolean checkThatLastNameIsPresent() {
        return $(ILocators.PRF_LAST_NAME).isDisplayed();
    }

    public boolean checkThatPhoneNumberIsPresent() {
        return $(ILocators.PRF_PHONE).isDisplayed();
    }

    public boolean checkThatSkypeIsPresent() {
        return $(ILocators.PRF_SKYPE).isDisplayed();
    }

    public boolean checkThatWhatIDoIsPresent() {
        return $(ILocators.PRF_WHTIDO).isDisplayed();
    }

    public boolean checkThatWhereIAmIsPresent() {
        return $(ILocators.PRF_WHRIM).isDisplayed();
    }

    public boolean checkThatTimeZoneIsPresent() {
        return $(ILocators.PRF_TIMEZONE).isDisplayed();
    }

    public boolean checkThatAvatarBigIsPresent() {
        return $(ILocators.PRF_AVATAR).isDisplayed();
    }

    public boolean checkThatChangeAvatarButtonIsPresent() {
        return $(ILocators.PRF_CHGAVATAR).isDisplayed();
    }

    public boolean checkThatSaveButtonIsPresent() {
        return $(ILocators.PRF_SAVE).isDisplayed();
    }
}
