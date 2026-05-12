package test;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class GoogleTest {
    
    WebDriver driver;
    ExtentReports extent;
    ExtentTest test;

    @BeforeSuite
    public void setupReport() {
        ExtentSparkReporter spark = new ExtentSparkReporter("target/ExtentReport.html");
        extent = new ExtentReports();
        extent.attachReporter(spark);
    }

    @Test
    public void testGoogleTitle() {
        test = extent.createTest("Google Title Verification");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        
        driver = new ChromeDriver(options);
        test.info("Browser Started");

        driver.get("https://www.google.com");
        String title = driver.getTitle();
        
        // जाणीवपूर्वक टेस्ट फेल करण्यासाठी खालील ओळ बदलू शकता (उदा. "Google123")
        Assert.assertEquals(title, "Google123"); 
        test.pass("Title Match successfully!");
    }

    @AfterMethod
    public void tearDown(ITestResult result) throws IOException {
        if (result.getStatus() == ITestResult.FAILURE) {
            // १. स्क्रीनशॉट घेणे
            String screenshotPath = captureScreenshot(result.getName());
            
            // २. रिपोर्टमध्ये स्क्रीनशॉट जोडणे
            test.fail("Test Failed: " + result.getThrowable(), 
                MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64Screenshot()).build());
        }
        if (driver != null) {
            driver.quit();
        }
    }

    @AfterSuite
    public void endReport() {
        extent.flush();
    }

    // स्क्रीनशॉटला Base64 फॉरमॅटमध्ये बदलण्याची पद्धत (CI/CD साठी सोपी पद्धत)
    public String getBase64Screenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
    }
    
    public String captureScreenshot(String testName) throws IOException {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String path = "target/" + testName + ".png";
        FileUtils.copyFile(src, new File(path));
        return path;
    }
}