package com.aimprosoft.steps.serenity;

import com.aimprosoft.ILocators;
import com.aimprosoft.pages.*;
import cucumber.api.java.bs.A;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import java.lang.reflect.AccessibleObject;
import java.nio.channels.AsynchronousServerSocketChannel;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.*;

public class EndUserSteps {


    LoginPage loginPage;
    RegistrationPage1 registrationPage1;
    RegistrationPage2 registrationPage2;
    CommonElements commonElements;
    PasswordRecovery passwordRecovery;
    MainPage mainPage;
    ProfilePage profilePage;

    @Step
    public void userGoToThePage(String arg0) {
        loginPage.getDriver().get(arg0);
    }

    @Step
    public void userIsOnTheAuthorizationPage() {
        Assert.assertTrue("Authorization page is not opened", loginPage.authorizationPageIsOpened());
    }

    @Step
    public void userClicksOnTheRegisterLink() {
        loginPage.userClicksOnTheRegisterLink();
    }

    @Step
    public void registrationFormTitleIsPresent() {
        Assert.assertTrue("Title isn't present!", loginPage.registrationFormTitleIsPresent());
    }

    @Step
    public void registrationPageIsOpened(String url) {
        registrationPage1.openRegistrationPage(url);
        assertTrue("Title is present!", registrationPage1.checkTitlePresence());
    }

    @Step
    public void userClicksOnTheSubmitButton() {
        registrationPage1.userClicksOnTheSubmitButton();
    }

    @Step
    public void secondRegistrationPageIsOpened() {
        assertTrue("Second Registration page is not opened", registrationPage2.secondRegistrationPageIsOpened());
    }

    @Step
    public void userPerformLoginWithEmailAndPassword(String arg0, String arg1, String arg2, String arg3) {
        loginPage.userPerformLoginWithEmailAndPassword(arg0, arg1, arg2, arg3);
    }

    @Step
    public void userClicksOnTheSIGNINButton() {
        loginPage.userClicksOnTheSIGNINButton();
    }

    @Step
    public void authorizationIsSuccessful() {
        Assert.assertTrue("User is not logged in!", loginPage.teamNameChatIsPresent());
    }

    @Step
    public void waitForLoader() {
        commonElements.waitUntilElementToBeVisible(200, ILocators.LOADER);
        commonElements.waitUntilElementToBeInvisible(500, ILocators.LOADER);
    }

    @Step
    public void firstRegistrationPageIsOpen(String arg0) {
        registrationPage1.openFirstRegistrationPage(arg0);
    }

    @Step
    public void firstRegistrationPageIsOpened() {
        registrationPage1.firstRegistrationPageIsOpened();
    }

    @Step
    public void checkThatEmailFieldIsPresent() {
        registrationPage1.checkThatEmailFieldIsPresent();
    }

    @Step
    public void submitButtonIsPresent() {
        Assert.assertFalse("Submit button is visible!", registrationPage1.submitButtonIsPresent());
    }

    @Step
    public void cancelButtonIsPresent() {
        registrationPage1.cancelButtonIsPresent();
    }

    @Step
    public void backToAuthorizationLinkIsPresent() {
        registrationPage1.backToAuthorizationLinkIsPresent();
    }

    @Step
    public void checkThatSUBMITButtonIsBlocked() {
        Assert.assertFalse("Submit button is visible!", registrationPage1.submitButtonIsPresent());
    }

    @Step
    public void userClicksOnTheCancelButton() {
        registrationPage1.userClicksOnTheCancelButton();
    }

    @Step
    public void authorizationPageIsOpened() {
        Assert.assertTrue("Authorization page not opened!", loginPage.authorizationPageIsOpened());
    }

    @Step
    public void userClicksOnTheBackToAuthorizationLink() {
        registrationPage1.userClicksOnTheBackToAuthorizationLink();
    }

    @Step
    public void userClicksInTheEmailFieldAndClickOutside() {
        registrationPage1.userClicksInTheEmailFieldAndClickOutside();
    }

    @Step
    public void errorMessageIsDisplayed(String arg0) {
        Assert.assertTrue("Error message " + arg0 + " is not displayed!", registrationPage1.errorMessageIsDisplayed(arg0));
    }

