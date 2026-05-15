package com.tests;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.base.BaseTest;
import com.pages.LoginPage;
import com.utils.ExcelUtils; // Excel reading utility class

public class LoginTest extends BaseTest {

    // १. प्रोफेशनल डेटा प्रोव्हायडर (Excel मधून डेटा वाचण्यासाठी)
    @DataProvider(name = "loginData")
    public Object[][] getData() throws IOException {
        
        // फाईलचा अचूक पाथ (image_a2e656.jpg नुसार)
    	String path = System.getProperty("user.dir") + "/src/test/resources/TestData.xlsx";
        String sheetName = "Sheet1";

        int totalRows = ExcelUtils.getRowCount(path, sheetName);
        int totalCols = ExcelUtils.getCellCount(path, sheetName, 1);

        Object[][] loginData = new Object[totalRows][totalCols];

        // रो १ पासून डेटा वाचणे सुरू करा (रो ० मध्ये हेडर्स आहेत)
        for (int i = 1; i <= totalRows; i++) {
            for (int j = 0; j < totalCols; j++) {
                loginData[i - 1][j] = ExcelUtils.getCellData(path, sheetName, i, j);
            }
        }
        return loginData;
    }

    // २. टेस्टला डेटा प्रोव्हायडरशी लिंक करणे
    @Test(dataProvider = "loginData")
    public void verifyLogin(String username, String password, String scenarioType) {
        test = extent.createTest("OrangeHRM Scenario: " + scenarioType);
        
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        test.info("Navigated to OrangeHRM for " + scenarioType);

        LoginPage lp = new LoginPage(driver);
        lp.login(username, password);
        test.info("Attempting login with username: " + username);

        // लॉजिक: युजरनेम आणि पासवर्डनुसार निकाल तपासणे
        if (scenarioType.equalsIgnoreCase("Valid Login")) {
            Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Dashboard URL mismatch!");
            test.pass("Valid login successful and reached dashboard.");
        } else {
            // इनवॅलिड लॉगिनसाठी पेज लॉगिनवरच राहते का ते तपासणे
            Assert.assertTrue(driver.getCurrentUrl().contains("login"), "Still not on login page!");
            test.pass("Invalid login handled correctly as expected.");
        }
    }
}