package com.orangehrm.tests; // हे पॅकेज ओळखून घेते

import org.openqa.selenium.By; // सेलेनियममधील बाय क्लास इम्पोर्ट करतो
import org.testng.annotations.Test; // टेस्टएनजीमधील टेस्ट ॲनोटेशन इम्पोर्ट करतो
import com.base.BaseTest; // बेस क्लास इम्पोर्ट करतो
import com.orangehrm.pages.LoginPage; // लॉगिन पेज क्लास इम्पोर्ट करतो
import com.orangehrm.pages.PersonalDetailsPage; // पर्सनल डिटेल्स पेज क्लास इम्पोर्ट करतो

public class MyInfoTest extends BaseTest { // BaseTest कडून गुणधर्म घेणारा टेस्ट क्लास

    @Test // ही एक टेस्ट केस आहे असे दर्शवतो
    public void verifyPersonalDetailsUpdate() { // टेस्ट केसचे नाव
        
        // १. लॉगिन करा
        LoginPage lp = new LoginPage(driver); // लॉगिन पेजचा ऑब्जेक्ट बनवतो
        lp.login("Admin", "admin123"); // लॉगिन मेथड कॉल करतो
        
        // २. 'My Info' वर क्लिक करा
        driver.findElement(By.linkText("My Info")).click(); // 'My Info' लिंक शोधून त्यावर क्लिक करतो
        
        // ३. पर्सनल डिटेल्स अपडेट करा
        PersonalDetailsPage personalPage = new PersonalDetailsPage(driver); // पर्सनल डिटेल्स पेजचा ऑब्जेक्ट बनवतो
        personalPage.updateFirstName("Mahesh"); // नाव बदलण्यासाठी मेथड कॉल करतो
        personalPage.clickSave(); // सेव्ह बटणावर क्लिक करतो
    }
}