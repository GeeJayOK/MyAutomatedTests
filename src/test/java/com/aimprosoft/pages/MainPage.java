package com.aimprosoft.pages;

import com.aimprosoft.ILocators;
import net.thucydides.core.pages.PageObject;


public class MainPage extends PageObject {


    public boolean checkThatLeftPanelIsPresent() {
        return $(ILocators.LEFT_PANEL).isDisplayed();
    }

    public boolean checkThatHeaderIsPresent() {
        return $(ILocators.HEADER).isDisplayed();
    }

    public boolean checkThatRightPanelIsPresent() {
        return $(ILocators.RIGHT_PANEL).isDisplayed();
    }

    public boolean checkThatMiddleElementIsPresent() {
        return $(ILocators.MIDDL).isDisplayed();
    }

    public boolean checkThatFooterIsPresent() {
        return $(ILocators.FOOTER).isDisplayed();
    }

    public boolean checkThatUserMenuIsPresent() {
        return $(ILocators.USR_MENU).isDisplayed();
    }

    public boolean checkThatRoomListIsPresent() {
        return $(ILocators.ROOM_LIST).isDisplayed();
    }

    public boolean checkThatDirectListIsPresent() {
        return $(ILocators.DIRECT_L).isDisplayed();
    }

    public boolean checkThatNavigationPanelIsPresent() {
        return $(ILocators.NAV_PANEL).isDisplayed();
    }

    public void userClicksOnTheUserMenu() {
        $(ILocators.USR_MENU).click();
    }

    public boolean checkThatTeamNameIsPresent() {
        return $(ILocators.TEAMNAME).isDisplayed();
    }

    public boolean checkThatAvatarIsPresent() {
        return $(ILocators.AVATAR).isDisplayed();
    }

    public boolean checkThatUsernameIsPresent() {
        return $(ILocators.USERNAME).isDisplayed();
    }

    public boolean checkThatBellIsPresent() {
        return $(ILocators.BELL).isDisplayed();
    }

    public boolean checkThatROOMSIsPresent() {
        return $(ILocators.ROOMS).isDisplayed();
    }

    public boolean checkThatADDROOMIsPresent() {
        return $(ILocators.ADD_ROOM).isDisplayed();
    }

    public boolean checkThatDirectIsPresent() {
        return $(ILocators.DIRECT).isDisplayed();
    }

    public boolean checkThatAddDirectIsPresent() {
        return $(ILocators.ADD_DIRECT).isDisplayed();
    }

    public boolean checkThatGeneralRoomIsPresent() {
        return $(ILocators.GENERAL).isDisplayed();
    }

    public boolean checkThatSearchNavigationPanelIsPresent() {
        return $(ILocators.NP_SEARCH).isDisplayed();
    }

    public boolean checkThatCloseButtonNavPanelIsPresent() {
        return $(ILocators.NP_CLOSE).isDisplayed();
    }

    public boolean checkThatChannelTitleIsPresent() {
        return $(ILocators.H_TITLE).isDisplayed();
    }

    public boolean checkThatHeaderControlIsPresent() {
        return $(ILocators.H_CNTRL).isDisplayed();
    }

    public boolean checkThatRoomMembersButtonIsPresent() {
        return $(ILocators.RP_ROOM_MEMBERS).isDisplayed();
    }

    public boolean checkThatPinnedMessagesButtonIsPresent() {
        return $(ILocators.RP_PINNED_MESS).isDisplayed();
    }

    public boolean checkThatStarredMessagesButtonIsPresent() {
        return $(ILocators.RP_STARRED_MESS).isDisplayed();
    }

    public boolean checkThatUploadedFilesButtonIsPresent() {
        return $(ILocators.RP_UPLOADED_FILES).isDisplayed();
    }

    public boolean checkThatRoomSettingsIsPresent() {
        return $(ILocators.RP_ROOM_SETTINGS).isDisplayed();
    }

    public boolean checkThatInputTextFieldIsPresent() {
        return $(ILocators.F_INPUT_TEXT).isDisplayed();
    }

    public boolean checkThatUploadButtonIsPresent() {
        return $(ILocators.F_UPLOAD).isDisplayed();
    }

    public boolean checkThatStickersButtonIsPresent() {
        return $(ILocators.F_STICKERS).isDisplayed();
    }

    public boolean checkThatEmojiButtonIsPresent() {
        return $(ILocators.F_EMOJI).isDisplayed();
    }
}
