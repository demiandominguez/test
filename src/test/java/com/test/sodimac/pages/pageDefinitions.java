package com.test.sodimac.pages;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class pageDefinitions extends PageObject {
    public static final Logger LOGGER = LoggerFactory.getLogger(pageDefinitions.class);

    static{
        LOGGER.info("Platform is firefox " + isFirefox());
        LOGGER.info("Platform is chrome " + isChrome());
    }

    public static boolean isChrome(){
        return System.getProperty("testPlatform").contains("chrome");
    }

    public static boolean isFirefox(){
        return System.getProperty("testPlatform").contains("firefox");
    }

    public WebElement waitForElementToBeVisible(WebElement element){
        return waitForElementToBeVisible(element, 3);
    }
    public WebElement waitForElementToBeVisible(WebElement element, int seconds){
        WebDriverWait wait = new WebDriverWait(getDriver(), seconds);
        wait.until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public WebElement waitForElementToBeClickable(WebElement element){ return waitForElementToBeClickable(element, 3); }
    public WebElement waitForElementToBeClickable(WebElement element, int seconds){
        WebDriverWait wait = new WebDriverWait(getDriver(), seconds);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }

    public boolean isDisplayed(WebElement element) {
            return waitForElementToBeVisible(element).isDisplayed();
    }

    public boolean hasText(WebElement element, String text){
        return element.getText().toUpperCase().equals(text.toUpperCase());
    }

    public boolean isDisplayedWithText(WebElement element, String text){
        return isDisplayed(element) && hasText(element, text);
    }

    public void type(WebElement element, String text) {
        if(isDisplayed(element)){
            waitForElementToBeVisible(element).sendKeys(text);
        }
    }

    public void tap(WebElement element) {
            waitForElementToBeClickable(element).click();
    }

}
