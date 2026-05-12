package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class GoogleTest {
    
    ExtentReports extent;
    ExtentTest test;

    @BeforeSuite
    public void setupReport() {
        // रिपोर्ट फाईल कुठे सेव्ह करायची ते सांगणे
        ExtentSparkReporter spark = new ExtentSparkReporter("target/ExtentReport.html");
        extent = new ExtentReports();
        extent.attachReporter(spark);
    }

    @Test
    public void testGoogleTitle() {
        test = extent.createTest("Google Title Verification"); // रिपोर्टमध्ये टेस्टचे नाव

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        
        WebDriver driver = new ChromeDriver(options);
        test.info("Browser Started");

        driver.get("https://www.google.com");
        String title = driver.getTitle();
        test.info("Navigated to Google, Title is: " + title);

        Assert.assertEquals(title, "Google");
        test.pass("Title Match successfully!");

        driver.quit();
    }

    @AfterSuite
    public void tearDown() {
        // रिपोर्ट लिहून पूर्ण करणे (हे अत्यंत महत्त्वाचे आहे)
        extent.flush();
    }
}