    @Step
    public void userEnterDataInTheEmailField(String arg0) {
        registrationPage1.userEnterDataInTheEmailField(arg0);
    }

    @Step
    public void checkThatSUBMITButtonIsAvailable() {
        Assert.assertTrue("Submit button is not available!", registrationPage1.checkThatSUBMITButtonIsAvailable());
    }

    @Step
    public void checkThatSUBMITButtonIsNotClickable() {
        Assert.assertFalse("SUBMIT button is clickable!", registrationPage1.checkThatSUBMITButtonIsNotClickable());
    }

    @Step
    public void checkThatBlockedEmailFieldIsPresent() {
        commonElements.waitUntilElementToBeVisible(200, ILocators.EMAIL_FIELD);
        Assert.assertTrue("RP2 - Email field", registrationPage2.checkThatBlockedEmailFieldIsPresent());

    }

    @Step
    public void checkThatSendAgainIsPresent() {
        Assert.assertTrue("RP2 - Send again", registrationPage2.checkThatSendAgainIsPresent());
    }

    @Step
    public void checkThatEmailConfirmationCodeIsPresent() {
        Assert.assertTrue("Email CONF Code", registrationPage2.checkThatEmailConfirmationCodeIsPresent());
    }

    @Step
    public void checkThatLoginIsPresent() {
        Assert.assertTrue("LOGIN", registrationPage2.checkThatLoginIsPresent());
    }

    @Step
    public void checkThatPasswordOneIsPresent() {
        Assert.assertTrue("PASS1", registrationPage2.checkThatPasswordOneIsPresent());
    }

    @Step
    public void checkThatPasswordTwoIsPresent() {
        Assert.assertTrue("PASS2", registrationPage2.checkThatPasswordTwoIsPresent());
    }

    @Step
    public void checkThatBTALinkIsPresent() {
        Assert.assertTrue("BTA link", registrationPage2.checkThatBTALinkIsPresent());
    }

    @Step
    public void userClicksOnTheCancelButtonRP2() {
        registrationPage2.userClicksOnTheCancelButtonRP2();
    }

    @Step
    public void userEnterDataToLoginField(String arg0) {
        registrationPage2.userEnterDataToLoginField(arg0);
    }

    @Step
    public void userEnterDataToPasswordOneField(String arg0) {
        registrationPage2.userEnterDataToPasswordOneField(arg0);
    }

    @Step
    public void userEnterDataToPasswordTwoField(String arg0) {
        registrationPage2.userEnterDataToPasswordTwoField(arg0);
    }

    @Step
    public void checkThatSUBMITButtonIsPresent() {
        Assert.assertTrue("SUBM button", registrationPage2.checkThatSUBMITButtonIsPresent());
    }

    @Step
    public void userEnterDataInTheEmailConfirmationCodeField(String arg0) {
        registrationPage2.userEnterDataInTheEmailConfirmationCodeField(arg0);
    }

    @Step
    public void errorMessagePasswordMustNotBeTheSameAsYourUsernameOrEmailIsDisplayed() {
        Assert.assertTrue("Error message is not displayed", registrationPage2.errorMessagePasswordMustNotBeTheSameAsYourUsernameOrEmailIsDisplayed());
    }

    @Step
    public void checkThatPasswordIsPresent() {
        Assert.assertTrue("Password is not present", loginPage.checkThatPasswordIsPresent());
    }

    @Step
    public void checkThatRememberMeIsPresent() {
        Assert.assertTrue("Remember Me Is Not Present", loginPage.checkThatRememberMeIsPresent());
    }

    @Step
    public void checkThatForgotYourPasswordIsPresent() {
        Assert.assertTrue("Forgot Your Password Is Not Present", loginPage.checkThatForgotYourPasswordIsPresent());
    }

    @Step
    public void checkThatSIGNINIsPresent() {
        Assert.assertTrue("SIGN IN Is Not Present", loginPage.checkThatSIGNINIsPresent());
    }

    @Step
    public void checkThatREGISTERIsPresent() {
        Assert.assertTrue("REGISTER Is Not Present", loginPage.checkThatREGISTERIsPresent());
    }

