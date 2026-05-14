package com.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.base.BaseTest;
import com.pages.LoginPage;

public class LoginTest extends BaseTest {

    // १. डेटा प्रोव्हायडर तयार करणे
    @DataProvider(name = "loginData")
    public Object[][] getData() {
        return new Object[][] {
            {"Admin", "admin123", "Valid Login"},
            {"InvalidUser", "wrongPass", "Invalid Login"}
        };
    }

    // २. टेस्टला डेटा प्रोव्हायडरशी लिंक करणे
    @Test(dataProvider = "loginData")
    public void verifyLogin(String username, String password, String scenarioType) {
        test = extent.createTest("OrangeHRM Scenario: " + scenarioType);
        
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        test.info("Navigated to OrangeHRM for " + scenarioType);

        LoginPage lp = new LoginPage(driver);
        lp.login(username, password);
        test.info("Entered " + username + " as username.");

        if (scenarioType.equals("Valid Login")) {
            Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
            test.pass("Valid login successful and reached dashboard.");
        } else {
            // इनवॅलिड लॉगिनसाठी पेज त्याच URL वर राहील हे तपासणे
            Assert.assertTrue(driver.getCurrentUrl().contains("login"));
            test.pass("Invalid login handled correctly.");
        }
    }
}