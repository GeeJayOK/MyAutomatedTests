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
}