    @Step
    public void checkThatSIGNINButtonIsBlocked() {
        Assert.assertFalse("SIGN IN Button Is Not Blocked", loginPage.checkThatSIGNINButtonIsBlocked());
    }

    @Step
    public void userClicksOnTheRememberMeLink() {
        loginPage.userClicksOnTheRememberMeLink();
    }

    @Step
    public void userClicksOnTheForgotYourPasswordLink() {
        loginPage.userClicksOnTheForgotYourPasswordLink();
    }

    @Step
    public void passwordRecoveryPage1IsOpened() {
        Assert.assertTrue("Recovery Page1 Is Not Opened", passwordRecovery.passwordRecoveryPage1IsOpened());
    }

    @Step
    public void userClicksOnTheREGISTERLink() {
        loginPage.userClicksOnTheREGISTERLink();
    }

    @Step
    public void checkThatSIGNINButtonIsDisabled() {
        Assert.assertFalse("SIGN IN Button Is Enabled", loginPage.checkThatSIGNINButtonIsDisabled());
    }

    @Step
    public void userEnterDataToPasswordField(String arg0) {
        loginPage.userEnterDataToPasswordField(arg0);
    }

    @Step
    public void messageUnauthorizedIsDisplayed() {
        Assert.assertTrue("Message Unauthorized Is Not Displayed", loginPage.messageUnauthorizedIsDisplayed());
    }

    @Step
    public void messageOfErrorIsDisplayed() {
        Assert.assertTrue("Login Can't Be Empty Is Not Displayed", loginPage.messageOfErrorIsDisplayed());
    }

    @Step
    public void checkThatCheckCircleIsNotDisplayed() {
        Assert.assertFalse("Check Circle Is Displayed", loginPage.checkThatCheckCircleIsNotDisplayed());
    }

    @Step
    public void userClicksOnTheShowPasswordButton() {
        loginPage.userClicksOnTheShowPasswordButton();
    }

    @Step
    public void checkThatSENDRESETINSTRUCTIONSButtonIsPresent() {
        Assert.assertTrue("SEND RESET INSTRUCTIONS Button Is Not Present", passwordRecovery.checkThatSENDRESETINSTRUCTIONSButtonIsPresent());
    }

    @Step
    public void checkThatSENDRESETINSTRUCTIONSButtonIsBlocked() {
        Assert.assertFalse("SEND RESET INSTRUCTIONS Button Is Available", passwordRecovery.checkThatSENDRESETINSTRUCTIONSButtonIsBlocked());
    }

    @Step
    public void checkThatGeneratedPasswordFieldIsPresent() {
        Assert.assertTrue("Cenerated Password Field Is Not Present", passwordRecovery.checkThatGeneratedPasswordFieldIsPresent());
    }

    @Step
    public void checkThatPassword1FieldIsPresent() {
        Assert.assertTrue("Password1 Field Is Not Present", passwordRecovery.checkThatPassword1FieldIsPresent());
    }

    @Step
    public void checkThatPassword2FieldIsPresent() {
        Assert.assertTrue("Password2 Field Is Not Present", passwordRecovery.checkThatPassword2FieldIsPresent());
    }

    @Step
    public void checkThatUSEGENERATEDPASSButtonIsPresent() {
        Assert.assertTrue("USE GENERATED PASS Button Is Not Present", passwordRecovery.checkThatUSEGENERATEDPASSButtonIsPresent());
    }

    @Step
    public void checkThatUSECUSTOMPASSButtonIsPresent() {
        Assert.assertTrue("USE CUSTOM PASS Button Is Not Present", passwordRecovery.checkThatUSECUSTOMPASSButtonIsPresent());
    }

    @Step
    public void checkThatUSEGENERATEDPASSButtonIsBlocked() {
        Assert.assertFalse("USE GENERATED PASS Button Is Available", passwordRecovery.checkThatUSEGENERATEDPASSButtonIsBlocked());
    }

    @Step
    public void checkThatUSECUSTOMPASSButtonIsBlocked() {
        Assert.assertFalse("USE CUSTOM PASS Button Is Available", passwordRecovery.checkThatUSECUSTOMPASSButtonIsBlocked());
    }

