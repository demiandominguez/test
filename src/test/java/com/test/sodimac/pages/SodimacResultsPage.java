package com.test.sodimac.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SodimacResultsPage extends pageDefinitions{

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div[3]/div[4]/div[1]/div[4]/div[1]/div/div[6]/div/div[3]/div/div/span[1]")
    private WebElement firstPrice;

    @FindBy(xpath = "//*[contains(@class,'product-image')]")
    private WebElement firstImage;

    public boolean isDisplayedFirstResultPrice() {
        return isDisplayed(firstPrice);
    }

    public String getFirstResultText() {
        return firstPrice.getText();
    }

    public void tapFirstResult() {
        tap(firstImage);
    }
}
