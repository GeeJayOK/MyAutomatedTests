package com.aimprosoft.steps.serenity;

import com.aimprosoft.ILocators;
import com.aimprosoft.pages.*;
import cucumber.api.java.bs.A;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

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
    public void userClicksOnTheUserMenu() {
        mainPage.userClicksOnTheUserMenu();
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


}