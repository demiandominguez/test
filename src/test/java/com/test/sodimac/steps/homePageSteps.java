package com.test.sodimac.steps;

import com.test.sodimac.pages.SodimacHomePage;
import net.thucydides.core.annotations.Step;

import static org.junit.Assert.assertTrue;

public class homePageSteps {

    SodimacHomePage sodimacHomePage;
    
    @Step
    public void isDisplayedSearchField() {
        assertTrue(sodimacHomePage.isDisplayedSearchField());
    }

    @Step
    public void typeSearchField(String text) {
        sodimacHomePage.typeSearchField(text);
    }

    @Step
    public void tapSearchField() {
        sodimacHomePage.tapSearchField();
    }

    @Step
    public void navegoALaHome(String s) {
        sodimacHomePage.navigateToHome("https://www.sodimac.cl/sodimac-cl/");
    }

    @Step
    public void closePopUp() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step
    public void search() {
        sodimacHomePage.search();
    }

    @Step
    public void isDisplayedSearchButton() {
        assertTrue(sodimacHomePage.isDisplayedSearchButton());
    }

    @Step
    public void isDisplayedWithTextSearchButton(String text) {
        assertTrue(sodimacHomePage.isDisplayedWithTextSearchButton(text));
    }


    @Step
    public void typeSearchButton(String text) {
        sodimacHomePage.typeSearchButton(text);
    }

    @Step
    public void tapSearchButton() {
        sodimacHomePage.tapSearchButton();
    }
}