    @Step
    public void userEnterDataInTheUSEGENERATEDPASSField(String arg0) {
        passwordRecovery.userEnterDataInTheUSEGENERATEDPASSField(arg0);
    }

    @Step
    public void userEnterDataInThePasswordField(String arg0) {
        passwordRecovery.userEnterDataInThePasswordField(arg0);
    }

    @Step
    public void userEnterDataInThePassword2Field(String arg0) {
        passwordRecovery.userEnterDataInThePassword2Field(arg0);
    }

    @Step
    public void errorIsDisplayed(String arg0) {
        Assert.assertTrue("error Is Not Displayed", passwordRecovery.errorIsDisplayed(arg0));
    }

    @Step
    public void userClicksOnTheUSEGENERATEDPASSButton() {
        passwordRecovery.userClicksOnTheUSEGENERATEDPASSButton();
    }

    @Step
    public void passwordRecoveryPage2IsOpened() {
        Assert.assertTrue("password Recovery Page2 Is Not Opened", passwordRecovery.passwordRecoveryPage2IsOpened());
    }

    @Step
    public void userClicksOnTheUSECUSTOMPASSButton() {
        passwordRecovery.userClicksOnTheUSECUSTOMPASSButton();
    }

    @Step
    public void checkThatLeftPanelIsPresent() {
        Assert.assertTrue("Left Panel Is Not Present", mainPage.checkThatLeftPanelIsPresent());
    }

    @Step
    public void checkThatHeaderIsPresent() {
        Assert.assertTrue("Header Is Not Present", mainPage.checkThatHeaderIsPresent());
    }

    @Step
    public void checkThatRightPanelIsPresent() {
        Assert.assertTrue("Right Panel Is Not Present", mainPage.checkThatRightPanelIsPresent());
    }

    @Step
    public void checkThatMiddleElementIsPresent() {
        Assert.assertTrue("Middle Element Is Not Present", mainPage.checkThatMiddleElementIsPresent());
    }

    @Step
    public void checkThatFooterIsPresent() {
        Assert.assertTrue("Footer Is Not Present", mainPage.checkThatFooterIsPresent());
    }

    @Step
    public void checkThatUserMenuIsPresent() {
        Assert.assertTrue("User Menu Is Not Present", mainPage.checkThatUserMenuIsPresent());
    }

    @Step
    public void checkThatRoomListIsPresent() {
        Assert.assertTrue("Room List Is Not Present", mainPage.checkThatRoomListIsPresent());
    }

    @Step
    public void checkThatDirectListIsPresent() {
        Assert.assertTrue("Direct List Is Not Present", mainPage.checkThatDirectListIsPresent());
    }

    @Step
    public void checkThatNavigationPanelIsPresent() {
        Assert.assertTrue("Navigation Panel Is Not Present", mainPage.checkThatNavigationPanelIsPresent());
    }

    @Step
    public void checkThatTeamNameIsPresent() {
        Assert.assertTrue("Team Name Is Not Present", mainPage.checkThatTeamNameIsPresent());
    }

    @Step
    public void checkThatAvatarIsPresent() {
        Assert.assertTrue("Avatar Is Not Present", mainPage.checkThatAvatarIsPresent());
    }

    @Step
    public void checkThatUsernameIsPresent() {
        Assert.assertTrue("Username Is Not Present", mainPage.checkThatUsernameIsPresent());
    }

    @Step
    public void checkThatBellIsPresent() {
        Assert.assertTrue("Bell Is Not Present", mainPage.checkThatBellIsPresent());
    }

    @Step
    public void checkThatROOMSIsPresent() {
        Assert.assertTrue("ROOMS Is Not Present", mainPage.checkThatROOMSIsPresent());
    }

    @Step
    public void checkThatADDROOMIsPresent() {
        Assert.assertTrue("ADD ROOM Is Not Present", mainPage.checkThatADDROOMIsPresent());
    }

    @Step
    public void checkThatDirectIsPresent() {
        Assert.assertTrue("Direct Is Not Present", mainPage.checkThatDirectIsPresent());
    }

    @Step
    public void checkThatAddDirectIsPresent() {
        Assert.assertTrue("Add Direct Is Not Present", mainPage.checkThatAddDirectIsPresent());
    }

