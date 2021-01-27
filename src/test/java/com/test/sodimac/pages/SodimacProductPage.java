package com.test.sodimac.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SodimacProductPage extends pageDefinitions{

    @FindBy(xpath = "/html/body/div[1]/div/div/div[4]/div[2]/div[1]/div[2]/div[2]/div/div/div/span[1]")
    private WebElement precio;

    public boolean isDisplayedWithtextFirstResultPrice(String text) {
        return isDisplayedWithText(precio, text);
    }
}
