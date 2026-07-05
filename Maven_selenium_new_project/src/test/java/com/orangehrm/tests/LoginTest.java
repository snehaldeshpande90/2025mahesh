package com.orangehrm.tests;
import org.testng.annotations.Test;
import com.base.BaseTest;
import com.orangehrm.pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void verifyLogin() {
        LoginPage lp = new LoginPage(driver);
        // OrangeHRM चा डेमो युजरनेम: Admin आणि पासवर्ड: admin123
        lp.login("Admin", "admin123");
    }
}
