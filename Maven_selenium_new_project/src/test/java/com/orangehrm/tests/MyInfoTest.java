package com.orangehrm.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.base.BaseTest;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.pages.PersonalDetailsPage;

public class MyInfoTest extends BaseTest {

    @Test
    public void verifyPersonalDetailsUpdate() {
        LoginPage lp = new LoginPage(driver);
        lp.login("Admin", "admin123");
        
        // 'My Info' वर क्लिक करा
        driver.findElement(By.linkText("My Info")).click(); 
        
        PersonalDetailsPage personalPage = new PersonalDetailsPage(driver);
        personalPage.updateFirstName("Mahesh");
        personalPage.clickSave();
    }
}