    @Step
    public void checkThatGeneralRoomIsPresent() {
        Assert.assertTrue("General Room Is Not Present", mainPage.checkThatGeneralRoomIsPresent());
    }

    @Step
    public void checkThatSearchNavigationPanelIsPresent() {
        Assert.assertTrue("Search Navigation Panel Is Not Present", mainPage.checkThatSearchNavigationPanelIsPresent());
    }

    @Step
    public void checkThatCloseButtonNavPanelIsPresent() {
        Assert.assertTrue("Close Button Nav Panel Is Not Present", mainPage.checkThatCloseButtonNavPanelIsPresent());
    }

    @Step
    public void checkThatChannelTitleIsPresent() {
        Assert.assertTrue("Channel Title Is Not Present", mainPage.checkThatChannelTitleIsPresent());
    }

    @Step
    public void checkThatHeaderControlIsPresent() {
        Assert.assertTrue("Header Control Is Not Present", mainPage.checkThatHeaderControlIsPresent());
    }

    @Step
    public void checkThatRoomMembersButtonIsPresent() {
        Assert.assertTrue("Room Members Button Is Not Present", mainPage.checkThatRoomMembersButtonIsPresent());
    }

    @Step
    public void checkThatPinnedMessagesButtonIsPresent() {
        Assert.assertTrue("Pinned Messages Button Is Not Present", mainPage.checkThatPinnedMessagesButtonIsPresent());
    }

    @Step
    public void checkThatStarredMessagesButtonIsPresent() {
        Assert.assertTrue("Starred Messages Button Is Not Present", mainPage.checkThatStarredMessagesButtonIsPresent());
    }

    @Step
    public void checkThatUploadedFilesButtonIsPresent() {
        Assert.assertTrue("Uploaded Files Button Is Not Present", mainPage.checkThatUploadedFilesButtonIsPresent());
    }

    @Step
    public void checkThatRoomSettingsIsPresent() {
        Assert.assertTrue("Room Settings Is Not Present", mainPage.checkThatRoomSettingsIsPresent());
    }

    @Step
    public void checkThatInputTextFieldIsPresent() {
        Assert.assertTrue("Input Text Field Is Not Present", mainPage.checkThatInputTextFieldIsPresent());
    }

    @Step
    public void checkThatUploadButtonIsPresent() {
        Assert.assertTrue("Upload Button Is Present", mainPage.checkThatUploadButtonIsPresent());
    }

    @Step
    public void checkThatStickersButtonIsPresent() {
        Assert.assertTrue("Stickers Button Is Not Present", mainPage.checkThatStickersButtonIsPresent());
    }

    @Step
    public void checkThatEmojiButtonIsPresent() {
        Assert.assertTrue("Emoji Button Is Not Present", mainPage.checkThatEmojiButtonIsPresent());
    }

    @Step
    public void userClicksOnTheUserMenu() {
        mainPage.userClicksOnTheUserMenu();
    }

    @Step
    public void checkThatProfileButtonIsPresent() {
        Assert.assertTrue("Profile Button Is Not Present", mainPage.checkThatProfileButtonIsPresent());
    }

    @Step
    public void checkThatSignOutButtonIsPresent() {
        Assert.assertTrue("Sign Out Button Is Not Present", mainPage.checkThatSignOutButtonIsPresent());
    }

    @Step
    public void checkThatJoinAnotherTeamButtonIsPresent() {
        Assert.assertTrue("Join Another Team Button Is Not Present", mainPage.checkThatJoinAnotherTeamButtonIsPresent());
    }

    @Step
    public void checkThatDownloadAppButtonIsPresent() {
        Assert.assertTrue("Download App Button Is Present", mainPage.checkThatDownloadAppButtonIsPresent());
    }

    @Step
    public void userClicksOnTheProfileButton() {
        profilePage.userClicksOnTheProfileButton();
    }

    @Step
    public void profilePageIsOpened() {
        Assert.assertTrue("profile Page Is Not Opened", profilePage.profilePageIsOpened());
    }

    @Step
    public void checkThatProfileIsPresent() {
        Assert.assertTrue("Profile Is Not Present", profilePage.checkThatProfileIsPresent());
    }

