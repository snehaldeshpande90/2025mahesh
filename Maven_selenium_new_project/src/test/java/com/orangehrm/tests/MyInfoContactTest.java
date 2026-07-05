package com.orangehrm.tests;

import com.base.BaseTest;
import com.orangehrm.pages.ContactDetailsPage;
import org.testng.annotations.Test;

public class MyInfoContactTest extends BaseTest {
    @Test
    public void verifyContactDetailsUpdate() {
        ContactDetailsPage contactPage = new ContactDetailsPage(driver);
        contactPage.updateStreetAddress("Kharadi, Pune");
        contactPage.clickSave();
    }
}