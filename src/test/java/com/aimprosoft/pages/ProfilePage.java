package com.aimprosoft.pages;

import net.thucydides.core.pages.PageObject;
import com.aimprosoft.ILocators;
import org.openqa.selenium.By;

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

    public void userClicksOnTheAccountSettingsItem() {
        $(ILocators.ACC_SET).click();
    }

    public boolean accountSettingsPageIsOpened() {
        return $(ILocators.ACC_SET_PAGE).isDisplayed();
    }

    public boolean checkThatEmailFieldAccPageIsPresent() {
        return $(ILocators.ACC_EMAIL).isDisplayed();
    }

    public String checkThatEmailFieldContains() {
        return $(ILocators.ACC_EMAIL).getAttribute("value");
    }

    public boolean checkThatUsernameFieldIsPresent() {
        return $(ILocators.ACC_USERNAME).isDisplayed();
    }

    public String checkThatUsernameFieldContains() {
        return $(ILocators.ACC_USERNAME).getAttribute("value");
    }

    public boolean checkThatOldPasswordFieldIsPresent() {
        return $(ILocators.ACC_OLD_PASS).isDisplayed();
    }

    public boolean checkThatNewPasswordFieldIsPresent() {
        return $(ILocators.ACC_NEW_PASS).isDisplayed();
    }

    public void userClicksOnTheNotificationSettingsItem() {
        $(ILocators.NOTIF_SET).click();
    }

    public boolean notificationSettingsPageIsOpened() {
        return $(ILocators.NS_PAGE).isDisplayed();
    }

    public boolean checkThatDesktopNotificationsItemIsPresent() {
        return $(ILocators.NS_DESK_ACT).isDisplayed();
    }

    public boolean checkThatMobilePushNotificationsItemIsPresent() {
        return $(ILocators.NS_MOB_ACT).isDisplayed();
    }

    public boolean checkThatRoomSpecificSettingsItemIsPresent() {
        return $(ILocators.NS_ROOM_SET).isDisplayed();
    }

    public boolean checkThatDoNotDisturbItemIsPresent() {
        return $(ILocators.NS_DND_SW).isDisplayed();
    }

    public boolean checkThatMarkingMessagesAsReadItemIsPresent() {
        return $(ILocators.NS_MAR_MES).isDisplayed();
    }

    public void userClicksOnTheSIGNOUTButton() {
        $(ILocators.UM_SIGN_OUT).click();
        waitABit(2000);
    }

    public void userClicksOnTheTheBellButton() {
        $(ILocators.BELL).click();
    }

    public boolean checkThatMuteAllChatForItemIsPresent() {
        return $(ILocators.NS_MUTE_ALL).isDisplayed();
    }

    public boolean checkThat20MinutesItemIsPresent() {
        return $(ILocators.NS_MUTE_20M).isDisplayed();
    }

    public boolean checkThat1HourItemIsPresent() {
        return $(ILocators.NS_MUTE_1H).isDisplayed();
    }

    public boolean checkThat2HoursItemIsPresent() {
        return $(ILocators.NS_MUTE_2H).isDisplayed();
    }

    public boolean checkThat4HoursItemIsPresent() {
        return $(ILocators.NS_MUTE_4H).isDisplayed();
    }

    public boolean checkThat8HoursItemIsPresent() {
        return $(ILocators.NS_MUTE_8H).isDisplayed();
    }

    public boolean checkThat24HoursItemIsPresent() {
        return $(ILocators.NS_MUTE_24H).isDisplayed();
    }

    public boolean checkThatNotificationSettingsItemIsPresent() {
        return $(ILocators.NS_SETTINGS).isDisplayed();
    }

    public void userClicksOnTheNotificationSettingsButton() {
        $(ILocators.NS_SETTINGS).click();
    }

    public void userEnterDataInTheFirstNameField(String fname) {
        $(ILocators.PRF_FIRST_NAME).clear();
        $(ILocators.PRF_FIRST_NAME).typeAndTab(fname);
    }

    public void userEnterDataInTheLastNameField(String lname) {
        $(ILocators.PRF_LAST_NAME).clear();
        $(ILocators.PRF_LAST_NAME).typeAndTab(lname);
    }

    public void userClicksOnTheSaveButton() {
        $(ILocators.PRF_SAVE).click();
    }

    public void messageIsDisplayed(String mess) {
        $(ILocators.PRF_MESS_SUCCESS.replace("$1", mess)).isDisplayed();
    }

    public void userClicksOnTheArrowBack() {
        $(ILocators.PRF_BACK_ARROW).click();
    }

    public void userRefreshThePage() {
        getDriver().navigate().refresh();
    }

    public String checkThatEnteredDataInTheFirstNameFieldIsSaved() {
        return $(ILocators.PRF_FIRST_NAME).getAttribute("value");
    }

    public String checkThatEnteredDataInTheLastNameFieldIsSaved() {
        return $(ILocators.PRF_LAST_NAME).getAttribute("value");
    }

    public boolean profilePageErrorMessageIsDisplayed(String error) {
        return $(ILocators.PRF_ERR_MESS.replace("$1", error)).isDisplayed();
    }

    public boolean checkThatEmailFieldIsPresentAtTheAccountSettingsPage() {
        return $(ILocators.ACC_EMAIL).isDisplayed();
    }

    public boolean checkThatSAVEButtonIsBlocked() {
        return $(ILocators.PRF_SAVE).isCurrentlyEnabled();
    }

    public void userEnterDataInThePhoneNumberField(String phone) {
        $(ILocators.PRF_PHONE).clear();
        $(ILocators.PRF_PHONE).typeAndTab(phone);
    }

    public String checkThatEnteredDataInThePhoneNumberFieldIsSaved() {
        return $(ILocators.PRF_PHONE).getAttribute("value");
    }

    public void userEnterDataInTheSkypeField(String skype) {
        $(ILocators.PRF_SKYPE).clear();
        $(ILocators.PRF_SKYPE).typeAndTab(skype);
    }

    public String checkThatEnteredDataInTheSkypeFieldIsSaved() {
        return $(ILocators.PRF_SKYPE).getAttribute("value");
    }

    public void userEnterDataInTheWhatIDoField(String whIdo) {
        $(ILocators.PRF_WHTIDO).clear();
        $(ILocators.PRF_WHTIDO).typeAndTab(whIdo);
    }

    public String checkThatEnteredDataInTheWhatIDoFieldIsSaved(String whIdo) {
        return $(ILocators.PRF_WHTIDO).getAttribute("value");
    }
}
