package com.test.sodimac.pages;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SodimacHomePage extends pageDefinitions{

    @FindBy(xpath = "(//input)[1]")
    private WebElement searchField;

    @FindBy(xpath = "//*[contains(@class,\"DesktopSearchBar-module_lens-icon__2x7d_\")]")
    private WebElement searchButton;

    public boolean isDisplayedSearchField() {
        LOGGER.info("Validando visibilidad de searchField");
        return isDisplayed(searchField);
    }

    public void typeSearchField(String text) {
        LOGGER.info("Escribiendo en searchField");
        type(searchField, text);
    }

    public void tapSearchField() {
        LOGGER.info("Tap en searchField");
        tap(searchField);
    }

    public void navigateToHome(String s) {
        getDriver().navigate().to("https://www.sodimac.cl/sodimac-cl/");
    }

    public void search() {
        searchField.sendKeys(Keys.RETURN);
    }

    public boolean isDisplayedSearchButton() {
        LOGGER.info("Validando visibilidad de searchButton");
        return isDisplayed(searchButton);
    }

    public boolean isDisplayedWithTextSearchButton(String text) {
        LOGGER.info("Validando visibilidad de searchButton con texto " + text);
        return isDisplayedWithText(searchButton, text);
    }

    public void typeSearchButton(String text) {
        LOGGER.info("Escribiendo en searchButton");
        type(searchButton, text);
    }

    public void tapSearchButton() {
        LOGGER.info("Tap en searchButton");
        tap(searchButton);
    }
}