    @Step
    public void checkThatAccountSettingsIsPresent() {
        Assert.assertTrue("Account Settings Is Not Present", profilePage.checkThatAccountSettingsIsPresent());
    }

    @Step
    public void checkThatNotificationSettingsIsPresent() {
        Assert.assertTrue("Notification Settings Is Not Present", profilePage.checkThatNotificationSettingsIsPresent());
    }

    @Step
    public void checkThatFirstNameIsPresent() {
        Assert.assertTrue("First Name Is Not Present", profilePage.checkThatFirstNameIsPresent());
    }

    @Step
    public void checkThatLastNameIsPresent() {
        Assert.assertTrue("Last Name Is Not Present", profilePage.checkThatLastNameIsPresent());
    }

    @Step
    public void checkThatPhoneNumberIsPresent() {
        Assert.assertTrue("Phone Number Is Not Present", profilePage.checkThatPhoneNumberIsPresent());
    }

    @Step
    public void checkThatSkypeIsPresent() {
        Assert.assertTrue("Skype Is Not Present", profilePage.checkThatSkypeIsPresent());
    }

    @Step
    public void checkThatWhatIDoIsPresent() {
        Assert.assertTrue("What I Do Is Not Present", profilePage.checkThatWhatIDoIsPresent());
    }

    @Step
    public void checkThatWhereIAmIsPresent() {
        Assert.assertTrue("Where I Am Is Not Present", profilePage.checkThatWhereIAmIsPresent());
    }

    @Step
    public void checkThatTimeZoneIsPresent() {
        Assert.assertTrue("Time Zone Is Not Present", profilePage.checkThatTimeZoneIsPresent());
    }

    @Step
    public void checkThatAvatarBigIsPresent() {
        Assert.assertTrue("Avatar Big Is Not Present", profilePage.checkThatAvatarBigIsPresent());
    }

    @Step
    public void checkThatChangeAvatarButtonIsPresent() {
        Assert.assertTrue("Change Avatar Button Is Not Present", profilePage.checkThatChangeAvatarButtonIsPresent());
    }

    @Step
    public void checkThatSaveButtonIsPresent() {
        Assert.assertTrue("Save Button Is Not Present", profilePage.checkThatSaveButtonIsPresent());
    }

    @Step
    public void userClicksOnTheAccountSettingsItem() {
        profilePage.userClicksOnTheAccountSettingsItem();
    }

    @Step
    public void accountSettingsPageIsOpened() {
        Assert.assertTrue("account Settings Page Is Not Opened", profilePage.accountSettingsPageIsOpened());
    }

    @Step
    public void checkThatEmailFieldAccPageIsPresent() {
        Assert.assertTrue("Email Field AccPage Is Not Present", profilePage.checkThatEmailFieldAccPageIsPresent());
    }

    @Step
    public void checkThatEmailFieldContains(String arg0) {
        Assert.assertTrue("Email Field Doesn't Contains" + arg0, profilePage.checkThatEmailFieldContains(arg0));
    }

    @Step
    public void checkThatUsernameFieldIsPresent() {
        Assert.assertTrue("Username Field Is Not Present", profilePage.checkThatUsernameFieldIsPresent());
    }

    @Step
    public void checkThatUsernameFieldContains(String arg0) {
        Assert.assertTrue("Username Field Doesn't Contains" + arg0, profilePage.checkThatUsernameFieldContains(arg0));
    }

    @Step
    public void checkThatOldPasswordFieldIsPresent() {
        Assert.assertTrue("Old Password Field Is Not Present", profilePage.checkThatOldPasswordFieldIsPresent());
    }

    @Step
    public void checkThatNewPasswordFieldIsPresent() {
        Assert.assertTrue("New Password Field Is Not Present", profilePage.checkThatNewPasswordFieldIsPresent());
    }

    @Step
    public void userClicksOnTheNotificationSettingsItem() {
        profilePage.userClicksOnTheNotificationSettingsItem();
    }

    @Step
    public void notificationSettingsPageIsOpened() {
        Assert.assertTrue("notification Settings Page Is Not Opened", profilePage.notificationSettingsPageIsOpened());
    }

