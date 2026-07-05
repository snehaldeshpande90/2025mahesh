
package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.base.BaseTest;
import com.pages.GoogleSearchPage;

public class SearchTest extends BaseTest {

    @Test
    public void verifyGoogleSearch() {
        test = extent.createTest("Google Search POM Test");
        
        driver.get("https://www.google.com");
        GoogleSearchPage searchPage = new GoogleSearchPage(driver);
        
        searchPage.enterSearchText("Selenium Playwright");
        test.info("Entered text in search box");
        
        Assert.assertEquals(driver.getTitle(), "Google");
        test.pass("Title verification passed!");
    }
}