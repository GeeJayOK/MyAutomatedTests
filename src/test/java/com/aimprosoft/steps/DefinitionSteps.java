package com.aimprosoft.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import com.aimprosoft.steps.serenity.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps steps;

    @Given("^User goes to the \"([^\"]*)\" page$")
    public void userGoesToThePage(String url) throws Throwable {
        steps.userGoesToThePage(url);
    }

    @Then("^User is on the Authorization page$")
    public void userIsOnTheAuthorizationPage() throws Throwable {
        steps.userIsOnTheAuthorizationPage();
    }

    @When("^User clicks on the register link$")
    public void userClicksOnTheRegisterLink() {
        steps.userClicksOnTheRegisterLink();
    }

    @Then("^Registration form title is present$")
    public void registrationFormTitleIsPresent() {
        steps.registrationFormTitleIsPresent();
    }


    @Given("^Registration page \"([^\"]*)\" is opened$")
    public void registrationPageIsOpened(String url) throws Throwable {
        steps.registrationPageIsOpened(url);
    }

    @Then("^User clicks on the 'Submit' button$")
    public void userClicksOnTheSubmitButton() {
        steps.userClicksOnTheSubmitButton();
    }

    @Then("^Registration page2 is opened$")
    public void registrationPage2IsOpened() {
        steps.registrationPage2IsOpened();
    }


    @When("^User perform login with \"([^\"]*)\" email and \"([^\"]*)\" password in the \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userPerformLoginWithEmailAndPasswordInTheAnd(String email, String pass, String logF, String passF) throws Throwable {
        steps.userPerformLoginWithEmailAndPassword(email, pass, logF, passF);
    }

    @And("^User clicks on the SIGN IN button$")
    public void userClicksOnTheSIGNINButton() {
        steps.userClicksOnTheSIGNINButton();
    }

    @Then("^Authorization is successful$")
    public void authorizationIsSuccessful() {
        steps.authorizationIsSuccessful();
    }

    @And("^Wait for loader$")
    public void waitForLoader() {
        steps.waitForLoader();
    }

    @Given("^User goes to \"([^\"]*)\" page$")
    public void userGoesToPage(String url) throws Throwable {
        steps.userGoesToPage(url);
    }

    @When("^Registration page1 is opened$")
    public void registrationPage1IsOpened() {
        steps.registrationPage1IsOpened();
    }

    @Then("^Check that 'Email' field is present$")
    public void checkThatEmailFieldIsPresent() {
        steps.checkThatEmailFieldIsPresent();
    }

    @And("^Check that 'SUBMIT' button is present$")
    public void submitButtonIsPresent() {
        steps.submitButtonIsPresent();
    }

    @And("^Check that 'CANCEL' button is present$")
    public void cancelButtonIsPresent() {
        steps.cancelButtonIsPresent();
    }

    @And("^Check that 'Back to authorization' link is present$")
    public void backToAuthorizationLinkIsPresent() {
        steps.backToAuthorizationLinkIsPresent();
    }


    @When("^Check that 'SUBMIT' button is blocked$")
    public void checkThatSUBMITButtonIsBlocked() {
        steps.checkThatSUBMITButtonIsBlocked();
    }

    @When("^User clicks on the 'Cancel' button$")
    public void userClicksOnTheCancelButton() {
        steps.userClicksOnTheCancelButton();
    }

    @Then("^Authorization page is opened$")
    public void authorizationPageIsOpened() throws Throwable {
        steps.authorizationPageIsOpened();
    }

    @When("^User clicks on the 'Back to authorization' link$")
    public void userClicksOnTheBackToAuthorizationLinkButton() {
        steps.userClicksOnTheBackToAuthorizationLink();
    }

    @Then("^User clicks in the 'Email' field and click outside$")
    public void userClicksInTheEmailFieldAndClickOutside() {
        steps.userClicksInTheEmailFieldAndClickOutside();
    }

    @Then("^User enter data \"([^\"]*)\" in the 'Email' field$")
    public void userEnterDataInTheEmailField(String email) throws Throwable {
        steps.userEnterDataInTheEmailField(email);
    }

    @Then("^Error message \"([^\"]*)\" is displayed$")
    public void errorMessageIsDisplayed(String error) throws Throwable {
        steps.errorMessageIsDisplayed(error);
    }

    @And("^Check that 'SUBMIT' button is available$")
    public void checkThatSUBMITButtonIsAvailable() {
        steps.checkThatSUBMITButtonIsAvailable();
    }

    @And("^Check that SUBMIT button is not clickable and User should be on the first registration page$")
    public void checkThatSUBMITButtonIsNotClickable() {
        steps.checkThatSUBMITButtonIsNotClickable();
    }


    @And("^Check that blocked 'Email' field is present$")
    public void checkThatBlockedEmailFieldIsPresent() {
        steps.checkThatBlockedEmailFieldIsPresent();
    }

    @And("^Check that 'Send again' is present$")
    public void checkThatSendAgainIsPresent() {
        steps.checkThatSendAgainIsPresent();
    }

    @And("^Check that 'Email Confirmation code' is present$")
    public void checkThatEmailConfirmationCodeIsPresent() {
        steps.checkThatEmailConfirmationCodeIsPresent();
    }

    @And("^Check that 'Login' is present$")
    public void checkThatLoginIsPresent() {
        steps.checkThatLoginIsPresent();
    }

    @And("^Check that 'Password1' is present$")
    public void checkThatPassword1IsPresent() {
        steps.checkThatPassword1IsPresent();
    }

    @And("^Check that 'Password2' is present$")
    public void checkThatPasswordTwoIsPresent() {
        steps.checkThatPasswordTwoIsPresent();
    }

    @And("^Check that 'SUBMIT' is present$")
    public void checkThatSUBMITButtonIsPresent() {
        steps.checkThatSUBMITButtonIsPresent();
    }

    @And("^Check that 'BTA' link is present$")
    public void checkThatBTALinkIsPresent() {
        steps.checkThatBTALinkIsPresent();
    }

    @And("^User clicks on the Cancel button$")
    public void userClicksOnTheCancelButtonRP2() {
        steps.userClicksOnTheCancelButtonRP2();
    }

    @And("^User enter data \"([^\"]*)\" to 'Login' field$")
    public void userEnterDataToLoginField(String login) throws Throwable {
        steps.userEnterDataToLoginField(login);
    }

    @And("^User enter data \"([^\"]*)\" to 'Password1' field$")
    public void userEnterDataToPasswordOneField(String pass1) throws Throwable {
        steps.userEnterDataToPasswordOneField(pass1);
    }

    @And("^User enter data \"([^\"]*)\" to 'Password2' field$")
    public void userEnterDataToPasswordTwoField(String pass2) throws Throwable {
        steps.userEnterDataToPasswordTwoField(pass2);
    }


    @And("^User enter data \"([^\"]*)\" in the 'Email confirmation code' field$")
    public void userEnterDataInTheEmailConfirmationCodeField(String econf) throws Throwable {
        steps.userEnterDataInTheEmailConfirmationCodeField(econf);
    }

    @Then("^Error message Password must not be the same as your username or email is displayed$")
    public void errorMessagePasswordMustNotBeTheSameAsYourUsernameOrEmailIsDisplayed() {
        steps.errorMessagePasswordMustNotBeTheSameAsYourUsernameOrEmailIsDisplayed();
    }

    @And("^Check that 'Password' is present$")
    public void checkThatPasswordIsPresent() {
        steps.checkThatPasswordIsPresent();
    }

    @And("^Check that 'Remember me' is present$")
    public void checkThatRememberMeIsPresent() {
        steps.checkThatRememberMeIsPresent();
    }

    @And("^Check that 'Forgot your password' is present$")
    public void checkThatForgotYourPasswordIsPresent() {
        steps.checkThatForgotYourPasswordIsPresent();
    }

    @And("^Check that 'SIGN IN' is present$")
    public void checkThatSIGNINIsPresent() {
        steps.checkThatSIGNINIsPresent();
    }

    @And("^Check that 'REGISTER' is present$")
    public void checkThatREGISTERIsPresent() {
        steps.checkThatREGISTERIsPresent();
    }

    @Then("^Check that SIGN IN button is blocked$")
    public void checkThatSIGNINButtonIsBlocked() {
        steps.checkThatSIGNINButtonIsBlocked();
    }

    @Then("^User clicks on the 'Remember me' link$")
    public void userClicksOnTheRememberMeLink() {
        steps.userClicksOnTheRememberMeLink();
    }

    @Then("^User clicks on the 'Forgot your password' link$")
    public void userClicksOnTheForgotYourPasswordLink() {
        steps.userClicksOnTheForgotYourPasswordLink();
    }

    @Then("^Password recovery page1 is opened$")
    public void passwordRecoveryPage1IsOpened() {
        steps.passwordRecoveryPage1IsOpened();
    }

    @Then("^User clicks on the 'REGISTER' link$")
    public void userClicksOnTheREGISTERLink() {
        steps.userClicksOnTheREGISTERLink();
    }

    @And("^Check that 'SIGN IN' button is disabled$")
    public void checkThatSIGNINButtonIsDisabled() {
        steps.checkThatSIGNINButtonIsDisabled();
    }

    @And("^User enter data \"([^\"]*)\" to Password field$")
    public void userEnterDataToPasswordField(String pass) throws Throwable {
        steps.userEnterDataToPasswordField(pass);
    }

    @Then("^Message 'Unauthorized' is displayed$")
    public void messageUnauthorizedIsDisplayed() {
        steps.messageUnauthorizedIsDisplayed();
    }

    @And("^Message of error is displayed$")
    public void messageOfErrorIsDisplayed() {
        steps.messageOfErrorIsDisplayed();
    }

    @Then("^Check that 'Check circle' is not displayed$")
    public void checkThatCheckCircleIsNotDisplayed() {
        steps.checkThatCheckCircleIsNotDisplayed();
    }

    @Then("^User clicks on the 'Show password' button$")
    public void userClicksOnTheShowPasswordButton() {
        steps.userClicksOnTheShowPasswordButton();
    }

    @And("^Check that SEND RESET INSTRUCTIONS button is present$")
    public void checkThatSENDRESETINSTRUCTIONSButtonIsPresent() {
        steps.checkThatSENDRESETINSTRUCTIONSButtonIsPresent();
    }

    @Then("^Check that SEND RESET INSTRUCTIONS button is blocked$")
    public void checkThatSENDRESETINSTRUCTIONSButtonIsBlocked() {
        steps.checkThatSENDRESETINSTRUCTIONSButtonIsBlocked();
    }

    @Then("^Check that 'Generated password' field is present$")
    public void checkThatGeneratedPasswordFieldIsPresent() {
        steps.checkThatGeneratedPasswordFieldIsPresent();
    }

    @And("^Check that 'Password1' field is present$")
    public void checkThatPassword1FieldIsPresent() {
        steps.checkThatPassword1FieldIsPresent();
    }

    @And("^Check that 'Password2' field is present$")
    public void checkThatPassword2FieldIsPresent() {
        steps.checkThatPassword2FieldIsPresent();
    }

    @And("^Check that 'USE GENERATED PASS' button is present$")
    public void checkThatUSEGENERATEDPASSButtonIsPresent() {
        steps.checkThatUSEGENERATEDPASSButtonIsPresent();
    }

    @And("^Check that 'USE CUSTOM PASS' button is present$")
    public void checkThatUSECUSTOMPASSButtonIsPresent() {
        steps.checkThatUSECUSTOMPASSButtonIsPresent();
    }

    @And("^Check that 'USE GENERATED PASS' button is blocked$")
    public void checkThatUSEGENERATEDPASSButtonIsBlocked() {
        steps.checkThatUSEGENERATEDPASSButtonIsBlocked();
    }

    @And("^Check that 'USE CUSTOM PASS' button is blocked$")
    public void checkThatUSECUSTOMPASSButtonIsBlocked() {
        steps.checkThatUSECUSTOMPASSButtonIsBlocked();
    }

    @And("^User enter data \"([^\"]*)\" in the 'USE GENERATED PASS' field$")
    public void userEnterDataInTheUSEGENERATEDPASSField(String gPass) throws Throwable {
        steps.userEnterDataInTheUSEGENERATEDPASSField(gPass);
    }

    @And("^User enter data \"([^\"]*)\" in the 'Password1' field$")
    public void userEnterDataInThePasswordField(String pass1) throws Throwable {
        steps.userEnterDataInThePasswordField(pass1);
    }

    @And("^User enter data \"([^\"]*)\" in the 'Password2' field$")
    public void userEnterDataInThePassword2Field(String pass2) throws Throwable {
        steps.userEnterDataInThePassword2Field(pass2);
    }

    @Then("^Error \"([^\"]*)\" is displayed$")
    public void errorIsDisplayed(String err) throws Throwable {
        steps.errorIsDisplayed(err);
    }

    @And("^User clicks on the 'USE GENERATED PASS' button$")
    public void userClicksOnTheUSEGENERATEDPASSButton() {
        steps.userClicksOnTheUSEGENERATEDPASSButton();
    }

    @Then("^Password recovery page2 is opened$")
    public void passwordRecoveryPage2IsOpened() {
        steps.passwordRecoveryPage2IsOpened();
    }

    @Then("^User clicks on the 'USE CUSTOM PASS' button$")
    public void userClicksOnTheUSECUSTOMPASSButton() {
        steps.userClicksOnTheUSECUSTOMPASSButton();
    }

    @Then("^Check that Left panel is present$")
    public void checkThatLeftPanelIsPresent() {
        steps.checkThatLeftPanelIsPresent();
    }

    @And("^Check that Header is present$")
    public void checkThatHeaderIsPresent() {
        steps.checkThatHeaderIsPresent();
    }

    @And("^Check that Right panel is present$")
    public void checkThatRightPanelIsPresent() {
        steps.checkThatRightPanelIsPresent();
    }

    @And("^Check that Middle element is present$")
    public void checkThatMiddleElementIsPresent() {
        steps.checkThatMiddleElementIsPresent();
    }

    @And("^Check that Footer is present$")
    public void checkThatFooterIsPresent() {
        steps.checkThatFooterIsPresent();
    }

    @And("^Check that 'User menu' is present$")
    public void checkThatUserMenuIsPresent() {
        steps.checkThatUserMenuIsPresent();
    }

    @And("^Check that 'Room-list' is present$")
    public void checkThatRoomListIsPresent() {
        steps.checkThatRoomListIsPresent();
    }

    @And("^Check that 'Direct-list' is present$")
    public void checkThatDirectListIsPresent() {
        steps.checkThatDirectListIsPresent();
    }

    @And("^Check that 'Navigation panel' is present$")
    public void checkThatNavigationPanelIsPresent() {
        steps.checkThatNavigationPanelIsPresent();
    }

    @And("^Check that 'Team name' is present$")
    public void checkThatTeamNameIsPresent() {
        steps.checkThatTeamNameIsPresent();
    }

    @And("^Check that 'Avatar' is present$")
    public void checkThatAvatarIsPresent() {
        steps.checkThatAvatarIsPresent();
    }

    @And("^Check that 'Username' is present$")
    public void checkThatUsernameIsPresent() {
        steps.checkThatUsernameIsPresent();
    }

    @And("^Check that 'Bell' is present$")
    public void checkThatBellIsPresent() {
        steps.checkThatBellIsPresent();
    }

    @And("^Check that 'ROOMS' is present$")
    public void checkThatROOMSIsPresent() {
        steps.checkThatROOMSIsPresent();
    }

    @And("^Check that 'ADD ROOM' is present$")
    public void checkThatADDROOMIsPresent() {
        steps.checkThatADDROOMIsPresent();
    }

    @And("^Check that 'Direct' is present$")
    public void checkThatDirectIsPresent() {
        steps.checkThatDirectIsPresent();
    }

    @And("^Check that 'Add Direct' is present$")
    public void checkThatAddDirectIsPresent() {
        steps.checkThatAddDirectIsPresent();
    }

    @And("^Check that 'General' room is present$")
    public void checkThatGeneralRoomIsPresent() {
        steps.checkThatGeneralRoomIsPresent();
    }

    @And("^Check that 'Search navigation panel' is present$")
    public void checkThatSearchNavigationPanelIsPresent() {
        steps.checkThatSearchNavigationPanelIsPresent();
    }

    @And("^Check that 'Close' button nav panel is present$")
    public void checkThatCloseButtonNavPanelIsPresent() {
        steps.checkThatCloseButtonNavPanelIsPresent();
    }

    @And("^Check that 'Channel-title' is present$")
    public void checkThatChannelTitleIsPresent() {
        steps.checkThatChannelTitleIsPresent();
    }

    @And("^Check that 'Header control' is present$")
    public void checkThatHeaderControlIsPresent() {
        steps.checkThatHeaderControlIsPresent();
    }

    @And("^Check that 'Room members' button is present$")
    public void checkThatRoomMembersButtonIsPresent() {
        steps.checkThatRoomMembersButtonIsPresent();
    }

    @And("^Check that 'Pinned messages' button is present$")
    public void checkThatPinnedMessagesButtonIsPresent() {
        steps.checkThatPinnedMessagesButtonIsPresent();
    }

    @And("^Check that 'Starred messages' button is present$")
    public void checkThatStarredMessagesButtonIsPresent() {
        steps.checkThatStarredMessagesButtonIsPresent();
    }

    @And("^Check that 'Uploaded files' button is present$")
    public void checkThatUploadedFilesButtonIsPresent() {
        steps.checkThatUploadedFilesButtonIsPresent();
    }

    @And("^Check that 'Room settings' is present$")
    public void checkThatRoomSettingsIsPresent() {
        steps.checkThatRoomSettingsIsPresent();
    }

    @And("^Check that 'Input text' field is present$")
    public void checkThatInputTextFieldIsPresent() {
        steps.checkThatInputTextFieldIsPresent();
    }

    @And("^Check that 'Upload' button is present$")
    public void checkThatUploadButtonIsPresent() {
        steps.checkThatUploadButtonIsPresent();
    }

    @And("^Check that 'Stickers' button is present$")
    public void checkThatStickersButtonIsPresent() {
        steps.checkThatStickersButtonIsPresent();
    }

    @And("^Check that 'Emoji' button is present$")
    public void checkThatEmojiButtonIsPresent() {
        steps.checkThatEmojiButtonIsPresent();
    }

    @Then("^User clicks on the 'User menu'$")
    public void userClicksOnTheUserMenu() {
        steps.userClicksOnTheUserMenu();
    }

    @And("^Check that 'Profile' button is present$")
    public void checkThatProfileButtonIsPresent() {
        steps.checkThatProfileButtonIsPresent();
    }

    @And("^Check that 'Sign out' button is present$")
    public void checkThatSignOutButtonIsPresent() {
        steps.checkThatSignOutButtonIsPresent();
    }

    @And("^Check that 'Join another team' button is present$")
    public void checkThatJoinAnotherTeamButtonIsPresent() {
        steps.checkThatJoinAnotherTeamButtonIsPresent();
    }

    @And("^Check that 'Download App' button is present$")
    public void checkThatDownloadAppButtonIsPresent() {
        steps.checkThatDownloadAppButtonIsPresent();
    }

    @And("^User clicks on the 'Profile' button$")
    public void userClicksOnTheProfileButton() {
        steps.userClicksOnTheProfileButton();
    }

    @Then("^'Profile' page is opened$")
    public void profilePageIsOpened() {
        steps.profilePageIsOpened();
    }

    @And("^Check that 'Profile' is present$")
    public void checkThatProfileIsPresent() {
        steps.checkThatProfileIsPresent();
    }

    @And("^Check that 'Account settings' is present$")
    public void checkThatAccountSettingsIsPresent() {
        steps.checkThatAccountSettingsIsPresent();
    }

    @And("^Check that 'Notification settings' is present$")
    public void checkThatNotificationSettingsIsPresent() {
        steps.checkThatNotificationSettingsIsPresent();
    }

    @And("^Check that 'First Name' is present$")
    public void checkThatFirstNameIsPresent() {
        steps.checkThatFirstNameIsPresent();
    }

    @And("^Check that 'Last Name' is present$")
    public void checkThatLastNameIsPresent() {
        steps.checkThatLastNameIsPresent();
    }

    @And("^Check that 'Phone number' is present$")
    public void checkThatPhoneNumberIsPresent() {
        steps.checkThatPhoneNumberIsPresent();
    }

    @And("^Check that 'Skype' is present$")
    public void checkThatSkypeIsPresent() {
        steps.checkThatSkypeIsPresent();
    }

    @And("^Check that 'What I do' is present$")
    public void checkThatWhatIDoIsPresent() {
        steps.checkThatWhatIDoIsPresent();
    }

    @And("^Check that 'Where I am' is present$")
    public void checkThatWhereIAmIsPresent() {
        steps.checkThatWhereIAmIsPresent();
    }

    @And("^Check that 'Time Zone' is present$")
    public void checkThatTimeZoneIsPresent() {
        steps.checkThatTimeZoneIsPresent();
    }

    @And("^Check that 'Avatar big' is present$")
    public void checkThatAvatarBigIsPresent() {
        steps.checkThatAvatarBigIsPresent();
    }

    @And("^Check that 'Change avatar' button is present$")
    public void checkThatChangeAvatarButtonIsPresent() {
        steps.checkThatChangeAvatarButtonIsPresent();
    }

    @And("^Check that 'Save' button is present$")
    public void checkThatSaveButtonIsPresent() {
        steps.checkThatSaveButtonIsPresent();
    }

    @And("^User clicks on the 'Account settings' item$")
    public void userClicksOnTheAccountSettingsItem() {
        steps.userClicksOnTheAccountSettingsItem();
    }

    @Then("^'Account settings' page is opened$")
    public void accountSettingsPageIsOpened() {
        steps.accountSettingsPageIsOpened();
    }

    @And("^Check that 'Email' field AccPage is present$")
    public void checkThatEmailFieldAccPageIsPresent() {
        steps.checkThatEmailFieldAccPageIsPresent();
    }

    @And("^Check that 'Email' field contains \"([^\"]*)\"$")
    public void checkThatEmailFieldContains(String email) throws Throwable {
        steps.checkThatEmailFieldContains(email);
    }

    @And("^Check that 'Username' field is present$")
    public void checkThatUsernameFieldIsPresent() {
        steps.checkThatUsernameFieldIsPresent();
    }

    @And("^Check that 'Username' field contains \"([^\"]*)\"$")
    public void checkThatUsernameFieldContains(String uName) throws Throwable {
        steps.checkThatUsernameFieldContains(uName);
    }

    @And("^Check that 'Old password' field is present$")
    public void checkThatOldPasswordFieldIsPresent() {
        steps.checkThatOldPasswordFieldIsPresent();
    }

    @And("^Check that 'New password' field is present$")
    public void checkThatNewPasswordFieldIsPresent() {
        steps.checkThatNewPasswordFieldIsPresent();
    }

    @And("^User clicks on the 'Notification settings' item$")
    public void userClicksOnTheNotificationSettingsItem() {
        steps.userClicksOnTheNotificationSettingsItem();
    }

    @Then("^'Notification settings' page is opened$")
    public void notificationSettingsPageIsOpened() {
        steps.notificationSettingsPageIsOpened();
    }

    @And("^Check that 'Desktop Notifications' item is present$")
    public void checkThatDesktopNotificationsItemIsPresent() {
        steps.checkThatDesktopNotificationsItemIsPresent();
    }

    @And("^Check that 'Mobile Push Notifications' item is present$")
    public void checkThatMobilePushNotificationsItemIsPresent() {
        steps.checkThatMobilePushNotificationsItemIsPresent();
    }

    @And("^Check that 'Room Specific Settings' item is present$")
    public void checkThatRoomSpecificSettingsItemIsPresent() {
        steps.checkThatRoomSpecificSettingsItemIsPresent();
    }

    @And("^Check that 'Do not disturb' item is present$")
    public void checkThatDoNotDisturbItemIsPresent() {
        steps.checkThatDoNotDisturbItemIsPresent();
    }

    @And("^Check that 'Marking messages as read' item is present$")
    public void checkThatMarkingMessagesAsReadItemIsPresent() {
        steps.checkThatMarkingMessagesAsReadItemIsPresent();
    }

    @And("^User clicks on the 'SIGN OUT' button$")
    public void userClicksOnTheSIGNOUTButton() {
        steps.userClicksOnTheSIGNOUTButton();
    }

    @Then("^User clicks on the 'The Bell' button$")
    public void userClicksOnTheTheBellButton() {
        steps.userClicksOnTheTheBellButton();
    }

    @And("^Check that 'Mute all chat for:' item is present$")
    public void checkThatMuteAllChatForItemIsPresent() {
        steps.checkThatMuteAllChatForItemIsPresent();
    }

    @And("^Check that '20 minutes' item is present$")
    public void checkThat20MinutesItemIsPresent() {
        steps.checkThat20MinutesItemIsPresent();
    }

    @And("^Check that '1 hour' item is present$")
    public void checkThat1HourItemIsPresent() {
        steps.checkThat1HourItemIsPresent();
    }

    @And("^Check that '2 hours' item is present$")
    public void checkThat2HoursItemIsPresent() {
        steps.checkThat2HoursItemIsPresent();
    }

    @And("^Check that '4 hours' item is present$")
    public void checkThat4HoursItemIsPresent() {
        steps.checkThat4HoursItemIsPresent();
    }

    @And("^Check that '8 hours' item is present$")
    public void checkThat8HoursItemIsPresent() {
        steps.checkThat8HoursItemIsPresent();
    }

    @And("^Check that '24 hours' item is present$")
    public void checkThat24HoursItemIsPresent() {
        steps.checkThat24HoursItemIsPresent();
    }

    @And("^Check that 'Notification settings' item is present$")
    public void checkThatNotificationSettingsItemIsPresent() {
        steps.checkThatNotificationSettingsItemIsPresent();
    }

    @And("^User clicks on the 'Notification settings' button$")
    public void userClicksOnTheNotificationSettingsButton() {
        steps.userClicksOnTheNotificationSettingsButton();
    }

    @Then("^User enter data \"([^\"]*)\" in the 'First Name' field$")
    public void userEnterDataInTheFirstNameField(String fname) throws Throwable {
        steps.userEnterDataInTheFirstNameField(fname);
    }

    @Then("^User enter data \"([^\"]*)\" in the 'Last Name' field$")
    public void userEnterDataInTheLastNameField(String lname) throws Throwable {
        steps.userEnterDataInTheLastNameField(lname);
    }

    @Then("^User clicks on the 'Save' button$")
    public void userClicksOnTheSaveButton() {
        steps.userClicksOnTheSaveButton();
    }

    @Then("^Message \"([^\"]*)\" is displayed$")
    public void messageIsDisplayed(String mess) throws Throwable {
        steps.messageIsDisplayed(mess);
    }

    @Then("^User clicks on the 'Arrow Back'$")
    public void userClicksOnTheArrowBack() {
        steps.userClicksOnTheArrowBack();
    }


    @Then("^User refresh the page$")
    public void userRefreshThePage() {
        steps.userRefreshThePage();
    }


    @Then("^Check that entered data \"([^\"]*)\" in the 'First Name' field is saved$")
    public void checkThatEnteredDataInTheFirstNameFieldIsSaved(String fname) throws Throwable {
        steps.checkThatEnteredDataInTheFirstNameFieldIsSaved(fname);
    }

    @And("^Check that entered data \"([^\"]*)\" in the 'Last Name' field is saved$")
    public void checkThatEnteredDataInTheLastNameFieldIsSaved(String lName) throws Throwable {
        steps.checkThatEnteredDataInTheLastNameFieldIsSaved(lName);
    }


    @Then("^Profile page error message \"([^\"]*)\" is displayed$")
    public void profilePageErrorMessageIsDisplayed(String error) throws Throwable {
        steps.profilePageErrorMessageIsDisplayed(error);
    }

    @And("^Check that 'Email' field is present at the 'Account settings' page$")
    public void checkThatEmailFieldIsPresentAtTheAccountSettingsPage() {
        steps.checkThatEmailFieldIsPresentAtTheAccountSettingsPage();
    }

    @And("^Check that 'SAVE' button is blocked$")
    public void checkThatSAVEButtonIsBlocked() {
        steps.checkThatSAVEButtonIsBlocked();
    }

    @And("^User enter data \"([^\"]*)\" in the 'Phone number' field$")
    public void userEnterDataInThePhoneNumberField(String phone) throws Throwable {
        steps.userEnterDataInThePhoneNumberField(phone);

    }

    @Then("^Check that entered data \"([^\"]*)\" in the 'Phone number' field is saved$")
    public void checkThatEnteredDataInThePhoneNumberFieldIsSaved(String phone) throws Throwable {
        steps.checkThatEnteredDataInThePhoneNumberFieldIsSaved(phone);
    }

    @And("^User enter data \"([^\"]*)\" in the 'Skype' field$")
    public void userEnterDataInTheSkypeField(String skype) throws Throwable {
        steps.userEnterDataInTheSkypeField(skype);
    }

    @Then("^Check that entered data \"([^\"]*)\" in the 'Skype' field is saved$")
    public void checkThatEnteredDataInTheSkypeFieldIsSaved(String skype) throws Throwable {
        steps.checkThatEnteredDataInTheSkypeFieldIsSaved(skype);
    }

    @And("^User enter data \"([^\"]*)\" in the 'What I do' field$")
    public void userEnterDataInTheWhatIDoField(String whIdo) throws Throwable {
        steps.userEnterDataInTheWhatIDoField(whIdo);
    }

    @Then("^Check that entered data \"([^\"]*)\" in the 'What I do' field is saved$")
    public void checkThatEnteredDataInTheWhatIDoFieldIsSaved(String whIdo) throws Throwable {
        steps.checkThatEnteredDataInTheWhatIDoFieldIsSaved(whIdo);
    }

    @Then("^Clear all fields 'Profile' page$")
    public void clearAllFieldsProfilePage() {
        steps.clearAllFieldsProfilePage();
    }
}