    @Step
    public void checkThatDesktopNotificationsItemIsPresent() {
        Assert.assertTrue("Desktop Notifications Item Is Not Present", profilePage.checkThatDesktopNotificationsItemIsPresent());
    }

    @Step
    public void checkThatMobilePushNotificationsItemIsPresent() {
        Assert.assertTrue("Mobile Push Notifications Item Is Not Present", profilePage.checkThatMobilePushNotificationsItemIsPresent());
    }

    @Step
    public void checkThatRoomSpecificSettingsItemIsPresent() {
        Assert.assertTrue("Room Specific Settings Item Is Not Present", profilePage.checkThatRoomSpecificSettingsItemIsPresent());
    }

    @Step
    public void checkThatDoNotDisturbItemIsPresent() {
        Assert.assertTrue("Do Not Disturb Item Is Not Present", profilePage.checkThatDoNotDisturbItemIsPresent());
    }

    @Step
    public void checkThatMarkingMessagesAsReadItemIsPresent() {
        Assert.assertTrue("Marking Messages As Read Item Is Not Present", profilePage.checkThatMarkingMessagesAsReadItemIsPresent());
    }

    @Step
    public void userClicksOnTheSIGNOUTButton() {
        profilePage.userClicksOnTheSIGNOUTButton();
    }

    @Step
    public void userClicksOnTheTheBellButton() {
        profilePage.userClicksOnTheTheBellButton();
    }

    @Step
    public void checkThatMuteAllChatForItemIsPresent() {
        Assert.assertTrue("Mute All Chat For Item Is Not Present", profilePage.checkThatMuteAllChatForItemIsPresent());
    }

    @Step
    public void checkThat20MinutesItemIsPresent() {
        Assert.assertTrue("20 Minutes Item Is Not Present", profilePage.checkThat20MinutesItemIsPresent());
    }

    @Step
    public void checkThat1HourItemIsPresent() {
        Assert.assertTrue("1 Hour Item Is Not Present", profilePage.checkThat1HourItemIsPresent());
    }

    @Step
    public void checkThat2HoursItemIsPresent() {
        Assert.assertTrue("2 Hours Item Is Not Present", profilePage.checkThat2HoursItemIsPresent());
    }

    @Step
    public void checkThat4HoursItemIsPresent() {
        Assert.assertTrue("4 Hours Item Is Not Present", profilePage.checkThat4HoursItemIsPresent());
    }

    @Step
    public void checkThat8HoursItemIsPresent() {
        Assert.assertTrue("8 Hours Item Is Not Present", profilePage.checkThat8HoursItemIsPresent());
    }

    @Step
    public void checkThat24HoursItemIsPresent() {
        Assert.assertTrue("24 Hours Item Is Not Present", profilePage.checkThat24HoursItemIsPresent());
    }

    @Step
    public void checkThatNotificationSettingsItemIsPresent() {
        Assert.assertTrue("Notification Settings Item Is Not Present", profilePage.checkThatNotificationSettingsItemIsPresent());
    }

    @Step
    public void userClicksOnTheNotificationSettingsButton() {
        profilePage.userClicksOnTheNotificationSettingsButton();
    }

    @Step
    public void userEnterDataInTheFirstNameField(String arg0) {
        profilePage.userEnterDataInTheFirstNameField(arg0);
    }

    @Step
    public void userEnterDataInTheLastNameField(String arg0) {
        profilePage.userEnterDataInTheLastNameField(arg0);
    }

    @Step
    public void userClicksOnTheSaveButton() {
        profilePage.userClicksOnTheSaveButton();
    }

    @Step
    public void messageIsDisplayed(String arg0) {
        profilePage.messageIsDisplayed(arg0);
    }

    @Step
    public void userClicksOnTheArrowBack() {
        profilePage.userClicksOnTheArrowBack();
    }

    @Step
    public void userRefreshThePage() {
        profilePage.userRefreshThePage();
    }

    @Step
    public void checkThatEnteredDataInTheFirstNameFieldIsSaved(String arg0) {
        Assert.assertTrue("Entered Data In The First Name Field Didn't Save", profilePage.checkThatEnteredDataInTheFirstNameFieldIsSaved(arg0));
    }
}