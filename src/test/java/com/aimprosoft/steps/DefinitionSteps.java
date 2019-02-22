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

    @Given("^User go to the \"([^\"]*)\" page$")
    public void userGoToThePage(String arg0) throws Throwable {
        steps.userGoToThePage(arg0);
    }

    @Then("^User is on the Authorization page$")
    public void userIsOnTheAuthorizationPage() throws Throwable {
        steps.userIsOnTheAuthorizationPage();
    }

    @When("^user clicks on the register link$")
    public void userClicksOnTheRegisterLink() {
        steps.userClicksOnTheRegisterLink();
    }

    @Then("^registration form title is present$")
    public void registrationFormTitleIsPresent() {
        steps.registrationFormTitleIsPresent();
    }


    @Given("^Registration page \"([^\"]*)\" is opened$")
    public void registrationPageIsOpened(String url) throws Throwable {
        steps.registrationPageIsOpened(url);
    }

    @Then("^User clicks on the Submit button$")
    public void userClicksOnTheSubmitButton() {
        steps.userClicksOnTheSubmitButton();
    }

    @Then("^Second registration page is opened$")
    public void secondRegistrationPageIsOpened() {
        steps.secondRegistrationPageIsOpened();
    }


    @When("^User perform login with \"([^\"]*)\" email and \"([^\"]*)\" password in the \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userPerformLoginWithEmailAndPasswordInTheAnd(String arg0, String arg1, String arg2, String arg3) throws Throwable {
        steps.userPerformLoginWithEmailAndPassword(arg0, arg1, arg2, arg3);
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

    @Given("^user go to Registration page one \"([^\"]*)\"$")
    public void userGoToRegistrationPageOne(String arg0) throws Throwable {
        steps.secondRegistrationPageIsOpened();
    }

    @Given("^User go to Registration \"([^\"]*)\" page$")
    public void userGoToRegistrationPage(String arg0) throws Throwable {
        steps.firstRegistrationPageIsOpen(arg0);
    }

    @When("^First registration page is opened$")
    public void firstRegistrationPageIsOpened() {
        steps.firstRegistrationPageIsOpened();
    }

    @Then("^Check that Email field is present$")
    public void checkThatEmailFieldIsPresent() {
        steps.checkThatEmailFieldIsPresent();
    }

    @And("^SUBMIT button is present$")
    public void submitButtonIsPresent() {
        steps.submitButtonIsPresent();
    }

    @And("^CANCEL button is present$")
    public void cancelButtonIsPresent() {
        steps.cancelButtonIsPresent();
    }

    @And("^'Back to authorization' link is present$")
    public void backToAuthorizationLinkIsPresent() {
        steps.backToAuthorizationLinkIsPresent();
    }


    @When("^Check that SUBMIT button is blocked$")
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
    public void userEnterDataInTheEmailField(String arg0) throws Throwable {
        steps.userEnterDataInTheEmailField(arg0);
    }

    @Then("^Error message \"([^\"]*)\" is displayed$")
    public void errorMessageIsDisplayed(String arg0) throws Throwable {
        steps.errorMessageIsDisplayed(arg0);
    }

    @And("^Check that SUBMIT button is available$")
    public void checkThatSUBMITButtonIsAvailable() {
        steps.checkThatSUBMITButtonIsAvailable();
    }

    @And("^Check that SUBMIT button is not clickable and User should be on the first registration page$")
    public void checkThatSUBMITButtonIsNotClickable() {
        steps.checkThatSUBMITButtonIsNotClickable();
    }


    @And("^Check that blocked Email field is present$")
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

    @And("^Check that PasswordOne is present$")
    public void checkThatPasswordOneIsPresent() {
        steps.checkThatPasswordOneIsPresent();
    }

    @And("^Check that PasswordTwo is present$")
    public void checkThatPasswordTwoIsPresent() {
        steps.checkThatPasswordTwoIsPresent();
    }

    @And("^Check that SUBMIT button is present$")
    public void checkThatSUBMITButtonIsPresent() {
        steps.checkThatSUBMITButtonIsPresent();
    }

    @And("^Check that BTA link is present$")
    public void checkThatBTALinkIsPresent() {
        steps.checkThatBTALinkIsPresent();
    }

    @And("^User clicks on the Cancel button$")
    public void userClicksOnTheCancelButtonRP2() {
        steps.userClicksOnTheCancelButtonRP2();
    }

    @And("^User enter data \"([^\"]*)\" to Login field$")
    public void userEnterDataToLoginField(String arg0) throws Throwable {
        steps.userEnterDataToLoginField(arg0);
    }

    @And("^User enter data \"([^\"]*)\" to PasswordOne field$")
    public void userEnterDataToPasswordOneField(String arg0) throws Throwable {
        steps.userEnterDataToPasswordOneField(arg0);
    }

    @And("^User enter data \"([^\"]*)\" to PasswordTwo field$")
    public void userEnterDataToPasswordTwoField(String arg0) throws Throwable {
        steps.userEnterDataToPasswordTwoField(arg0);
    }


    @And("^User enter data \"([^\"]*)\" in the 'Email confirmation code' field$")
    public void userEnterDataInTheEmailConfirmationCodeField(String arg0) throws Throwable {
        steps.userEnterDataInTheEmailConfirmationCodeField(arg0);
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
    public void userEnterDataToPasswordField(String arg0) throws Throwable {
        steps.userEnterDataToPasswordField(arg0);
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
    public void userEnterDataInTheUSEGENERATEDPASSField(String arg0) throws Throwable {
        steps.userEnterDataInTheUSEGENERATEDPASSField(arg0);
    }

    @And("^User enter data \"([^\"]*)\" in the 'Password1' field$")
    public void userEnterDataInThePasswordField(String arg0) throws Throwable {
        steps.userEnterDataInThePasswordField(arg0);
    }

    @And("^User enter data \"([^\"]*)\" in the 'Password2' field$")
    public void userEnterDataInThePassword2Field(String arg0) throws Throwable {
        steps.userEnterDataInThePassword2Field(arg0);
    }

    @Then("^Error \"([^\"]*)\" is displayed$")
    public void errorIsDisplayed(String arg0) throws Throwable {
        steps.errorIsDisplayed(arg0);
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
}
