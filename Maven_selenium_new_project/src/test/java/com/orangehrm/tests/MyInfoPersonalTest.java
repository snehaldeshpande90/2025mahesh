package com.orangehrm.tests;

import com.base.BaseTest;
import com.orangehrm.pages.PersonalDetailsPage;
import org.testng.annotations.Test;

public class MyInfoPersonalTest extends BaseTest {
    @Test
    public void verifyPersonalDetailsUpdate() {
        PersonalDetailsPage personalPage = new PersonalDetailsPage(driver);
        personalPage.updateFirstName("Mahesh");
        personalPage.clickSave();
    }
}