package com.aimprosoft.pages;

import net.serenitybdd.core.pages.PageObject;

public class CommonElements extends PageObject {
    public void waitUntilElementToBeInvisible(int waitSec, String xpath) {

        int counter = 0;
        while ((findBy(xpath).isVisible()) && (counter <= 20)) {
            waitABit(waitSec);
            counter++;
        }
    }

    public void waitUntilElementToBeVisible(int waitSec, String xpath) {
        waitABit(250);
        int counter = 0;
        while (!(findBy(xpath).isVisible()) && (counter < 5)) {
            waitABit(waitSec);
            counter++;

        }

    }
}
