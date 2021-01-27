package com.test.sodimac.steps;

import com.test.sodimac.pages.SodimacHomePage;
import com.test.sodimac.pages.SodimacResultsPage;
import net.thucydides.core.annotations.Step;

import static org.junit.Assert.assertTrue;

public class resultsPageSteps {

    SodimacResultsPage sodimacResultsPage;
    
    @Step
    public void isDisplayedFirstResultPrice() {
        assertTrue(sodimacResultsPage.isDisplayedFirstResultPrice());
    }

    @Step
    public String getFirstResultText() {
        return sodimacResultsPage.getFirstResultText();
    }

    @Step
    public void tapFirstResult() {
        sodimacResultsPage.tapFirstResult();
    }
}
