package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions; // ही ओळ जोडा
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest {
    @Test
    public void testGoogleTitle() {
        // हेडलेस मोड सेट करण्यासाठी खालील ३ ओळी जोडा
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); 
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        WebDriver driver = new ChromeDriver(options); // 'options' इथे पास करा
        
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        Assert.assertEquals(title, "Google");
        System.out.println();
        driver.quit();
        
    }
}