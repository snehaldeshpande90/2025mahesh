package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.base.BaseTest;
import com.pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void verifyLogin() {
        test = extent.createTest("OrangeHRM Login Test");
        
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        test.info("Navigated to OrangeHRM");

        LoginPage lp = new LoginPage(driver);
        // डमी क्रेडेन्शियल्स
        lp.login("Admin", "admin123");
        test.info("Login details entered");

        // लॉगिन नंतर डॅशबोर्ड टायटल तपासणे
        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
        test.pass("Login Successful!");
    }
}