package com.test.sodimac.steps;

import com.test.sodimac.pages.SodimacHomePage;
import com.test.sodimac.pages.SodimacProductPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.junit.Assert.assertTrue;

public class productPageSteps extends ScenarioSteps {

    private SodimacProductPage sodimacProductPage;

    @Step
    public void isDisplayedWithTextFirstResultPrice(String text) {
        assertTrue(sodimacProductPage.isDisplayedWithtextFirstResultPrice(text));
    }
}
